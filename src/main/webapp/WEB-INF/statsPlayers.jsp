<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Statystyki zawodników</title>
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
</head>
<body>
<h1>Statystyki wszystkich zawodników</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Imię</th>
        <th>Nazwisko</th>
        <th>Punkty</th>
        <th>Asysty</th>
        <th>Zbiórki</th>
    </tr>
    <c:forEach var="statsPlayer" items="${statsPlayers}">
        <tr>
            <td>${statsPlayer.id}</td>
            <td>${statsPlayer.player.firstName}</td>
            <td>${statsPlayer.player.lastName}</td>
            <td>${statsPlayer.points}</td>
            <td>${statsPlayer.assist}</td>
            <td>${statsPlayer.rebound}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
