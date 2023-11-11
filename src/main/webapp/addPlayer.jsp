<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj Zawodnika</title>
</head>
<body>
<h2>Dodaj Zawodnika</h2>

<%-- Wyświetl listę drużyn (debugging) --%>
<c:forEach var="team" items="${teams}">
    <p>${team.name}</p>
</c:forEach>

<form action="${pageContext.request.contextPath}/players/add" method="post" modelAttribute="player">
    <label for="firstName">Imię:</label>
    <input type="text" id="firstName" name="firstName" required/><br/>

    <label for="lastName">Nazwisko:</label>
    <input type="text" id="lastName" name="lastName" required/><br/>

    <label for="team">Drużyna:</label>
    <select id="team" name="team.id">
        <option value="">Wybierz drużynę</option>
        <c:forEach var="team" items="${teams}">
            <option value="${team.id}">${team.name}</option>
        </c:forEach>
    </select><br/>

    <input type="submit" value="Dodaj"/>
</form>

<br/>
<a href="${pageContext.request.contextPath}/players">Powrót do listy zawodników</a>
</body>
</html>
