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
			//estabelecer a conex�o (m�todo conectar() "abrir a geladeira")
			Connection con = conectar();
			//escrever no console
			System.out.println("teste de conex�o");
			System.out.println(con);
			//finalizar a conex�o ("fechar a porta da geladeira")
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