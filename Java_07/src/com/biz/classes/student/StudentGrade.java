package com.biz.classes.student;

public class StudentGrade {

		
		
		public String strNum;
		public String strName;
		public String strEntyear;
		public String strMajor;
		public String strLevel;
		
		public void stdList() {
			
			System.out.printf("%s\t%s\t%s\t%s  %s\n",
					strNum,
					strName,
					strEntyear,
					strMajor,
					strLevel);
				
		
			
				
		}
		int thisyear = 2019;
		int entyear = 2018;
		public void year() {
			int level =  thisyear - entyear;
			System.out.println(level + "학년");
		
		}
	}

