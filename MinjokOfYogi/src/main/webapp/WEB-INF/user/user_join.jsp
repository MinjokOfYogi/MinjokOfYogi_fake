<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" />
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
	<form action="user_join" method="post">
		<table class="table table-bordered" style="width: 500px">
			<caption>
				<b>회원가입_일반회원</b>
			</caption>
			<tr>
				<th width="200">이름</th>
				<td><input type="text" style="width: 300px" name="name"></td>
			</tr>
			<tr>
				<th width="200">아이디</th>
				<td><input type="text" style="width: 300px" name="id"></td>
			</tr>
			<tr>
				<th width="200">비밀번호</th>
				<td><input type="password" style="width: 300px" name="pw"></td>
			</tr>
			<tr>
				<th width="200">비밀번호 확인</th>
				<td><input type="password" style="width: 300px" name="pw2"></td>
			</tr>
			<tr>
				<th width="200">핸드폰 번호</th>
				<td><input type="text" style="width: 300px" name="hp"></td>
			</tr>
			<tr>
				<th width="200">주소</th>
				<td><input type="text" style="width: 300px" name="addr"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><button type="submit"
						class="btn btn-info">회원가입</button>
					<button type="button" onclick="location.href='../'"
						class="btn btn-default">취소</button></td>
			</tr>
		</table>
	</form>
</body>
</html>