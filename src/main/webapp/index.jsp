<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Witaj na stronie :)</title>
    <style>
        #div1{
            background: #8e5a17;
            height: 100px;
        }
    </style>
</head>
<body>
    <h1><%= "Witaj na mojej stronie!" %> </h1>
    <form method="post" action="witaj">
        <label for="imie"> Imię: </label>
        <input type="text" id="imie" name="imie">
        <input type="submit" value="Zatwierdź!">
    </form>

    <a href="witaj">Witaj servlet!</a>
</body>
</html>