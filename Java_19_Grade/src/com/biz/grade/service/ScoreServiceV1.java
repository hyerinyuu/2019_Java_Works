package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.utill.ScoreIDX;

public class ScoreServiceV1 {

	private Map<String, ScoreVO> scList;
	
	public ScoreServiceV1() {
		// [HashMap]
		// 추가된 순서에 관계 없이 내부 알고리즘에 따라 순서가 정해져 임의로 순서를 바꾸기 애매함
		scList = new HashMap<String, ScoreVO>();
	
		// [LinkedHashMap]
		// java1.4 이상에서 새로 추가된 class
		// 추가된 순서를 유지하도록 하기 위한 방법
		scList = new LinkedHashMap<String, ScoreVO>();
	
		// [TreeMap]
		// key 값을 기준으로 오름차순으로 정렬함
		scList = new TreeMap<String, ScoreVO>();
		
	}

	// 외부에서 scList를 가져가서 사용할 수 있도록 
	// 추출하는 통로를 선언
	public Map<String, ScoreVO> getScList() {
		return this.scList;
		
	}
	
	/*
	 * ScoreFileName 파일을 읽고 데이터를 생성해 scList에 추가하는 코드를 작성하기
	 */
	public void read(String scoreFileName) throws Exception {
		
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(scoreFileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			
			reader = buffer.readLine();
			if(reader == null) break;
			String[] scs = reader.split(":");
			
			// 4개의 매개변수를 받아서 학번, 국어 ,영어, 수학 점수를 초기화 하는 생성자를 만들고 
			// 그 생성자를 이용해 sVO를 생성하면서 각 값을 세팅
			try {
				ScoreVO sVO 
			= new ScoreVO(scs[ScoreIDX.NUM],
					Integer.valueOf(scs[ScoreIDX.KOR]),
					Integer.valueOf(scs[ScoreIDX.KOR]),
					Integer.valueOf(scs[ScoreIDX.KOR]));
			
			scList.put(scs[ScoreIDX.NUM], sVO);
			
			}catch (Exception e) {
				System.out.println(scs[ScoreIDX.NUM] + "학생 성적을 확인해주세요");
			}
		}// end while
		buffer.close();
		fileReader.close();
	} // end read()
	
	public void list() {
		/*
		 * Collections 자료형의 반복문을 도와주는 class
		 * Iterator를 사용하면 while()반복문을 사용하여 리스트를 처리할 수 있다.
		 */
		
		// key들을 추출하여 Set list로 생성 
		Set<String> _s = scList.keySet();
		
		// key들을 추출한 Set list를 Iterator 형으로 변환
		Iterator<String> _list = scList.keySet().iterator();
		
		System.out.println("=============================");
		System.out.println("성적일람표");
		System.out.println("=============================");
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("-----------------------------");
		
		// Iterator의 hasNext() method는 Iterator의 리스트에 아직 읽을 데이터가 있느냐를 물어보는 것임
		while(_list.hasNext()) {
			
			// 읽을 데이터가 있으면 next() method를 호출해 값을 읽음
			
			// 이 값은 실제로 scList의 key값중의 한가지가 되고,
			// 그 key값으로 ScoreVO를 추출해 scVO에 담아라는 의미
			ScoreVO scVO = scList.get(_list.next());
			
			System.out.print(scVO.getNum() + "\t");
			System.out.print(scVO.getKorScore() + "\t");
			System.out.print(scVO.getMathScore() + "\t");
			System.out.print(scVO.getEngScore() + "\n");
			
		}
		System.out.println("=============================");
	}
	
	public void total() {
		
		Set<String> keys = scList.keySet();
		for(String key : keys) {
			ScoreVO scVO = scList.get(key);
			int total = scVO.getKorScore();
			total += scVO.getEngScore();
			total += scVO.getMathScore();
			
			scVO.setSumScore(total);
			scVO.setAverage(total / 3); 
		
		}
	}
	
	public void listTotal() {
		
		Set<String> keys = scList.keySet();
		System.out.println("=============================");
		System.out.println("총점리스트");
		System.out.println("=============================");
		System.out.println("학번\t총점\t평균");
		System.out.println("-----------------------------");
		
		for(String key : keys) {
		
			ScoreVO sVO = scList.get(key);
			System.out.printf("%5s\t%5d\t%5.1f\n",
					sVO.getNum(), sVO.getSumScore(), sVO.getAverage());
		}
		System.out.println("=============================");
	}
	
	/*
	 * scList를 총점 기준으로 내림차순 정렬한 후
	 * rank 필드에 순서대로 숫자를 추가하여 석차를 표기하기
	 * (단, 동점자 처리는 무시한다.)
	 */
	/*
	 * 데이터가 Map 구조로 저장되어 있는 경우
	 * Map key값으로 정렬하는 것은 크게 문제가 없으나
	 * value 값으로 정렬하기 위해서는 몇가지 절차가 필요함.
	 * 
	 * 1. Map의 value 전체를 추출하여 List로 변환
	 * 2. List를 정렬하고, 연산을 수행한 다음
	 * 3. 다시 List를 Map에 업데이트 해준다. 
	 * 
	 */
	public void rank() {
		
		// 1. Map 데이터에서 value 전체를 추출하여
		// list(sortList)로 변환
		// linkedList를 이용해서(ArrayList도 상관없는데 linKedList가 더 효율적임)
		
		List<Map.Entry<String, ScoreVO>> sortList 
			= new LinkedList<Map.Entry<String, ScoreVO>>(scList.entrySet());
		
		// List<Map.Entry<String,StudentVO>> stdList
		//	= new LinkedList<Map.Entry<String, StudentVO>(stdList.entrySet())>;
		
		sortList
		= new LinkedList<>(scList.entrySet());
		
		Collections.sort(sortList, new Comparator<Map.Entry<String, ScoreVO>>() {

			@Override
			public int compare(Entry<String, ScoreVO> o1, Entry<String, ScoreVO> o2) {
				
				return o2.getValue().getSumScore() - o1.getValue().getSumScore();
			}
		
		
		});
		// 성적순으로 내림차순 정렬 후에 rank 멤버변수에 석차 값을 setting하는 코드
		int rank = 0;
		for(Map.Entry<String, ScoreVO> vo : sortList) {
			vo.getValue().setRank(++rank);
			System.out.println(vo.getValue().toString());
			
		}
		
	}
	
}
