<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<link
	href="${pageContext.request.contextPath}/content/customer/css/loginstyle.css"
	type="text/css" rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/content/customer/css/normalize.css"
	type="text/css" rel="stylesheet" />

<center>
<a href="MainByMimi.html"> <img
	src="${pageContext.request.contextPath}/content/images/yorijorybig.png"
	alt="yorijory" /></a>
</center>

<div id="join-form" class="loginform cf">
	<form name="login" action="<c:url value="/j_spring_security_check"/>"
		method="post">
		<fieldset>
			<ul>
				<li><label for="uid">&nbsp;아이디&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input name="j_username"class="text" /> 
				<label for="pwd">&nbsp;비밀번호&nbsp;&nbsp;&nbsp;</label><input type="password" name="j_password" class="text" /></li>

				<c:if test="${error!=null}">${error}</c:if>
				
				<li><input type="submit" id="btnLogin" value="로그인" /></li>
			</ul>

		</fieldset>
	</form>
</div>