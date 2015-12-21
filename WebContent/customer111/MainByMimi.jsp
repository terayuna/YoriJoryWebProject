<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>요리조리</title>
<link href="../content/css/reset.css" type="text/css" rel="stylesheet" />
<link href="../content/css/styleByMimi.css" type="text/css"
	rel="stylesheet" />
</head>
<body>
	<header id="header">
	<div id="color-line">
		<div class="content-container">
			<h1 id="logo">
				<a href="MainByMimi.html"><img
					src="../content/images/yorijory.png" alt="yorijory" /></a>

			</h1>

			<div id="recipe-search">
				<h1 class="hidden">레시피검색</h1>
				<form>
					<fieldset>
						<legend class="hidden">레시피 검색 필드</legend>
						<input type="text" /> <input type="submit" value="검색" />
					</fieldset>
				</form>
			</div>

			<nav id="joinus-menu">
			<ul class="clearfix">
				<li><a href="login.html">로그인</a></li>
				<li><a href="signin.html">회원가입</a></li>
			</ul>
			</nav>
		</div>
	</div>
	</header>


	<div id="main-visual">
		<div id="category">
			<ul id="board-menu" class="clearfix">
				<li><a href="">공지사항</a></li>
				<li><a href="">자유게시판</a></li>
				<li><a href="">Q&A</a></li>
				<li><a href="">레시피 카테고리 ▼</a></li>
			</ul>
			<ul id="recipe-menu" class="clearfix">
				<li><a href="">밥</a></li>
				<li><a href="">볶음</a></li>
				<li><a href="">튀김</a></li>
				<li><a href="">탕</a></li>
				<li><a href="">조림</a></li>
				<li><a href="">디저트</a></li>
			</ul>
		</div>
	</div>


	<div id="recipes-list" >
		<div class="content-container">
			<div id="Weekly recipes"></div>
			<h1>금주의 레시피</h1>
			<div id="New recipes"></div>
			<h1>New 레시피</h1>
		</div>
	</div>


	<footer id="footer">
	<h2>
		<img src="../images/footerLogo.png" alt="요리조리" />
	</h2>
	<p>
	<address id="ad">
		사업자등록번호 : 000-00-00000000 통신판매업신고 : 서울 0000-000 관리자 : 한성준 <br /> 주소 :
		서울시 000구 001동 000-0 00빌딩 0층 전화 : 02-000-0000 팩스 : 02-000-0000
	</address>
	</p>
	<p>Copyright ⓒ yorijory.com 2015-2016 All Right Reserved. Contact
		master@yorijory.com for more information</p>
	</footer>
</body>
</html>