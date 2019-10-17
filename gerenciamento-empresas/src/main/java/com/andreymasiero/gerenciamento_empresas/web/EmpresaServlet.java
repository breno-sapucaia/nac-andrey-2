package com.andreymasiero.gerenciamento_empresas.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andreymasiero.gerenciamento_empresas.dao.EmpresaDAO;
import com.andreymasiero.gerenciamento_empresas.entities.Empresa;

/**
 * Servlet responsavel pelas operações realizadas com a classe
 * Empresa
 * 
 */
@WebServlet({"/filtrar", "/cadastrar"})
public class EmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = -8983188207894532670L;
	
	/**
	 * Quando a requisição chegar pelo pattern filtrar o sistema deve 
	 * buscar todas as empresas que contenham alguma letra digitada.
	 * - Em caso do filtro vazio, todas as empresas cadastradas são
	 * retornadas.
	 * 
	 * Após isso, uma coleção de empresas deve ser retornada para a 
	 * página gerenciador.jsp como atributo para ser exibido ao usuário.
	 * 
	 * @param HttpServletRequest
	 * @param HttpServletResponse
	 * @throws ServletException, IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException {
		String nome = req.getParameter("name");
		EmpresaDAO dao = new EmpresaDAO();
		req.setAttribute("empresas", dao.buscaPorSimilaridade(nome));
		req.getRequestDispatcher("gerenciador.jsp").forward(req,resp);
	}
	
	/**
	 * Quando a requisição chegar pelo pattern cadastrar o sistema deve 
	 * inserir a nova empresa no banco de dados através da DAO.
	 * 
	 * Após isso, a nova empresa deve ser retornada para a 
	 * página gerenciador.jsp como atributo para ser exibido ao usuário,
	 * como mensagem de sucesso.
	 * 
	 * @param HttpServletRequest
	 * @param HttpServletResponse
	 * @throws ServletException, IOException
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String nome = req.getParameter("nome");
		
		EmpresaDAO dao = new EmpresaDAO();
		dao.adiciona(new Empresa(nome));
		
		req.setAttribute("deubom", "empresa cadastrada com sucesso");
		req.removeAttribute("name");
		this.doGet(req, resp);
	}

}
