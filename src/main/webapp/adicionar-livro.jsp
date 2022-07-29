<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Adicionar Livro</title>
</head>
<body>
<h1>Adicionar Livro</h1>
<fieldset>
    <legend>Dados do livro</legend>
    <form action="livro-save-servlet" method="post">
        <div>
            <label for="idNomeLivro">Nome do Livro:</label>
            <input type="text" id="idNomeLivro" name="nomeLivro">
        </div>
        <div>
            <label for="idNomeAutor">Nome do Autor:</label>
            <input type="text" id="idNomeAutor" name="nomeAutor">
        </div>
        <input type="submit" value="Enviar">
    </form>
</fieldset>

</body>
</html>