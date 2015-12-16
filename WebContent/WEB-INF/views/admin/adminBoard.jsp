<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<h3 class="hidden">공지사항 테이블</h3>

			<table id="notices">
				<thead>
					<tr>
						<th>코드</th>
						<th>작성자</th>
						<th>타입</th>
						<th>제목</th>
						<th>등록일</th>
					</tr>
				</thead>

				<tbody>
					<tr>
						<td>1</td>
						<td>염기훈</td>
						<td>26</td>
						<td>2011-11-22</td>
						<td>2</td>
					</tr>

					<tr>
						<td>2</td>
						<td>권창훈</td>
						<td>22</td>
						<td>2012-11-23</td>
						<td>3</td>
					</tr>

					<tr>
						<td>3</td>
						<td>정성룡</td>
						<td>1</td>
						<td>2011-11-22</td>
						<td>2</td>
					</tr>

					<tr>
						<td>4</td>
						<td>오범석</td>
						<td>3</td>
						<td>2011-11-22</td>
						<td>2</td>
					</tr>
				</tbody>
			</table>
			<br>
			<h3>목록의 현재 위치</h3>
			<p>1/1page</p>

			<h3>페이지 번호</h3>
			<p>1</p> 
</body>
</html>