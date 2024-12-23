package com.yedam.board;
/*
 * 회원가입, 회원정보수정, 목록 기능 
 */

public class MemberExe {
	// 인스턴스 vs 정적필드(static), 정적메소드 선언
	
	private static Member[] storage; // 필드

	// 생성자
	public MemberExe() {
		storage = new Member[10];
		storage[0] = new Member("user01", "1111", "이종우", "010-1111-1111");
		storage[1] = new Member("user02", "2222", "김태홍", "010-2222-2222");
		storage[2] = new Member("user03", "3333", "김상연", "010-3333-3333");
	}

	// 메소드
	// 1.등록
	public static boolean addMember(Member member) {
		for (int i = 0; i < storage.length; i++) {
			if (storage[i] == null) {
				storage[i] = member;
				return true; // 등록ok
			}
		}
		return false; // 등록fail
	}

	// 2.목록
	public static Member[] memberList() {
		return storage;
	}

	// 3. 아이디 & 비밀번호 => 존재여부 반환
	public static boolean login(String id, String pw) {
		for (int i = 0; i < storage.length; i++) {
			if (storage[i] != null) {
				if (storage[i].getMemberId().equals(id) && storage[i].getPassword().equals(pw)) {
					return true;
				}
			} //end of if (null)
		} //end of for()
		return false;
	} //end of login()

}
