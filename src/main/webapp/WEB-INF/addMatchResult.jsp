<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dodaj wynik meczu</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            padding: 20px 0;
        }

        form {
            width: 60%;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label, input, select {
            display: block;
            margin-bottom: 10px;
        }

        input[type="date"],
        input[type="number"],
        select {
            width: calc(100% - 20px);
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 5px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            border: none;
            border-radius: 5px;
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
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
