<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%-- <h1 id="logos">
	<a href="../index.jsp"><img
		src=${pageContext.request.contextPath}/content/images/yorijory.png
		alt="logos" /></a>
</h1>

<div id="recipe-searchs">
	<h1 class="hiddens">레시피검색</h1>
	<form action="" method="get">
		<fieldset>
			<legend class="hiddens">레시피 검색 필드</legend>
			<input type="text" /> <input type="submit" value="검색" />
		</fieldset>
	</form>
</div>
<h3 class="hiddens">로그인메뉴</h3>
<ul id="loginmenu" class="block_hlist">
	<li><a href="../index.jsp">HOME</a></li>
	<li><c:if test="${pageContext.request.userPrincipal == null}">
			<a href="../joinus/login">로그인</a>
		</c:if> <c:if test="${pageContext.request.userPrincipal != null}">
			<c:url var="logout" value="/j_spring_security_logout" />
			<a href="${logout}">
				${pageContext.request.userPrincipal.name} <security:authentication
					property="name" /> 로그아웃
			</a>
		</c:if></li>
	<li><a href="">회원가입</a></li>
</ul> --%>

<div id="color-line">
		<div class="content-container">
			<h1 id="logo">
				<a href="../index.jsp"> <img
					src=${pageContext.request.contextPath}/content/images/yorijory.png
					alt="logos" /></a>
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
				<li><c:if test="${pageContext.request.userPrincipal == null}">
						<a href="../joinus/login">로그인</a>

					</c:if> <c:if test="${pageContext.request.userPrincipal != null}">
						<c:url var="logout" value="/j_spring_security_logout" />
						<a href="${logout}"> <%-- ${pageContext.request.userPrincipal.name} --%>
							<security:authentication property="name" /> 로그아웃
						</a>
					</c:if></li>
				<li><a href="../joinus/join">회원가입</a></li>
			</ul>
			</nav>
		</div>
	</div>

