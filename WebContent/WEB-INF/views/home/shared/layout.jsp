<%-- <%@page import="com.newlec.webprj.vo.Notice"%>
<%@page import="java.util.List"%>
<%@page import="com.newlec.webprj.dao.mybatis.MyBatisNoticeDao"%>
<%@page import="com.newlec.webprj.dao.NoticeDao"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%
	/*NoticeDao dao = new MyBatisNoticeDao();
	List<Notice> list = dao.getNotices(1, "Title",""); */
	
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
		<title>index</title>
		<link href="${pageContext.request.contextPath}/content/customer/css/notice.css" type="text/css" rel="stylesheet" />
	</head>
	<body>
		<div id="header">
			<div class="top-wrapper">
				<!-- header 부분 -->
				<%-- <jsp:include page="../shared/header.jsp"/> --%>\
				<tiles:insertAttribute name="header"/>
			</div>
		</div>
		<div id="visual" class="customer">
			<div class="top-wrapper">

			</div>
		</div>
		<div id="main">
			<div class="top-wrapper clear">
				<div id="content">
					<!-- content 부분 -->
					<tiles:insertAttribute name="content"/>
				</div>
				<div id="navi">
					<!-- aside 부분 -->
					<%-- <jsp:include page="shared/noticeAside.jsp" /> --%>
				
				</div>
			</div>
		</div>
		<div id="footer">
			<div class="top-wrapper">
				<!-- footer 부분 -->
				<%-- <jsp:include page="../shared/footer.jsp" /> --%>
				<tiles:insertAttribute name="footer"/>
			</div>
		</div>
	</body>
</html>
