<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"	%>
<html>
<head>
    <title>Lista de Livros</title>
</head>
<body>
<h1>Lista de Livros</h1>
<table border="solid">
    <tr>
        <th>ID</th>
        <th>Livro</th>
        <th>Autor</th>
    </tr>
    <c:forEach var="listaLivros" items="${listaLivros}" varStatus="id">
        <tr>
            <td>${id.count}</td>
            <td>${listaLivros.nomeLivro}</td>
            <td>${listaLivros.nomeAutor}</td>
        </tr>
    </c:forEach>
</table>
<br><br>

<fieldset>
    <legend>Digite o nome do livro que deseja deletar</legend>
    <form action="deletar-livro-servlet">
        <div>
            <label for="idNomeLivro">Nome do Livro:</label>
            <input type="text" id="idNomeLivro" name="nomeLivro">
        </div>
        <input type="submit" value="Enviar">
    </form>
</fieldset>
</body>
</html>