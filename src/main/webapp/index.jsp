<html>
<head>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h2>Hello World!</h2>

    <form action="http://localhost:8080/sistema-financeiro-web/depositar" method="POST">
        <%-- esse name referencia o valor que chega para o getParameter() --%>
        <input type="text" name="nome"/>
        <input type="text" name="sobrenome"/>
        <input type="text" name="valor"/>

        <input type="submit" value="depositar"/>
    </form>
</body>
</html>
