<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/EOP/novoPaciente" var="linkServletNovoPaciente"/>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/global.css">
    <link rel="stylesheet" href="./css/cadastro.css">
    <title>Cadastro</title>
</head>

<body>
    <div class="container">
        <h1>Cadastro - Paciente</h1>
        <form action="${linkServletNovoPaciente }" method="POST">
            <label>Nome:</label>
            <input type="text" placeholder="Insira o nome" name="nome" />

            <label>CPF: </label>
            <input type="number" placeholder="Insira o CPF" />

            <label>E-mail: </label>
            <input type="email" placeholder="Insira seu e-mail" />

            <label>Data de Nascimento: </label>
            <input type="date" placeholder="Insira a data de nascimento" />

            <label>Senha: </label>
            <input type="password" />

            <label>Telefone: </label>
            <input
                type="text"
                placeholder="Ex.: (00) 0000-0000"
            />
            
            <label>Celular: </label>
            <input
                type="text"
                placeholder="Ex.: (00) 00000-0000"
            />
            
            <label>Endereço: </label>
            <input type="text" placeholder="Ex: 999.999.999-99" />
            <label>Número: </label>
            <input type="text" placeholder="Ex: 9999" />
            <label>Complemento: </label>
            <input type="text" />
            <label>CEP: </label>
            <input type="text" placeholder="Ex: 99.999-999" />

            <button type="submit">Enviar</button>
        </form>
    </div>
</body>

</html>
    