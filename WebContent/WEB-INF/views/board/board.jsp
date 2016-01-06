<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>
<script>
 var param = {f:'${param.f}', q:'${param.q}'};
 if(param.f == "") param.f = "TITLE";
 
 var numClick = function(event){
     var page = event.target.innerText;
     //----------------------------------------
     var request;
     
     var request = new XMLHttpRequest();
     request.onreadystatechange = function(){
     if(request.readyState==4)
     {
        var tbody=document.querySelector("#boards tbody");
        
        tbody.innerHTML=request.responseText;
     }
   };

  request.open("GET", "boardPartial?pg="+page+"&f="+param.f+"&q="+param.q, true); //요청방식, 사용자가 요청할 URL, 동기-비동기 결정
  request.send(null);
  
     
     return false;
  };
 
</script>

    				<h2>자유게시판</h2>
					<h3 class="hidden">방문페이지 로그</h3>
					<ul id="breadscrumb" class="block_hlist clear">
						<li>HOME</li>
						<li>
							고객센터
						</li>
						<li>
							공지사항목록
						</li>
					</ul>
					<h3 class="hidden">게시판 목록</h3>
					<form id="content-searchform" class="article-search-form" action="board" method="get">
						<fieldset>
							<legend class="hidden">
								목록 검색 폼
							</legend>
							<input type="hidden" name="pg" value="" />
							<label for="f"
							class="hidden">검색필드</label>
							<select name="f">
								<option value="TITLE" <c:if test = "${param.f == TITLE}"> selected="selected"</c:if>>제목</option>
								<option value="CONTENT" <c:if test = "${param.f == CONTENT}"> selected="selected"</c:if>>내용</option>
							</select>
							<label class="hidden" for="q">검색어</label>
							<input type="text" name="q" value="${param.q }" />
							<input type="submit" value="검색" />
						</fieldset>
					</form>
					<table class="article-list margin-small">
						<caption class="hidden">
							게시판
						</caption>
						<thead>
							<tr>
								<th class="code">번호</th>
								<th class="title">제목</th>
								<th class="mid">작성자</th>
								<th class="regdate">등록일</th>
								<th class="hit">조회수</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach var="n" items="${blist}">
							<tr>
								<td class="code">${n.code}</td>
								<td class="title"><a href="boardDetail?c=${n.code}">${n.title}</a></td>
								<td class="writer">${n.members_Mid}</td>
								<td class="regdate"><fmt:formatDate pattern="yyyy-MM-dd" value='${n.regDate}'/></td>
								<td class="hit">${n.hit}</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
					<p class="article-comment margin-small">
						<%-- <security:authorize ifAnyGranted="ROLE_ADMIN"> --%>
  							<a class="btn-write button" href="boardReg">글쓰기</a>
   						<%-- </security:authorize> --%>
					</p>
						<c:if test="${empty param.pg }">
                         <c:set var="pg" value="1"></c:set>
                     </c:if>
                     <c:if test="${not empty param.pg }">
                     	 <c:set var="pg" value="${param.pg}"></c:set>
                     </c:if>
               
               <c:set var="gap" value="${(pg-1)%5}"></c:set>
                     <c:set var="starNum" value="${pg-gap}"></c:set>	      
                     
               <c:set var="lastNum" value="${fn:substringBefore((recordCount/10 == 0? recordCount/10 : recordCount/10+1),'.') }"/>
               
               <p id="cur-page" class="margin-small">
                  <span class="strong">${pg}</span> /
                  ${lastNum }page
               </p>
               <div id="pager-wrapper" class="margin-small">
               
               <!-- 페이저가 포함될 영역 -->
               <my:pages/>					
					<%-- <p id="cur-page" class="margin-small">
						<span class="strong">1</span> /
						10	page
					</p>
					<div id="pager-wrapper" class="margin-small">
						<div class="pager clear">
							<p id="btnPrev">
								<a class="button btn-prev"
								href="board.jsp">이전</a>
							</p>
							<ul>
								<li><a class="strong" href="board?pg=1&f=${param.f}&q=${param.q}">1</a></li>
        			  		    <li><a href="board?pg=2&f=${param.f}&q=${param.q}">2</a></li>
        			   			<li><a href="board?pg=3&f=${param.f}&q=${param.q}">3</a></li>
      			       			<li><a href="board?pg=4&f=${param.f}&q=${param.q}">4</a></li>
      				   			<li><a href="board?pg=5&f=${param.f}&q=${param.q}">5</a></li>
							</ul>
							<p id="btnNext">
								<span class="button btn-next">다음</span>
							</p>
						</div> --%>
					</div>