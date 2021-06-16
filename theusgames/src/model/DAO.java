package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * camada model do modelo mvc
 * 
 * @author matheus cesarini
 *
 */

public class DAO {
	/* conex�o com o banco de dados */
	// par�metros de conex�o
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://10.26.49.100:3306/dbgames?useTimezone=true&serverTimezone=UTC";
	private String user = "matheus";
	private String password = "Senac@123456";

	/**
	 * conexao com o banco de dados
	 * 
	 * @return con
	 */
	private Connection conectar() {
		// criar um objeto para conex�o com o banco
		Connection con = null;
		// tratamento de exce��es
		try {
			// execu��o do driver
			Class.forName(driver);
			// esta linha executa a conex�o
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * teste de conexao
	 */
	public void testarConexao() {
		try {
			// estabelecer a conex�o (m�todo conectar() "abrir a geladeira")
			Connection con = conectar();
			// escrever no console
			System.out.println("teste de conex�o");
			System.out.println(con);
			// finalizar a conex�o ("fechar a porta da geladeira")
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/* CRUD CREATE */
	public void inserirProduto(JavaBeans javabeans) {
		// query (comando SQL para inserir um contato)
		String create = "insert into games(nome,valor,plataforma,quantidade,categoria) values(?,?,?,?,?)";
		// tratamento de exce��es
		try {
			// abrir a conex�o com o banco de dados
			Connection con = conectar();
			// passos 7 e 8 pegar os dados do contato da classe JavaBeans e substituir as
			// ??? para armazenar no banco de dados
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, javabeans.getNome());
			pst.setString(2, javabeans.getValor());
			pst.setString(3, javabeans.getPlataforma());
			pst.setString(4, javabeans.getQuantidade());
			pst.setString(5, javabeans.getCategoria());
			// executar a query (comando SQL) gravando os dados no banco
			pst.executeUpdate();
			// n�o esquecer de encerrar a conex�o
			con.close();

		} catch (Exception e) {
			System.out.println(e);

		}
	}

	/* CRUD READ */
//arraylist > trabalha as variaveis com varios conteudos como se fosse uma lista
// dinamica
	public ArrayList<JavaBeans> listarProduto() {
		// criar um objeto para armazenar a lista no javabeans
		ArrayList<JavaBeans> javabeans = new ArrayList<>();

		// criar uma variavel para executar a query (comando do banco de dados)
		String read = "select * from games order by nome";

		// tratamento de exe��es (n�o � possivel a resolus�o pelo desenvolvedor)
		try {
			// se tudo ok, abrir a conex�o com o banco
			Connection con = conectar();

			// preparar a conex�o (exucu��o da query(comando sql))
			PreparedStatement pst = con.prepareStatement(read);

			// executar a query(comando)
			ResultSet rs = pst.executeQuery();

			// enquanto houver produtos no banco
			while (rs.next()) {
				// armazenar os produtos na lista(arraylist)
				String idgame = rs.getString(1);
				String nome = rs.getString(2);
				String valor = rs.getString(3);
				String plataforma = rs.getString(4);
				String quantidade = rs.getString(5);
				String categoria = rs.getString(6);
				javabeans.add(new JavaBeans(idgame, nome, valor, plataforma, quantidade, categoria));

			}
			// fechar a conex�o
			con.close();
			return javabeans;

			// caso ocorra uma exce��o, mostrar(e)
		} catch (Exception e) {
			// System.out.println > escrever no console (desenvolvedor)
			System.out.println(e);
			// encerrar a conex�o
			return null;

		}
	}
}

/* CRUD UPDATE */

/* CRUD DELETE */
