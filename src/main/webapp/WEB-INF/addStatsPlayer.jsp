<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dodaj statystyki zawodnika</title>
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
<h1>Dodaj statystyki zawodnika</h1>
<form action="/stats-players/add" method="post">
    <label for="player">Wybierz zawodnika:</label>
    <select id="player" name="player.id">
        <option value="">Wybierz zawodnika</option>
        <c:forEach var="player" items="${players}">
            <option value="${player.id}">${player.firstName} ${player.lastName}</option>
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

