package com.yedam;

import java.io.IOException;

import com.yedam.common.Control;
import com.yedam.vo.BoardVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ModifyFormControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 게시글 번호 15번에 대한 조회결과 html/modifyForm.jsp 출력
		// 수정항목은 제목, 내용으로 제한
		BoardVO board = new BoardVO();
		board.setBoardNo(15);
		req.setAttribute("board", board);
		req.getRequestDispatcher("html/modifyForm.jsp").forward(req, resp);
	}

}
