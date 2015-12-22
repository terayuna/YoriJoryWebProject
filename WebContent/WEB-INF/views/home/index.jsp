<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>


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
			</ul>
		</div>
	</div>


	<div id="recipes-list">
		<div class="content-container">
			<div id="Weekly recipes"></div>
			<h1>금주의 레시피</h1>
			<div id="New recipes"></div>
			<h1>New 레시피</h1>
		</div>
	</div>


