<%@page import="com.yedam.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="../includes/header.jsp"></jsp:include>

<!-- board.jsp원래 있던 부분 -->
<h3>글수정화면(modifyForm.jsp)</h3>
<%
BoardVO bvo = (BoardVO) request.getAttribute("board");
String sc = (String) request.getAttribute("searchCondition");
String kw = (String) request.getAttribute("keyword");
String pg = (String) request.getAttribute("page");
%>
<form action="modifyBoard.do">
	<input type="hidden" name="board_no" value="<%=bvo.getBoardNo()%>">
	<input type="hidden" name="searchCodition" value="<%=sc %>">
	<input type="hidden" name="keyword" value="<%=kw %>">
	<input type="hidden" name="page" value="<%=pg %>">
	<table class="table">
		<tr>
			<th>글번호</th>
			<td><%=bvo.getBoardNo()%></td>
			<th>작성자</th>
			<td><%=bvo.getWriter()%></td>
		</tr>
		<tr>
			<th>제목</th>
			<td colspan="3"><input type="text" name="title"
				value="<%=bvo.getTitle()%>"></td>
		</tr>
		<tr>
			<th>내용</th>
			<td colspan="3"><textarea row="5" class="form-control"
					name="content"><%=bvo.getContent()%></textarea></td>
		</tr>
		<tr>
			<th>작성일시</th>
			<td><%=bvo.getCreationDate()%></td>
			<th>조회수</th>
			<td><%=bvo.getViewCnt()%></td>
		</tr>
		<tr>
			<td colspan="4" align="center"><input type="submit"
				class="btn btn-danger" value="저장"></td>
		</tr>
	</table>
</form>
<!-- board.jsp원래 있던 부분 -->

<jsp:include page="../includes/footer.jsp"></jsp:include>
