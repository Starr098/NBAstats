<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Dodaj wynik meczu</title>
</head>
<body>

<h2>Dodaj wynik meczu</h2>

<form action="add-match-result" method="post">
  <label for="matchDate">Data meczu:</label>
  <input type="date" id="matchDate" name="matchDate" required><br><br>

  <label for="homeTeam">Drużyna domowa:</label>
  <select id="homeTeam" name="homeTeam" required>
    <c:forEach var="team" items="${teams}">
      <option value="${team.id}">${team.name}</option>
    </c:forEach>
  </select><br><br>

  <label for="awayTeam">Drużyna wyjazdowa:</label>
  <select id="awayTeam" name="awayTeam" required>
    <c:forEach var="team" items="${teams}">
      <option value="${team.id}">${team.name}</option>
    </c:forEach>
  </select><br><br>

  <label for="homeTeamPoints">Punkty drużyny domowej:</label>
  <input type="number" id="homeTeamPoints" name="homeTeamPoints" required><br><br>

  <label for="awayTeamPoints">Punkty drużyny wyjazdowej:</label>
  <input type="number" id="awayTeamPoints" name="awayTeamPoints" required><br><br>

  <input type="submit" value="Dodaj wynik">
</form>

</body>
</html>
