package com.yedam.student;

public class StudentExe {
	public static void main(String[] args) {
		Student s1 = new Student("S001"); // 실체생성(인스턴스 생성)
		s1.studentName = "홍길동";
		s1.studentEng = 60;
		s1.studentMath = 70;
		
		System.out.println(s1.studentId + ", " + s1.studentName 
				+ "의 합계점수는 " + s1.sumScore()
				+ " 평균은 " + s1.average()
		);
		
		Student s2 = new Student("S002", "김길동");
		s2.studentEng = 70;
		s2.studentMath = 75;
		System.out.println(s2.studentId + ", " + s2.studentName + "의 합계점수는 " + s2.sumScore() + " 평균은 " + s2.average());
		
		Student s3 = new Student("S003", "이길동", 80, 90); 
		System.out.println(s3.studentId + ", " + s3.studentName + ", eng: " + s3.studentEng + ", math: " + s3.studentMath + " 평균은 " + s3.average());
		
		
		System.out.println(s1 == s2);
		
		int num = 100;
		
	}
}
