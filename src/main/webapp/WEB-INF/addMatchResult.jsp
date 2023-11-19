<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dodaj wynik meczu</title>
</head>
<body>
<h1>Dodaj wynik meczu</h1>
<form action="/match-results/add" method="post">
    <label for="homeTeam">Drużyna gospodarzy:</label>
    <select id="homeTeam" name="homeTeam.id">
        <option value="">Wybierz drużynę gospodarzy</option>
        <%-- Pętla foreach do wyświetlenia drużyn gospodarzy z przekazanej listy --%>
        <c:forEach var="team" items="${teams}">
            <option value="${team.id}">${team.name}</option>
        </c:forEach>
    </select><br/>

    <label for="awayTeam">Drużyna gości:</label>
    <select id="awayTeam" name="awayTeam.id">
        <option value="">Wybierz drużynę gości</option>
        <%-- Pętla foreach do wyświetlenia drużyn gości z przekazanej listy --%>
        <c:forEach var="team" items="${teams}">
            <option value="${team.id}">${team.name}</option>
        </c:forEach>
    </select><br/>

    <label for="matchDate">Data meczu:</label>
    <input type="date" id="matchDate" name="matchDate"><br/>

    <label for="homeTeamScore">Punkty drużyny gospodarzy:</label>
    <input type="number" id="homeTeamScore" name="homeTeamScore"><br/>

    <label for="awayTeamScore">Punkty drużyny gości:</label>
    <input type="number" id="awayTeamScore" name="awayTeamScore"><br/>

    <input type="submit" value="Dodaj wynik">
</form>
</body>
</html>
