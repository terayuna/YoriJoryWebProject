<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>index</title>
<!-- <link href="../content/css/reset.css" type="text/css" rel="stylesheet" />
<link href="../content/css/styleByMimi.css" type="text/css"
	rel="stylesheet" /> -->

<%-- <link href="${ctx}/content/customer/css/customer.css" type="text/css"
	rel="stylesheet" />
<link
	href="${ctx}/content/customer/css/<tiles:getAsString name="css" />"
	type="text/css" rel="stylesheet" /> --%>
<link href="${ctx}/content/home/css/index.css" type="text/css"
	rel="stylesheet" />
<link href="${ctx}/content/home/css/<tiles:getAsString name="css" />"
	type="text/css" rel="stylesheet" />

</head>
<body>
	<header id="header"> <tiles:insertAttribute name="header" />
	</header>

	<div id="home-index">
		<div id="content">
			<tiles:insertAttribute name="content" />
		</div>
	</div>


	<footer id="footer"> <tiles:insertAttribute name="footer" />
	</footer>
</body>
</html>