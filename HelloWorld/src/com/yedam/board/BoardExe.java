package com.yedam.board;

import java.util.Date;

/*
 * 1.등록 2.목록
 */
public class BoardExe {
	private Board[] storage; // 필드

	public BoardExe() { // 초기화
		storage = new Board[10];
		storage[1] = new Board(2, "자바 재미없어", "열심히 안할꺼야", "user01", new Date());
		storage[2] = new Board(3, "오늘은 화요일", "시간이 안가네 ", "user02", new Date());
		storage[9] = new Board(1, "국밥국밥국밥 ", "아 배고프다   ", "user03", new Date());
	}

	// 게시글 등록.
	public boolean insertBoard(Board board) {
		for (int i = 0; i < storage.length; i++) {
			if (storage[i] == null) {
				storage[i] = board;
				return true;
			}
		}
		return false;
	}

	// 목록.
	public Board[] boardList() {
		// 정렬
		for (int j = 0; j < storage.length - 1; j++) {
			for (int i = 0; i < storage.length - 1; i++) {
				// 뒷자리가 null이면 nothing
				if (storage[i + 1] == null) {
					continue;
				}

				Board temp = null;
				if (storage[i] == null || storage[i].getBno() > storage[i + 1].getBno()) {
					// 위치변경 [i] <--> [i+1]
					temp = storage[i];
					storage[i] = storage[i + 1];
					storage[i + 1] = temp;
				}
			} // end of 1st for
		} // end of 2nd for
		return storage;
	}

	// 글번호 가져오는 메소드
	// null이 아닌 카운트에 + 1 한 값을 반환 (X)
	// boardNo의 max값에 +1 한 값을 반환 (O)
	public int getNextNo() {
		int cnt = 0;
		for (int i = 0; i < storage.length; i++) {
			if (storage[i] != null) {
				int bno = storage[i].getBno();
				if (cnt < bno) { // 현재의 max값보다 큰 값일 경우에
					cnt = bno;
				}
			}
		}
		return cnt + 1;
	}

	// 글삭제기능 => 매개값은 글번호, 반환값은 true / false, deleteBoard()
	public boolean deleteBoard(int bno) {
		for (int i = 0; i < storage.length; i++) {
			if (storage[i] != null && storage[i].getBno() == bno) {
				storage[i] = null; // 삭제는 null값을 대입
				return true;
			}
		}
		return false;
	}

	// 글수정기능 => 매개값은 글번호 + 내용 + 제목, 반환값은 true/false
	public boolean updateBoard(Board board) {
		for (int i = 0; i < storage.length; i++) {
			if (storage[i] != null && storage[i].getBno() == board.getBno()) {
				storage[i].setTitle(board.getTitle());
				storage[i].setContent(board.getContent());
				return true;
			}
		}
		return false;
	}

	// 삭제, 수정 권한있는지 체크 => 매개값은 글번호, 작성자, 반환값은 true/false
	// checkResponsibility()
	public boolean checkResponsibility(int bno, String writer) {
		for (int i = 0; i < storage.length; i++) {
			if (storage[i] != null) {
				if (storage[i].getBno() == bno && storage[i].getWriter().equals(writer)) {
					return true;
				}
			}
		}
		return false;
	}

}
