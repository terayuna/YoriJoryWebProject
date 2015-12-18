<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시글 목록</h2>
			<div class="align-container">
				<h3 class="hidden">게시글 검색</h3>
				<form id="notice-search">
					<fieldset>
						<legend class="hidden">게시글 검색 필드</legend>
						<label class="hidden">분류</label> <select>
							<option>분류선택</option>
							<option>코드</option>
							<option selected>제목</option>
							<option>작성자</option>
						</select> <label class="hidden">검색어</label> <input type="text" /> <input
							type="submit" value="검색" />
					</fieldset>
				</form>
			</div>
			<h3 class="hidden">게시글 테이블</h3>

			<table id="notices">
				<thead>
					<tr>
						<th class="code">코드</th>
						<th class="title">제목</th>
						<th class="mid">작성자</th>
						<th class="regdate">등록일</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach var="n" items="${blist}">
						<tr>
							<td class="code">${n.code}</td>
							<td class="title"><a href="">${n.title}</a></td>
							<td class="writer">${n.members_Mid}</td>
							<td class="regdate"><fmt:formatDate pattern="yyyy-MM-dd" value='${n.regDate}'/></td>
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