<%@page import="com.yedam.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="../includes/header.jsp"></jsp:include>

<!-- board.jsp원래 있던 부분 -->
<h3>글상세화면(board.jsp)</h3>
<%
BoardVO bvo = (BoardVO) request.getAttribute("board");
%>
<form action="modifyForm.do">

	<input type="hidden" name="board_no" value="<%=bvo.getBoardNo()%>">
	<table class="table">
		<tr>
			<th>글번호</th>
			<td><%=bvo.getBoardNo()%></td>
			<th>작성자</th>
			<td><%=bvo.getWriter()%></td>
		</tr>
		<tr>
			<th>제목</th>
			<td colspan="3"><%=bvo.getTitle()%></td>
		</tr>
		<tr>
			<th>내용</th>
			<td colspan="3"><textarea row="5" readonly class="form-control"><%=bvo.getContent()%></textarea>
			</td>
		</tr>
		<tr>
			<th>작성일시</th>
			<td><%=bvo.getCreationDate()%></td>
			<th>조회수</th>
			<td><%=bvo.getViewCnt()%></td>
		</tr>
		<tr>
			<%
			String logId = (String) session.getAttribute("logId");
			if (bvo.getWriter().equals(logId)) {
			%>
			<td colspan="4" align="center">
				<input type="submit" class="btn btn-danger" value="수정화면">
			</td>
			<%}else {%>
			<td colspan="4" align="center">
				<input type="submit" disabled class="btn btn-danger" value="수정화면">
			</td>
			<%
			}
			%>
		</tr>
	</table>
</form>
<!-- board.jsp원래 있던 부분 -->

<jsp:include page="../includes/footer.jsp"></jsp:include>
