<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../includes/header.jsp"></jsp:include>

<h3>게시글 등록화면(boardForm.jsp)</h3>
<form action="board.do" method="post" enctype="multipart/form-data">
	<table class="table">
		<tr>
			<th>제목</th>
			<td><input type="text" class="form-control" name="title"></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea cols="25" rows="3" class="form-control" name="content"></textarea></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><input type="text" readonly class="form-control" name="writer" value="${logId}"></td>
		</tr>
		<!-- 2024.12.13 -->
		<tr>
			<th>이미지</th>
			<td><input type="file" class="form-control" name="img" ></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="게시글등록">
			</td>
		</tr>
	</table>
</form>

<jsp:include page="../includes/footer.jsp"></jsp:include>