<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>Wszystkie statystyki drużyn</h1>

<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4;
    }

    h1 {
        text-align: center;
        padding: 20px 0;
    }

    table {
        width: 80%;
        margin: 20px auto;
        border-collapse: collapse;
        background-color: #fff;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    th, td {
        padding: 10px;
        border: 1px solid #ddd;
        text-align: left;
    }

    th {
        background-color: #f2f2f2;
    }

    tr:nth-child(even) {
        background-color: #f9f9f9;
    }

    tr:hover {
        background-color: #f2f2f2;
    }
</style>
<form action="${pageContext.request.contextPath}/stats-teams" method="get">
    <label for="teamId">Wybierz drużynę:</label>
    <select id="teamId" name="teamId">
        <option value="">Wybierz drużynę</option>
        <c:forEach var="statsTeam" items="${statsTeams}">
            <option value="${statsTeam.team.id}">${statsTeam.team.name}</option>
        </c:forEach>
    </select>

    <label for="sort">Sortuj według:</label>
    <select id="sort" name="sort">
        <option value="wins">Najwięcej wygranych</option>
        <option value="lose">Najwięcej przegranych</option>
    </select>

    <input type="submit" value="Pokaż statystyki">
</form>

<table>
    <thead>
    <tr>
        <th>Nazwa drużyny</th>
        <th>Zwycięstwa</th>
        <th>Porażki</th>
        <th>Rzuty</th>
        <th>Stracone</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="statsTeam" items="${statsTeams}">
        <tr>
            <td>${statsTeam.team.name}</td>
            <td>${statsTeam.wins}</td>
            <td>${statsTeam.lose}</td>
            <td>${statsTeam.thrown}</td>
            <td>${statsTeam.lost}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

