<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원목록</h2>
					<div class="align-container">
						<h3 class="hidden">회원 검색</h3>
						<form id="notice-search">
							<fieldset>
								<legend class="hidden">회원 검색 필드</legend>
								<label class="hidden">분류</label> <select>
									<option>분류선택</option>
									<option selected>아이디</option>
									<option>이름</option>
								</select> <label class="hidden">검색어</label> <input type="text" /> <input
									type="submit" value="검색" />
							</fieldset>
						</form>
					</div>
					<h3 class="hidden">회원 테이블</h3>
		
					<table id="notices">
						<thead>
							<tr>
								<th class="mid">아이디</th>
								<th class="name">이름</th>
								<th class="phone">폰번호</th>
								<th class="email">이메일</th>
								<th class="regdate">가입일</th>
								<th class="etc">비고</th>
							</tr>
						</thead>
		
						<tbody>
							<c:forEach var="n" items="${mlist}">
							<tr>
								<td class="mid">${n.mid}</td>
								<td class="name"><a href="">${n.name}</a></td>
								<td class="phone">${n.phone}</td>
								<td class="email">${n.email}</td>
								<td class="regdate"><fmt:formatDate pattern="yyyy-MM-dd" value='${n.regDate}'/></td>
								<td class="etc">삭제</td>
							</tr>
							</c:forEach>
						</tbody>
					</table>
					<br>
					<h3>목록의 현재 위치</h3>
					<p>1/1page</p>
		
					<h3>페이지 번호</h3>
					<p>1</p> 
</body>
</html>