<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"	isELIgnored="false"
	%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
  request.setCharacterEncoding("UTF-8");
%>  

<div id="ad_main_banner">
	<ul class="bjqs">	 	
	  <li><img width="775" height="145" src="${contextPath}/resources/image/main_banner01.jpg"></li>
		<li><img width="775" height="145" src="${contextPath}/resources/image/main_banner02.jpg"></li>
		<li><img width="775" height="145" src="${contextPath}/resources/image/main_banner03.jpg"></li> 
	</ul>
</div>
<div class="main_book">
   <c:set  var="goods_count" value="0" />
	<h3>베스트셀러</h3>
	<c:forEach var="item" items="${goodsMap.bestseller}">
	   <c:set  var="goods_count" value="${goods_count+1 }" />
		<div class="book">
			<a href="${contextPath}/goods/goodsDetail.do?goods_id=${item.goodsId }">
			<img class="link"  src="${contextPath}/resources/image/1px.gif"> 
			</a> 
				<img width="180" height="190" 
				     src="${contextPath}/thumbnails.do?goods_id=${item.goodsId}&fileName=${item.filename}">

			<div class="title">${item.goodsTitle}</div>
			<div class="price">
		  	   <fmt:formatNumber  value="${item.goodsPrice}" type="number" var="goodsPrice" />
		          ${goodsPrice}원
			</div>
		</div>
	   <c:if test="${goods_count==15 }">
         <div class="book">
           <font size=20> <a href="#">more</a></font>
         </div>
     </c:if>
  </c:forEach>
</div>