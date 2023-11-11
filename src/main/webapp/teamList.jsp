<form action="${pageContext.request.contextPath}/players/add" method="post" modelAttribute="player">
  <!-- Inne pola formularza -->

  <label for="team">Drużyna:</label>
  <select id="team" name="team.id">
    <option value="">Wybierz drużynę</option>
    <c:forEach var="team" items="${teams}">
      <option value="${team.id}">${team.name}</option>
    </c:forEach>
  </select><br/>

  <input type="submit" value="Dodaj"/>
</form>
