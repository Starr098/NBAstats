
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dodaj Zawodnika</title>
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
<h2>Dodaj Zawodnika</h2>

<form action="${pageContext.request.contextPath}/players/add" method="post" modelAttribute="player">
    <label for="firstName">Imię:</label>
    <input type="text" id="firstName" name="firstName" required/><br/>

    <label for="lastName">Nazwisko:</label>
    <input type="text" id="lastName" name="lastName" required/><br/>

    <label for="team">Drużyna:</label>
    <select id="team" name="team.id">
        <option value="">Wybierz drużynę</option>
        <c:forEach var="team" items="${teams}">
            <option value="${team.id}">${team.name}</option>
        </c:forEach>
    </select><br/>

    <input type="submit" value="Dodaj"/>
</form>

<br/>
<a href="${pageContext.request.contextPath}/players">Powrót do listy zawodników</a>
</body>
</html>
