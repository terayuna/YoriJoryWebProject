<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

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
        var tbody=document.querySelector("#notices tbody");
        
        tbody.innerHTML=request.responseText;
     }
   };

  request.open("GET", "noticePartial?pg="+page+"&f="+param.f+"&q="+param.q, true); //요청방식, 사용자가 요청할 URL, 동기-비동기 결정
  request.send(null);
  
     
     return false;
  };
 
</script>
    				<h2>공지사항</h2>
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
					<h3 class="hidden">공지사항 목록</h3>
					<form id="content-searchform" class="article-search-form" action="notice" method="get">
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
							<input type="text" name="q" value="${param.q}" />
							<input type="submit" value="검색" />
						</fieldset>
					</form>
					<table class="article-list margin-small">
						<caption class="hidden">
							공지사항
						</caption>
						<thead>
							<tr>
								<th class="seq">번호</th>
								<th class="title">조회수</th>
								<th class="writer">작성자</th>
								<th class="regdate">등록일</th>
								<th class="hit">조회수</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach var="n" items="${list}">
							<tr>
								<td class="seq">${n.code}</td>
								<td class="title"><a href="noticeDetail?c=${n.code}">${n.title}</a></td>
								<td class="writer">${n.admin_Mid}</td>
								<td class="regdate"><fmt:formatDate pattern="yyyy-MM-dd" value='${n.regDate}'/></td>
								<td class="hit">${n.hit}</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
					<p class="article-comment margin-small">
						<security:authorize ifAnyGranted="ROLE_ADMIN">
							<a class="btn-write button" href="noticeReg">글쓰기</a>
						</security:authorize>
					</p>					
					<p id="cur-page" class="margin-small">
						<span class="strong">1</span> /
						10	page
					</p>
					<div id="pager-wrapper" class="margin-small">
						<div class="pager clear">
							<p id="btnPrev">
								<a class="button btn-prev"
								href="notice.jsp">이전</a>
							</p>
							<ul>
								<li><a class="strong" href="notice?pg=1&f=${param.f}&q=${param.q}">1</a></li>
        			  		    <li><a href="notice?pg=2&f=${param.f}&q=${param.q}">2</a></li>
        			   			<li><a href="notice?pg=3&f=${param.f}&q=${param.q}">3</a></li>
      			       			<li><a href="notice?pg=4&f=${param.f}&q=${param.q}">4</a></li>
      				   			<li><a href="notice?pg=5&f=${param.f}&q=${param.q}">5</a></li>
							</ul>
							<p id="btnNext">
								<span class="button btn-next">다음</span>
							</p>
						</div>
					</div>