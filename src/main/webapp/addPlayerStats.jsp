<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Dodaj statystyki zawodnika</title>
</head>
<body>

<h2>Dodaj statystyki zawodnika</h2>

<form action="add-player-stats" method="post">
    <label for="playerId">Wybierz zawodnika:</label>
    <select id="playerId" name="playerId" required>
        <c:forEach var="player" items="${players}">
            <option value="${player.id}">${player.fullName}</option>
        </c:forEach>
    </select><br><br>

    <label for="points">Liczba punktów:</label>
    <input type="number" id="points" name="points" required><br><br>

    <label for="assist">Liczba asyst:</label>
    <input type="number" id="assist" name="assist" required><br><br>

    <label for="rebound">Liczba zbiórek:</label>
    <input type="number" id="rebound" name="rebound" required><br><br>

    <input type="submit" value="Dodaj statystyki">
</form>

</body>
</html>
