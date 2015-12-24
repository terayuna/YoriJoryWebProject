<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<div id="main-visual">
	<div id="category">
		<ul id="board-menu" class="clearfix">
			<li><a href="../customer/notice">공지사항</a></li>
			<li><a href="../board/board">자유게시판</a></li>
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
			<!-- <img src = "${ctx}/content/home/images/yojoLogo.png"/> -->
		</ul>
	</div>
</div>



<div class="content-container">
	<div id="recipes-list">
		<h1>금주의 레시피</h1>
		<ul id="Weekly recipes" class="clearfix">
			<li><img src="${ctx}/content/home/images/17d9541421c6.jpg" /></li>
			<li><img src="${ctx}/content/home/images/7453911b6913.jpg" /></li>
			<li><img src="${ctx}/content/home/images/aeaf076daf20.jpg" /></li>
			<li><img src="${ctx}/content/home/images/b6477973a414.jpg" /></li>
			
		</ul>
		<h1>New 레시피</h1>
		<ul id="New recipes">
			<li><img src="${ctx}/content/home/images/bb4bf21b1e5d.jpg" /></li>
			<li><img src="${ctx}/content/home/images/c882f4f46602.jpg" /></li>
			<li><img src="${ctx}/content/home/images/c890104d8f06.jpg" /></li>
			<li><img src="${ctx}/content/home/images/f8980d423c01.jpg" /></li>
		</ul>
	</div>
</div>


