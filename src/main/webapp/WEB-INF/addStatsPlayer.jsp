<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dodaj statystyki zawodnika</title>
</head>
<body>
<h1>Dodaj statystyki zawodnika</h1>
<form action="/stats-players/add" method="post">
    <label for="player">Wybierz zawodnika:</label>
    <select id="player" name="player.id">
        <option value="">Wybierz zawodnika</option>
        <c:forEach var="player" items="${players}">
            <option value="${player.id}">${player.firstName} ${player.lastName}</option>
        </c:forEach>
    </select><br/>

    <label for="team">Wybierz drużynę:</label>
    <select id="team" name="team.id">
        <option value="">Wybierz drużynę</option>
        <c:forEach var="team" items="${teams}">
            <option value="${team.id}">${team.name}</option>
        </c:forEach>
    </select><br/>

    <label for="points">Punkty:</label>
    <input type="number" id="points" name="points"><br/>

    <label for="assist">Asysty:</label>
    <input type="number" id="assist" name="assist"><br/>

    <label for="rebound">Zbiórki:</label>
    <input type="number" id="rebound" name="rebound"><br/>

    <input type="submit" value="Dodaj statystyki">
</form>
</body>
</html>

