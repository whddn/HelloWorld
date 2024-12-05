package com.yedam.jdbc.student;

import java.util.ArrayList;
import java.util.Scanner;

public class MainExe {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		// db 처리기능
		StudentDAO dao = new StudentDAO();

		while (run) {
			System.out.println("1.목록 2.등록 3.점수등록 4.상세조회 9.종료");
			System.out.print("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				ArrayList<Student> list = dao.studentList();
				for (Student stud : list) { // 학생번호, 이름, 연락처
					System.out.println(stud.showInfo());

				}
				break;
			case 2:
				System.out.print("학생번호 입력>>  ");
				String no = scn.nextLine();
				System.out.print("학생이름 입력>>  ");
				String name = scn.nextLine();
				System.out.print("연락처 입력>>  ");
				String phone = scn.nextLine();

				Student std = new Student(no, name, phone);

				if (dao.insertStudent(std)) {
					System.out.println("정상 등록");
				} else {
					System.out.println("등록 실패");
				}
				break;
			case 3:
				System.out.print("학생번호 입력>>  ");
				no = scn.nextLine();
				System.out.print("영어점수 입력>>  ");
				int escore = Integer.parseInt(scn.nextLine());
				System.out.print("수학점수 입력>>  ");
				int mscore = Integer.parseInt(scn.nextLine());

				std = new Student();
				std.setEngScore(escore);
				std.setMathScore(mscore);
				std.setStdNo(no);

				// 성적수정
				if (dao.updateStudent(std)) {
					System.out.println("점수가 들어갔습니다");
				} else {
					System.out.println("다시한번 확인하세요");
				}
				break;
			case 4:
				System.out.print("학생번호 입력>>  ");
				no = scn.nextLine();
				
				std = dao.selectStudent(no); //Student 값 반환
				if(std == null) {
					System.out.println("조회된 결과 없습니다");
					break;
				}
				System.out.println(std.showDetail()); //상세출력
				break;
			case 9:
				run = false;
			}
		}
		System.out.println("end of prog");
	}// end of main
}
