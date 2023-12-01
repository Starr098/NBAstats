<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Panel Statystyk</title>
  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/styles.css"/>">
  <style>
    body {
      margin: 0;
      padding: 0;
      font-family: Arial, sans-serif;
      background-image: url('<c:url value="/resources/images/background.jpg"/>');
      background-size: cover;
      background-repeat: no-repeat;
    }

    .container {
      display: flex;
      justify-content: space-between;
      align-items: flex-start;
      padding: 20px;
      color: #333;
    }

    .navigation-panel {
      width: 20%;
      padding: 20px;
      background-color: rgba(240, 240, 240, 0.8);
    }

    .panel {
      width: 75%;
      padding: 20px;
      background-color: rgba(255, 255, 255, 0.8);
    }

    .panel h2 {
      margin-top: 0;
      padding-bottom: 10px;
      border-bottom: 1px solid #ccc;
    }

    .panel a {
      display: block;
      margin-bottom: 10px;
      text-decoration: none;
      color: #333;
      transition: color 0.3s ease-in-out;
    }

    .panel a:hover {
      color: #555;
    }
  </style>
</head>
<body>

<div class="container">

  <div class="navigation-panel">
    <h2>Nawigacja</h2>
    <ul>
      <li><a href="/match-results/all">Wszystkie rezultaty spotkań</a></li>
      <li><a href="/stats-players/">Wszystkie statystyki zawodników</a></li>
      <li><a href="/stats-teams/all">Wszystkie statystyki drużyn</a></li>
      <li><a href="/stats-players/players/stats">Średnie statystyki zawodnika</a></li>
    </ul>
  </div>

  <div class="panel">
    <h1>Panel Statystyk</h1>
    <h2>Zawodnicy</h2>
    <a href="/players/add-form">Dodaj zawodnika</a>
    <a href="/stats-players/add-form">Dodaj statystyki zawodnika</a>
    <h2>Drużyny</h2>
    <a href="/teams/add-form">Dodaj drużyne</a>
    <a href="/stats-teams/add-form">Dodaj statystyki drużyny</a>
    <h2>Mecze</h2>
    <a href="/match-results/add-form">Dodaj rezultat meczu</a>
  </div>
</div>

</body>
</html>
