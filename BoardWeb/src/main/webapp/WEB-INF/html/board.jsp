<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="../includes/header.jsp"></jsp:include>

<!-- board.jsp원래 있던 부분 -->
<h3>글상세화면(board.jsp)</h3>

<form action="modifyForm.do">
	<input type="hidden" name="board_no" value="${board.boardNo }">
	<input type="hidden" name="searchCondition" value="${searchCondition }">
	<input type="hidden" name="keyword" value="${keyword }"> 
	<input type="hidden" name="page" value="${page }">
	<table class="table">
		<tr>
			<th>글번호</th>
			<td><c:out value="${board.boardNo }" /></td>
			<th>작성자</th>
			<td><c:out value="${board.writer }" /></td>
		</tr>
		<tr>
			<th>제목</th>
			<td colspan="3"><c:out value="${board.title }" /></td>
		</tr>
		<tr>
			<th>내용</th>
			<td colspan="3"><textarea row="5" readonly class="form-control">
				<c:out value="${board.content }" /></textarea></td>
		</tr>
		<tr>
			<th>작성일시</th>
			<td><c:out value="${board.creationDate }" /></td>
			<th>조회수</th>
			<td><c:out value="${board.viewCnt }" /></td>
		</tr>
		<tr>
			<td colspan="4" align="center">
				<!--  로그인상태 => 권한에 따라 활성화/비활성화 
			로그인상태 아니면 => 권한없음 --> <c:choose>
					<c:when test="${logId ne null and board.writer == logId }">
						<input type="submit" class="btn btn-danger" value="수정">
					</c:when>
					<c:otherwise>
						<input type="submit" class="btn btn-danger" value="수정" disabled>
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
	</table>
</form>
<!-- board.jsp원래 있던 부분 -->

<jsp:include page="../includes/footer.jsp"></jsp:include>
