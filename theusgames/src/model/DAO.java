package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * camada model do modelo mvc
 * 
 * @author matheus cesarini
 *
 */

public class DAO {
	/* conexão com o banco de dados */
	// parâmetros de conexão
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
		// criar um objeto para conexão com o banco
		Connection con = null;
		// tratamento de exceções
		try {
			// execução do driver
			Class.forName(driver);
			// esta linha executa a conexão
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
			//estabelecer a conexão (método conectar() "abrir a geladeira")
			Connection con = conectar();
			//escrever no console
			System.out.println("teste de conexão");
			System.out.println(con);
			//finalizar a conexão ("fechar a porta da geladeira")
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/* CRUD CREATE */

	/* CRUD READ */

	/* CRUD UPDATE */

	/* CRUD DELETE */
}