<%@page import="com.yorijory.webprj.vo.Member"%>
<%@page import="java.util.List"%>
<%@page import="com.yorijory.webprj.dao.mybatis.MybatisMemberDao"%>
<%@page import="com.yorijory.webprj.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    MemberDao dao = new MybatisMemberDao(); 
	List<Member> list = dao.getMembers(1, "MID", "");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<link href="../css/loginstyle.css" type="text/css" rel="stylesheet" />
<link href="../css/normalize.css" type="text/css" rel="stylesheet" >
</head>
<body>
<h1 id="logo">
				<img src="../images/yorijorybig.png" alt="yorijory"/>
			</h1>

<section class="loginform cf">
		<form name="login" action="index_submit" method="get" accept-charset="utf-8">
			<ul>
				<li>
					<label for="ID">아이디</label>
					<input type="ID" name="userid" placeholder="ID" required>
					<label for="password">비밀번호</label>
					<input type="password" name="password" placeholder="password" required>
				</li>
				<!-- <li>
					<label for="password">비밀번호</label>
					<input type="password" name="password" placeholder="password" required></li>-->
				<li> 
					<input type="submit" value="로그인">
					<input type="submit" value="ID/PASSWORD 찾기">
				</li>
			</ul>
		</form>
	</section>

</body>
</html>