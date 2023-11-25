<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dodaj/Aktualizuj statystyki drużyny</title>
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

        input[type="text"], select {
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

        a {
            display: block;
            margin-top: 20px;
            text-align: center;
            color: #007bff;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<h1>Dodaj/Aktualizuj statystyki drużyny</h1>

<form action="/stats-teams/add" method="post">
    <label for="teamId">Wybierz drużynę:</label>
    <select id="teamId" name="team.id">
        <option value="">Wybierz drużynę</option>
        <c:forEach var="team" items="${teams}">
            <option value="${team.id}">${team.name}</option>
        </c:forEach>
    </select><br/>

    <label for="wins">Liczba zwycięstw:</label>
    <input type="number" id="wins" name="wins"><br/>

    <label for="lose">Liczba porażek:</label>
    <input type="number" id="lose" name="lose"><br/>

    <label for="thrown">Liczba rzutów:</label>
    <input type="number" id="thrown" name="thrown"><br/>

    <label for="lost">Liczba straconych:</label>
    <input type="number" id="lost" name="lost"><br/>

    <input type="submit" value="Dodaj statystyki">
</form>

<h1>Aktualizuj statystyki drużyny</h1>
<form action="/stats-teams/update" method="post">
    <label for="teamIdUpdate">Wybierz drużynę:</label>
    <select id="teamIdUpdate" name="team.id">
        <option value="">Wybierz drużynę</option>
        <c:forEach var="team" items="${teams}">
            <option value="${team.id}">${team.name}</option>
        </c:forEach>
    </select><br/>

    <label for="winsUpdate">Dodaj zwycięstwa:</label>
    <input type="number" id="winsUpdate" name="wins"><br/>

    <label for="loseUpdate">Dodaj porażki:</label>
    <input type="number" id="loseUpdate" name="lose"><br/>

    <label for="thrownUpdate">Dodaj rzuty:</label>
    <input type="number" id="thrownUpdate" name="thrown"><br/>

    <label for="lostUpdate">Dodaj stracone:</label>
    <input type="number" id="lostUpdate" name="lost"><br/>

    <input type="submit" value="Aktualizuj statystyki">
</form>
</body>
</html>