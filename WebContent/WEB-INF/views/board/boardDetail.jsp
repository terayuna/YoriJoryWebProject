
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

					<h2>게시판</h2>
					<h3 class="hidden">방문페이지위치</h3>
					<ul id="breadscrumb" class="block_hlist">
						<li id="home">
							<a href="">HOME</a>
						</li>
						<li>
							<a href="">고객센터</a>
						</li>
						<li>
							<a href="">공지사항</a>
						</li>
					</ul>
					<div id="notice-article-detail" class="article-detail margin-large" >						
						<dl class="article-detail-row">
							<dt class="article-detail-title">
								제목
							</dt>
							<dd class="article-detail-data">
								<%-- <%=n.getTitle() %>
								${n.title} --%>
								${board.title}
							</dd>
						</dl>
						<dl class="article-detail-row">
							<dt class="article-detail-title">
								작성일
							</dt>
							<dd class="article-detail-data">
								<%-- <%=n.getRegDate() %> --%>
								<%-- ${notice.regDate} --%>
								<fmt:formatDate pattern="yyyy-MM-dd" value='${board.regDate}'/>
							</dd>
						</dl>
						<dl class="article-detail-row half-row">
							<dt class="article-detail-title">
								작성자
							</dt>
							<dd class="article-detail-data half-data" >
								<%-- <%=n.getWriter() %> --%>
								${board.members_Mid}
							</dd>
						</dl>
						<dl class="article-detail-row half-row">
							<dt class="article-detail-title">
								조회수
							</dt>
							<dd class="article-detail-data half-data">
								<%-- <%=n.getHit() %> --%>
								${board.hit}
							</dd>
						</dl>
						<dl class="article-detail-row">
							<dt class="article-detail-title">
								첨부파일
							</dt>
							<dd class="article-detail-data">
								<%-- <% for(NoticeFile nf : files) { %>
									<a href="upload/<%=nf.getSrc()%>"><%=nf.getSrc()%></a>
								<% } %> --%>
							</dd>
						</dl>

						<div class="article-content" >
							<%-- <%=n.getContent()%> --%>
							${board.content}
						</div>
					</div>
					<div>
						<c:forEach var="n" items="${bclist}">
							<tr>
								<td class="writer">${n.members_Mid}</td>
								<td class="content">${n.content}</a></td>
								<td class="regdate"><fmt:formatDate pattern="yyyy-MM-dd" value='${n.regDate}'/></td>
								</br>
							</tr>
						</c:forEach>
						<security:authorize ifAnyGranted="ROLE_USER, ROLE_ADMIN">
							<form action="boardCommentReg?c=${c}" method="post" >
								<textarea id="txtComment" class="txtComment" name="content"></textarea>
								<input class="" type="submit" value="저장" />
							</form>
						</security:authorize>
					</div>
					<p class="article-comment margin-small">
						<a class="btn-list button" href="board">목록</a>						
						<a class="btn-edit button" href="boardEdit">수정</a>
						<a class="btn-del button" href="boardDel">삭제</a>
					</p>
					<div class="margin-small" style="border-top: 1px solid #dfdfdf;">
						<dl class="article-detail-row">
							<dt class="article-detail-title">
								▲ 다음글
							</dt>
							<dd class="article-detail-data">
								<c:if test="${next==null}">
								<span>다음글이 없습니다.</span>
								</c:if>
								<c:if test="${next!=null}">
								<a href="boardDetail?c=${next.code}">${next.title}</a>
								</c:if>
							</dd>
						</dl>
						<dl class="article-detail-row">
							<dt class="article-detail-title">
								▼ 이전글
							</dt>
							<dd class="article-detail-data">
								<a href="boardDetail?c=${prev.code}">${prev.title}</a>
							</dd>
						</dl>
					</div>