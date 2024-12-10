<%@page import="com.yedam.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../includes/header.jsp"></jsp:include>

<h3>게시글 수정화면</h3>
<%BoardVO bvo = (BoardVO) request.getAttribute("board");%>
<form action="modifyForm.do" method="post">
	<table class="table">
		<tr>
		<th>글번호</th>
		<td><%=bvo.getBoardNo()%></td>
		</tr>
		<tr>
			<th>제목</th>
			<td></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea cols="25" rows="3" class="form-class" name="content"></textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" class="btn btn-danger" value="게시글수정">
			</td>
		</tr>
	</table>
</form>

<jsp:include page="../includes/footer.jsp"></jsp:include>