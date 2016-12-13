<%--
  Created by IntelliJ IDEA.
  User: suyx
  Date: 2016/12/12 0012
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>testA</title>
</head>
<body>
1233211234567
<c:forEach var="testData" items="${testList}">
	${testData.id }
	${testData.user_code }
	${testData.user_name }
	${testData.user_password }
	${testData.user_desc }
	
</c:forEach>
</body>
</html>
