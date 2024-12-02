package com.yedam.reference;

import java.util.Scanner;

/*
 * 친구정보 저장 기능
 * 1.추가 2.목록 3.조회(숙제) 9.종료
 */
public class FriendManager {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		Friend[] storage = new Friend[10]; // 친구정보 저장할수 있는 공간 10개 확보.
//		storage[0] = new Friend(); // 타입이 같아야함(중요) << 이렇게 사용하기! 
//		storage[0].friendName = "홍길동";
//		storage[0].friendPhone = "010-1111-1111";
//		storage[0].friendBirth = "1999-01-01";
		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.추가 2.목록 3.조회 4.수정(연락처) 5.삭제 9.종료 ");
			System.out.println("----------------------------------------");
			System.out.print("선택>> ");

			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1: // 추가
				System.out.print("친구 이름 입력:");
				String name = scn.nextLine();
				System.out.print("친구 연락처 입력:");
				String phone = scn.nextLine();
				System.out.print("친구 생일 입력:");
				String birth = scn.nextLine();
				for (int i = 0; i < storage.length; i++) {
//					System.out.println(storage[i]);
					if (storage[i] == null) { // 비어있는 위치에 저장
						storage[i] = new Friend();
						storage[i].friendName = name;
						storage[i].friendPhone = phone;
						storage[i].friendBirth = birth;
						break; // for 종료.
					}
				}
				break; // switch 종료.
			case 2: // 목록
				for (int i = 0; i < storage.length; i++) {
					if (storage[i] != null) {
						System.out.println("----------------------------------------");
						System.out.printf("%4s %14s %14s \n", storage[i].friendName, storage[i].friendPhone,
								storage[i].friendBirth);
						System.out.println("----------------------------------------");
					}
				}
				break; // switch 종료.
			case 3: // 조회
				boolean isExists = false;
				int idx = -1;
				System.out.print("조회할 이름을 입력하세요:");
				name = scn.nextLine();
				for (int i = 0; i < storage.length; i++) {
					if (storage[i] != null) {
						isExists = name.equals(storage[i].friendName);
						if (isExists) {
							idx = i;
							break;
						}
					}
				}
				if (isExists) {
					System.out.printf("%4s %14s %14s \n", storage[idx].friendName, storage[idx].friendPhone,
							storage[idx].friendBirth);
				} else {
					System.out.println("찾는 이름 없음");
				}
				break;
			case 4: // 수정(연락처) 이름, 연락처 입력
				System.out.println("수정할 친구 이름 입력>> ");
				name = scn.nextLine();
				System.out.print("친구 연락처 입력>> ");
				phone = scn.nextLine();
				// 10개 중에서 6개 저장, 4개 null
				for (int i = 0; i < storage.length; i++) {
					if (storage[i] != null) {
						if (storage[i].friendName.equals(name)) {
							storage[i].friendPhone = phone;
							break;
						} 
					}else if(storage[i] == null) {
						System.out.println("찾는 이름 따윈 없습니다");
						break;
					}
				}
				break;
			case 5: // 삭제. 배열의 위치에 null값을 대입함
				System.out.println("삭제할 친구 이름 입력>> ");
				name = scn.nextLine();
				
				for(int i = 0; i<storage.length; i++) {
					if (storage[i] != null) {
						if(storage[i].friendName.equals(name)) {
							storage[i] = null;
							break;
						}
					}
				}
				break;
			case 9: // 종료
				run = false;
				break; // switch 종료.
			default:
				System.out.println("메뉴를 다시 선택하세요");
			} // end of switch

		} // end of while
		System.out.println("프로그램 ㄲㅡㅌ");
	} // end of main()
}
// end of class
