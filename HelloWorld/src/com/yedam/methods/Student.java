package com.yedam.methods;

public class Student {

	private String studentId; // 필드
	private String studentName;
	private int studentEng;
	private int studentMath;

	// 생성자. => 인스턴스를 생성하면서 필드의 값을 초기화해주는 기능
	public Student(String studentId) {
		this.studentId = studentId;
	}
	public Student(String studentId, String studentName, int studentEng, int studentMath) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEng = studentEng;
		this.studentMath = studentMath;
	}

	// getter, setter. 메소드
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentEng() {
		return studentEng;
	}

	public void setStudentEng(int studentEng) {
		this.studentEng = studentEng;
	}

	public int getStudentMath() {
		return studentMath;
	}

	public void setStudentMath(int studentMath) {
		this.studentMath = studentMath;
	}

	// showInfo()
	public String showInfo() {
		return "학번: " + studentId + ", 이름: " + studentName + ", 영어: " + studentEng + ", 수학: " + studentMath;
		
	}
	
}
