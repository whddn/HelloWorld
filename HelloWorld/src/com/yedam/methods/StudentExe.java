package com.yedam.methods;

public class StudentExe {
	public static void main(String[] args) {
		Student s1 = new Student("S001");
//		
//		s1.setStudentEng(1000);
//		s1.setStudentId("S002");
		s1.setStudentName("홍길동");
		s1.setStudentEng(70);
		s1.setStudentMath(75);
		
		System.out.println(s1.showInfo());
	}
}
