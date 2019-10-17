<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.jsp"></c:import>

<section class="container">
	<!-- Exiba o email do usuário junto com uma saudação -->
	<p class="greeting">Seja bem vindo, ${usuario.email} </p>
	
	<hr/>
	<h2>Cadastrar Nova Empresa</h2>
	
	<!-- Mensagem de cadastro com sucesso deve ser exibida aqui -->
	<p>${deubom}</p>
	<!-- Formulário para cadastrar nova empresa -->
	<div class="frm">
		<form action="cadastrar" method="POST">
			<label for="nome">Nome da empresa</label>
			<input id="nome" name="nome" type="text" required/>
			<button type="submit">Cadastrar empresa</button>
		</form>
	</div>
	<hr/>
	<h2>Empresas Cadastradas</h2>
	
	<!-- Formulário para filtrar as empresas cadastradas -->
	<div class="frm">
		<form action="cadastrar" method="GET">
			<label for="nome">Nome da empresa</label>
			<input id="nome" name="name" type="text"/>
			<button type="submit">filtrar empresa</button>
		</form>
	</div>
	<ul>
		<c:forEach var="empresa" items="${empresas}">
			<li>${empresa.id} - ${empresa.nome}</li>
		</c:forEach>
	</ul>
	
</section>

<c:import url="footer.jsp"></c:import>
