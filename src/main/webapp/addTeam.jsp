<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj Drużynę</title>
</head>
<body>
<h2>Dodaj Drużynę</h2>

<form action="${pageContext.request.contextPath}/teams/add" method="post" modelAttribute="team">
    <label for="name">Nazwa drużyny:</label>
    <input type="text" id="name" name="name" required/><br/>

    <input type="submit" value="Dodaj"/>
</form>

<br/>
<a href="${pageContext.request.contextPath}/teams">Powrót do listy drużyn</a>
</body>
</html>
