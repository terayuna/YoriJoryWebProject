<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:if test="${empty param.pg }">
	<c:set var="pg" value="1"></c:set>
</c:if>
<c:if test="${not empty param.pg }">
	<c:set var="pg" value="${param.pg}"></c:set>
</c:if>

<c:set var="gap" value="${(pg-1)%5}"></c:set>
<c:set var="starNum" value="${pg-gap}"></c:set>

<c:set var="lastNum"
	value="${fn:substringBefore((recordCount/10 == 0? recordCount/10 : recordCount/10+1),'.') }" />

<div class="pager clear">
	<p id="btnPrev">
		<c:if test="${starNum ==1 }">
			<span class="button btn-prev">이전</span>
		</c:if>

		<c:if test="${starNum > 1 }">
			<a class="button btn-prev" href="?pg=${starNum-5}&f=${param.f}&q=${param.q}">이전</a>
		</c:if>
	</p>
	<ul>

		<c:forEach var="i" begin="${starNum}" end="${starNum+4}">
			<c:if test="${i <= lastNum }">
				<li><c:if test="${i==pg}">
						<a class="strong" href="?pg=${i}&f=${param.f}&q=${param.q}">${i}</a>
					</c:if> <c:if test="${i!=pg}">
						<a href="?pg=${i}&f=${param.f}&q=${param.q}">${i}</a>
					</c:if></li>
			</c:if>
		</c:forEach>
	</ul>

	<p id="btnNext">
		<c:if test="${lastNum <= starNum + 4 }">
			<span class="button btn-next">다음</span>
		</c:if>
		<c:if test="${lastNum > starNum + 4 }">
			<a class="button btn-next"
				href="?pg=${starNum+5}&f=${param.f}&q=${param.q}">다음</a>
		</c:if>
	</p>
</div>