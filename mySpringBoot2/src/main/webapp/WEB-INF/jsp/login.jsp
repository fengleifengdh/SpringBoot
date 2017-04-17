<html>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<head>
<%-- 	<script type="text/javascript" src="${ctx }/webjarslocator/jquery/jquery.js"></script> --%>
<script type="text/javascript" src="${ctx}${urls.getForLookupPath('/static/jquery/jquery.js') }"></script>
 </head>
<body>
<h2>Hello World!12312</h2>
<img alt="" src="${ctx }/static/1.jpg">
<input value="${ctx }" type="text">
<!--  -->
<form action="/login" method="post">
    <div><label> 用户名 : <input type="text" name="username"/> </label></div>
    <div><label> 密 码 : <input type="password" name="password"/> </label></div>
    <div><input type="submit" value="登录"/></div>
</form>
</body>
</html>
