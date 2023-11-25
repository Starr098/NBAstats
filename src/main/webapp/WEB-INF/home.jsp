<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Panel Zbiorczy</title>
</head>
<body>

<!-- Panel nawigacyjny po lewej stronie -->
<div style="float: left; width: 20%; padding: 10px; background-color: #f0f0f0;">
  <h2>Nawigacja</h2>
  <ul>
    <li><a href="/match-results/all">Wszystkie statystyki drużyn</a></li>
    <li><a href="/stats-players/all">Wszystkie statystyki zawodników</a></li>
    <!-- Dodaj inne linki do innych formularzy -->
  </ul>
</div>

<!-- Treść strony (dynamicznie ładowana) -->
<div style="margin-left: 22%;">
  <%-- Tutaj dynamicznie ładowane treści z kontrolerów --%>
  <%@ include file="/WEB-INF/teamList.jsp" %>
</div>

</body>
</html>
