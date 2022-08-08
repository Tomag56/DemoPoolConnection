<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="<%=request.getContextPath()%>/TesterPoolConnection">Test connection contextes </a> <!-- Tester la conf pour acceder à la BDD avis -->

</body>
</html>