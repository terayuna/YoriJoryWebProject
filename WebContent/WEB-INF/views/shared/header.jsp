<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
				<h1 id="logos"><a href="../index.jsp"><img src=${pageContext.request.contextPath}/content/images/yorijory.png alt="logos" /></a></h1>

			<div id="recipe-searchs">
				<h1 class="hiddens">레시피검색</h1>
				<form action="" method="get">
					<fieldset>
						<legend class="hiddens">레시피 검색 필드</legend>
						<input type="text" /> <input type="submit" value="검색" />
					</fieldset>
				</form>
			</div>
				<h3 class="hidden">로그인메뉴</h3>
				<ul id="loginmenu" class="block_hlist">
					<li>
						<a href="../index.jsp">HOME</a>
					</li>
					<li>
						<c:if test="${pageContext.request.userPrincipal == null }">
						<a href="/JSPProjectYun/joinus/login">로그인</a>
						</c:if>
						<c:if test="${pageContext.request.userPrincipal != null }">
						<c:url var ="logout" value="/j_spring_security_logout"/>
						<a href="${logout }">로그아웃</a>
						</c:if>
					</li>
					<li>
						<a href="">회원가입</a>
					</li>
				</ul>
				