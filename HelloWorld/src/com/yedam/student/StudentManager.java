package com.yedam.student;
/*
 * CRUD 처리
 * 1.추가 2.목록 3.수정(영어,수학) 4.삭제 9.종료
 */

import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		Student[] storage = new Student[10];

		while (run) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.추가 2.목록 3.수정(영어,수학) 4.삭제 5.상세조회(합계,평균) 6.합계점수기준 정렬 9.종료 ");
			System.out.println("--------------------------------------------------------------------");
			System.out.print("선택>> ");

			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {

			case 1:
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ---");
				System.out.print("학생번호를 입력하세요>> ");
				String id = scn.nextLine();
				System.out.print("학생이름를 입력하세요>> ");
				String name = scn.nextLine();
				System.out.print("영어점수를 입력하세요>> ");
				int eng = Integer.parseInt(scn.nextLine());
				System.out.print("수학점수를 입력하세요>> ");
				int math = Integer.parseInt(scn.nextLine());
				for (int i = 0; i < storage.length; i++) {
					if (storage[i] == null) {
						storage[i] = new Student(id, name, eng, math); //인스턴스 생성
					
						break;
					}
				}
				break;

			case 2:
				for (int i = 0; i < storage.length; i++) {
					if (storage[i] != null) {
						System.out.println("🔽🔽🔽🔽🔽🔽🔽🔽🔽🔽🔽");
						System.out.printf("%s %4s %4d %4d \n", storage[i].studentId, storage[i].studentName,
								storage[i].studentEng, storage[i].studentMath);
						System.out.println("🔼🔼🔼🔼🔼🔼🔼🔼🔼🔼🔼");
					}
				}
				break;
			case 3:
				System.out.println("수정할 학생의 이름을 입력하세요");
				name = scn.nextLine();

				for (int i = 0; i < storage.length; i++) {
					if (name.equals(storage[i].studentName)) {
						System.out.println("수정할 영어점수를 입력하세요");
						eng = Integer.parseInt(scn.nextLine());
						System.out.println("수정할 수학점수를 입력하세요");
						math = Integer.parseInt(scn.nextLine());
						storage[i].studentEng = eng;
						storage[i].studentMath = math;
						break;
					}
				}
				break;
			case 4:
				System.out.println("삭제할 학생의 이름을 입력하세요");
				name = scn.nextLine();
				for (int i = 0; i < storage.length; i++) {
					if (storage[i] != null) {
						if (storage[i].studentName.equals(name)) {
							storage[i] = null;
							break;
						}
					} else if (storage[i].studentName == null) {
						System.out.println("그런 학생이 없습니다");
						break;
					}
				}
				break;
			case 5:
				System.out.println("조회할 사람을 입력하세요");
				name = scn.nextLine();
				int engSum = 0;
				int mathSum = 0;
				
				for(int i = 0; i<storage.length; i++) {
					if(storage[i] != null) {
						if(storage[i].studentName.equals(name)) {
							 engSum += storage[i].studentEng;
							 int engAvg = engSum / 2;
							 mathSum += storage[i].studentMath;
							 int mathAvg = mathSum / 2;
							 System.out.println("이 학생의 영어점수는 " + storage[i].studentEng +"입니다");
							 System.out.println("이 학생의 수학점수 는 " + storage[i].studentMath +"입니다");
							 System.out.println("이 학생의 영어점수와 수학점수의 합계는 " + engAvg +"입니다");
							 System.out.println("이 학생의 영어점수와 수학점수의 평균는 " + mathAvg +"입니다");
						}
					}
				}
			case 6:
//				int[] intAry = {50, 67, 94, 83, 45};
//				for(int j= 0; j<intAry.length - 1; j++ ) {
//
//				for(int i=0; i<intAry.length; i++) {
//					if(intAry[i]> intAry[i+1]) {
//						int temp = intAry[i];
//						intAry[i] = intAry[i +1];
//						intAry[i+1] = temp;
//					}
//				}
//				for (int num:intAry) {
//					System.out.println(num);
//				}
				for (int j = 0; j < storage.length - 1; j++) {
					for (int i = 0; i < storage.length; i++) {

						if (storage[0].studentEng + storage[0].studentMath > storage[1].studentEng
								+ storage[1].studentMath) {
							Student temp = storage[0];
							storage[0] = storage[1];
							storage[1] = temp;
							System.out.println("합계점수 출력");
						}
					}
				}
				break;
			case 9:
				run = false;
				System.out.println("종료되었습니다");
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요");
			}
		}
		System.out.println("프로그램 종료");
	}
}
