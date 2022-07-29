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
<a href="index.jsp">Clique para retornar a página inicial</a>
</body>
</html>
