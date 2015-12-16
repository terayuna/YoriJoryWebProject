<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<link href="${pageContext.request.contextPath}/content/customer/css/loginstyle.css" type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/content/customer/css/normalize.css" type="text/css" rel="stylesheet" />

<h1 id="logo">
		<a href="MainByMimi.html"> <img src="../images/yorijorybig.png" alt="yorijory"/></a>
		</h1>
<h2>로그인</h2>
					<h3 class="hidden">방문페이지 로그</h3>
					<ul id="breadscrumb" class="block_hlist clear">
						<li>
							HOME
						</li>
						<li>
							회원가입
						</li>
						<li>
							로그인
						</li>
					</ul>
					<h3 class="hidden">회원가입 폼</h3>
					<div id="join-form" class="loginform cf" >						
						<form name="login" action="<c:url value="/j_spring_security_check"/>" method="post">                            <fieldset>
                                <legend class="hidden">로그인 폼</legend>
                                <h3><img src="images/txtTitle.png" /></h3>
                                <ul>
                                    <li>
                                    <label for="uid">&nbsp;아이디 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input name="j_username" class="text" />
                                    <label for="pwd">&nbsp;비밀번호&nbsp;&nbsp;&nbsp;</label><input type="password" name="j_password" class="text" /></li>
                                
                                <div style="color:red;"><c:if test ="${error!=null}">${error}</c:if></div>
                                <li>
                                <input type="submit" id="btnLogin" value="로그인" />
                                <input type="submit" id="btnFind" value="아이디/비밀번호 찾기"/>
                                </li>
                                </ul>
                                <ul id="loginOption">
                                    <li><span>아이디 또는 비밀번호를 분실하셨나요?</span><a href="/Member/FindID"><img alt="ID/PWD 찾기" src="images/btnFind.png" /></a></li>
                                    <li><span>아이디가 없으신 분은 회원가입을 해주세요.</span><a href="/Member/Agree"><img alt="회원가입" src="images/btnJoin.png" /></a></li>
                                </ul>
                            </fieldset>
						</form>
					</div>