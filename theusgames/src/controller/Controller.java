package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;

/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = { "/Controller", "/main", "/insert" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// criar objetos para acessar a camada model
	JavaBeans javabeans = new JavaBeans();
	DAO dao = new DAO();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// teste de conexão
		// dao.testarConexao();
		// a linha abaixo cria uma variavel que recebe a requisição
		String action = request.getServletPath();
		System.out.println(action);
		// encaminhamento das requisições
		if (action.contentEquals("/main")) {
			// encaminhar para o metodo contatos
			produto(request, response);
		} else if (action.equals("/insert")) {
			// encaminhar para o metodo adicionarProduto()
			adicionarProduto(request, response);
		}
	}

	// selecionar produto (CRUD Read)
	protected void produto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// executar o metodo DAO para listar todos os produtos do banco armazenando o
		// resultando em uma nova lista
		ArrayList<JavaBeans> lista = dao.listarProduto();
		// despachar a lista para o documento agenda.jsp
				request.setAttribute("javabeans", lista);
				RequestDispatcher rd = request.getRequestDispatcher("agenda.jsp");
				rd.forward(request, response);
		
		// encaminhar ao documento agenda.jsp
		// response.sendRedirect("agenda.jsp");
	}

	// selecionar produtos (CRUD Read)
	protected void adicionarProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// setar as variaveis javabeans
		// request.getparameter("nome") captura o conteudo do campo nome do formulario
		// novo
		// javabeans,SetNome() armazena o nome do produto na variavel da classe
		// JavaBeans
		javabeans.setNome(request.getParameter("nome"));
		javabeans.setValor(request.getParameter("valor"));
		javabeans.setPlataforma(request.getParameter("plataforma"));
		javabeans.setQuantidade(request.getParameter("quantidade"));
		javabeans.setCategoria(request.getParameter("categoria"));
		// a linha abaixo executa o metodo inserirContato() da classe DAO, passando o
		// objeto JavaBeans como parametro (passo 6)
		dao.inserirProduto(javabeans);
		// encaminhar ao documento agenda.jsp (passo 10)
		response.sendRedirect("main");
	}
}