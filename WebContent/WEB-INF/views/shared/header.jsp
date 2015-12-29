<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
	
<script>
   window.onload = function(){
	   
	   //-------------ajax post method
	   var btnWrite = document.querySelector("#btn-login");
	   btnWrite.onclick = function(){
			/* alert("dfa"); */	
			
			var dig = document.createElement("div");
			dig.style.width = "100%";
	        dig.style.height = "100%";
	        dig.style.position="fixed";
	        dig.style.top = "0px";
			
			
		   	var screen = document.createElement("div");
	         
	         screen.style.backgroundColor = "#000";
	         screen.style.opacity = "0.5";
	         screen.style.width = "inherit";
	         screen.style.height = "inherit";
	         
	         var container = document.createElement("div");
	  
	         container.style.backgroundColor = "white";
	         container.style.width = "600px";
	         container.style.height = "400px";
	         container.style.position  = "fixed";
	         container.style.top = "100px";
	         container.style.left = "180px";
	         
	  	         
	         dig.appendChild(screen);
	         dig.appendChild(container);
	         document.body.appendChild(dig);
	         
	         //------------ajax add form----------------------------------------------------------------------------
	         
	         var request = new XMLHttpRequest();
		     request.onreadystatechange = function(){
		          if(request.readyState==4)
		          {
		        	  //tbody의 안쪽 비우기
		        	
		        	  container.innerHTML = request.responseText;
		       
		        	
		     		  //alert(request.responseText);
		          }
		       };  
		      
		      request.open("GET", "../joinus/login", true); //요청방식, 사용자가 요청할 URL, 동기-비동기 결정
		      request.send(null);
		      
		      
	         return false;
	
	   }
	   
 };
</script>

<div id="color-line">
		<div class="content-container">
			<h1 id="logo">
				<a href="../home/index"> <img
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
						<a id = "btn-login" href="../joinus/login">로그인</a>

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

