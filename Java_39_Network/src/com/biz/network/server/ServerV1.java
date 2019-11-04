package com.biz.network.server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerV1 {

	public static void main(String[] args) throws IOException {
		
		// socket을 만들고
		// 포트 설정 = 8085
		ServerSocket server = new ServerSocket(8085);
		
		// 누군가 나를 불러줄 때 까지 기다리기 = accept = listen(Blocking 상태)
		System.out.println("Wait......");
		
		// 누군가 접속을 한 후에 listen을 생성하고
		// ip주소와 port번호를 저장함
		Socket listen = server.accept();
		
		System.out.println("Connected with : " + listen.getInetAddress());
		System.out.println("Port : " + listen.getLocalPort());
		
		while(true) {
			
			// socket으로부터 InputStream정보를 가져옴
			// 값을 수신할 준비
			InputStream is = listen.getInputStream();
			
			// 값을 수신할 buffer변수를 선언
			// 한번에 255byte씩 가져오겠다(이 값보다 크면 중간에 깨짐 보통 test시 255를 많이 사용)
			byte[] msg = new byte[255];
			
			// buffer만큼 데이터를 수신하기
			int msgSize = is.read(msg);
			
			// 수신한 데이터를 다시 UTF-8로 decoding
			// msg의 0번부터 size개수만큼 읽어서 utf-8로 변경하라
			String reader = new String(msg,0,msgSize,"UTF-8");
			
			System.out.println(">> " + reader);
		
		}
		
		
		// OutputStream os = listen.getOutputStream();
		// DataOutputStream dos = new DataOutputStream(os);
		
		
	}
	
	
}
