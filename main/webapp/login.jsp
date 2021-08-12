<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./css/global.css">
<link rel="stylesheet" href="./css/login.css">
<meta charset="ISO-8859-1"  name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>
</head>
<body>
	<div class="container">
		<img src="https://logopond.com/logos/dbd8fbd6c1d62148ebe7caac8fc842df.png"/>
		<form class="login" action="<%=request.getContextPath()%>/login" method="post">
			<label>
				<span>Email</span>
				<input type="text" placeholder="Digite seu email">
			</label>
			<label>
				<span>Senha</span>
				<input type="password" placeholder="Digite sua senha">
			</label>
			<label>
				<button>Entrar</button>
			</label>			
		</form>
	</div>
</body>
</html>