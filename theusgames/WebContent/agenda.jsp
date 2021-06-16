<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>
<% ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("javabeans"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>TheusGames</title>
<link rel="icon" href="imagens/destaquesite.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<header>
		<!-- layout -->
		<div class="layout">
			<!-- logotipo -->
			<div id="logo">
				<img src="imagens/logotipo.png" alt="logotipo">
			</div>
			<!-- menu cabeçalho -->
			<nav>
				<ul>
					<li><a href="index.html">Home</a></li>
					<li><a href="">Sobre nós</a></li>
					<li><a href="">Conteudo</a></li>
					<li><a href="">Fale conosco</a></li>
				</ul>
			</nav>
			<div id="link">
				<a href="main" target="_blank">Estoque</a>
			</div>
		</div>
	</header>

	<section id="formulario">
		<div class="layout">
			<h1>Estoque loja de Games</h1>
			<a href="novo.html" class="Botao1">Adicionar Produto</a>
			<table id="tabela">
				<thead>
					<tr>
						<th>id game</th>
						<th>Nome</th>
						<th>Valor</th>
						<th>Plataforma</th>
						<th>Quantidade</th>
						<th>Categoria</th>
						
					</tr>
				</thead>

		<tbody>
		<% for (int i = 0; i < lista.size(); i++) { %>
		<tr>
			<td><%=lista.get(i).getIdgame() %></td>
			<td><%=lista.get(i).getNome() %></td>
			<td><%=lista.get(i).getValor() %></td>
			<td><%=lista.get(i).getPlataforma() %></td>
			<td><%=lista.get(i).getQuantidade() %></td>
			<td><%=lista.get(i).getCategoria() %></td>
		</tr>
		<% } %>
		</tbody>
		
			</table>
		</div>
	</section>


	<footer>
		<div class="layout">
			<!-- copyright -->
			<div id="copyright">
				<p>₢2021 - Matheus Cesarini</p>
			</div>
			<!-- Redes sociais -->
			<div id="RedesSocial">
				<a href="http://www.facebook.com" target="_blank"><img
					src="imagens/faceboock.png" alt="Facebook"></a> <a
					href="http://www.instagram.com" target="_blank"><img
					src="imagens/instagram.png" alt="Instagram"></a> <a
					href="http://www.twitter.com" target="_blank"><img
					src="imagens/twiter.png" alt="Twitter"></a> <a
					href="http://www.youtube.com" target="_blank"><img
					src="imagens/youtube.png" alt="You-Tube"></a>

			</div>
		</div>
	</footer>

</body>
</html>