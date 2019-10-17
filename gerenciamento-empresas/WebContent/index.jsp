<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.jsp"></c:import>
<section class="container">
	<div class="frm">
		<form action="login" method="POST">
		<label for="email">E-mail</label>
		<input id="email" name="email" type="text" placeholder="Digite seu e-mail">
			<br/>
		<label for="senha"></label>
		<input id="senha" name="senha" type="password" placeholder="Digite sua senha">
		<button type="submit">Logar</button>
		</form>
		<c:if test="${not empty erro}">
			<p>${erro}</p>
		</c:if>
	</div>
	
</section>

<c:import url="footer.jsp"></c:import>
