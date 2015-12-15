<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../css/loginstyle.css" type="text/css" rel="stylesheet" />
<link href="../css/normalize.css" type="text/css" rel="stylesheet" >
</head>
<body>
<h1 id="logo">
		<a href="MainByMimi.html"> <img src="../images/yorijorybig.png" alt="yorijory"/></a>
			</h1>

<section class="loginform cf">
		<form name="login" action="<c:url value="/j_spring_security_check"/>" method="get" accept-charset="utf-8">
			<ul>
				<li>
					<label for="usermail">&nbsp;아이디 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
					<input type="ID" name="j_username" placeholder="ID" required></label>
					<br>
					<label for="password">&nbsp;비밀번호&nbsp;&nbsp;&nbsp;
					<input type="password" name="j_password" placeholder="password" required></label>
				</li>
				<!-- <li>
					<label for="password">비밀번호</label>
					<input type="password" name="password" placeholder="password" required></li>-->
				<li> 
					<input type="submit" value="로그인">
					<input type="submit" value="아이디/비밀번호 찾기">
				</li>
			</ul>
		</form>
	</section>

</body>
</html>