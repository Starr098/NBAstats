<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Wyniki meczów</title>
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
<h1>Wyniki meczów</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Drużyna gospodarzy</th>
        <th>Drużyna gości</th>
        <th>Data meczu</th>
        <th>Wynik</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="matchResult" items="${matchResults}">
        <tr>
            <td>${matchResult.id}</td>
            <td>${matchResult.homeTeam.name}</td>
            <td>${matchResult.awayTeam.name}</td>
            <td>${matchResult.matchDate}</td>
            <td>${matchResult.homeTeamScore} - ${matchResult.awayTeamScore}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
