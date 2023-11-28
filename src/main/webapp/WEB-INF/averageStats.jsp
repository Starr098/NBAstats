<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Statystyki wszystkich zawodników</title>
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
<table border="1">
    <thead>
    <tr>
        <th>Imię</th>
        <th>Nazwisko</th>
        <th>Średnia punktów</th>
        <th>Średnia asyst</th>
        <th>Średnia zbiórek</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="playerStats" items="${playerStatsInfoList}">
        <tr>
            <td>${playerStats.firstName}</td>
            <td>${playerStats.lastName}</td>
            <td>${playerStats.pointsAverage}</td>
            <td>${playerStats.assistAverage}</td>
            <td>${playerStats.reboundAverage}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<h1>Statystyki wszystkich zawodników</h1>


</body>
</html>
