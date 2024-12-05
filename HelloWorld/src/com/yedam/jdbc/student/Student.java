package com.yedam.jdbc.student;

/*
 * tbl_student의 칼럼을 필드로 선언
 * std_no => stdNo
 */

public class Student {
	private String stdNo;
	private String stdName;
	private String stdPhone;
	private int engScore;
	private int mathScore;
	
	public Student () {
		
	}
	public Student(String stdNo, String stdName, String stdPhone) {
		super();
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.stdPhone = stdPhone;
	}
	
	public Student(String stdNo, int engScore, int mathScore) {
		super();
		this.stdNo = stdNo;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	public Student(String stdNo, String stdName, String stdPhone, int engScore, int mathScore) {
		super();
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.stdPhone = stdPhone;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	
	public String getStdNo() {
		return stdNo;
	}
	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdPhone() {
		return stdPhone;
	}
	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	// 목록으로 출력
	public String showInfo() {
		return " " + stdNo + "  " + stdName + "  " + stdPhone;
	}
	
	public String showDetail() {
		String result = "-------------------\n";
		result += "학생번호: " + stdNo + " 이름: " + stdName;
		result += "연락처: " + stdPhone + "\n";
		result += "영어점수: " + engScore + "  수학점수: " + mathScore + "\n";
		result += "-------------------\n";
		return result;
	}
}
