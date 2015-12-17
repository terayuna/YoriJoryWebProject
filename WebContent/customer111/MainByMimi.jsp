<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>요리조리</title>
<link href="../content/css/reset.css" type="text/css" rel="stylesheet" />
<link href="../content/css/styleByMimi.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<header id="headers">
		<div id="color-line"></div>
		<div class="content-containers">
			<h1 id="logos">
				<a href="MainByMimi.html"><img src="../content/images/yorijory.png"
					alt="yorijory" /></a>

			</h1>

			<div id="recipe-searchs">
				<h1 class="hiddens">레시피검색</h1>
				<form>
					<fieldset>
						<legend class="hiddens">레시피 검색 필드</legend>
						<input type="text" /> <input type="submit" value="검색" />
					</fieldset>
				</form>
			</div>

			<nav id="joinus-menus">
				<ul class="clearfixs">
					<li><a href="login.html">로그인</a></li>
					<li><a href="signin.html">회원가입</a></li>
				</ul>
			</nav>

		</div>
	</header>


	<div id="main-visual">
		<div id="categories">
			<ul class="clearfix">
			<li><a href="">공지사항</a></li>
			<li><a href="">자유게시판</a></li>
			<li><a href="">Q&A</a></li>
			
		</div>
	</div>



	<div id="recipes-list">
		<div class="content-container">
			<div id="Weekly recipes"></div>
				<span> 금주의 레시피 </span>
			<div id="New recipes"></div>
				<span> New 레시피 </span>
		</div>
	</div>
</body>
</html>