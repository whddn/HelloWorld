package com.yedam.student;
/*
 * 학생의 성적관리 Prog.
 * 학생번호, 학생이름, 영어점수, 수학점수
 * 
 */

public class Student {
	public String studentId; //필드
	public String studentName;
	public int studentEng;
	public int studentMath;
	
	// 컴파일러가 기본 생성자를 만들어준다
//	public Student() {	}
	
	public Student(String studentId) {
		this.studentId = studentId;
	}
	
	public Student(String studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public Student(String studentId, String studentName, int studentEng, int studentMath) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEng = studentEng;
		this.studentMath = studentMath;
	}

	// 메소드.
	public void smile() {
		System.out.println("학생들이 웃습니다");
	}
	public void introduce() {
		System.out.println("이름은 " + studentName + "이고 학번은 " + studentId);
	}
	
	public int sumScore() {
		return studentEng + studentMath;
	}
	
	// 평균을 반환하는 메소드: average(){}
	public double average() {
		return (double)(studentEng + studentMath) / 2;
	}
	
	
}
