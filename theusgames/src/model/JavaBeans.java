package model;

/**
 * Encapsulamneto dos dados (fluxo)
 * 
 * @author matheus cesarini
 *
 */

public class JavaBeans {
	// variáveis encapsuladas usadas no fluxo
	private String idgame;
	private String nome;
	private String valor;
	private String plataforma;
	private String quantidade;
	private String categoria;

	/**
	 * idgame
	 * 
	 * @return idgame
	 */
	public String getIdgame() {
		return idgame;
	}

	/**
	 * idgame
	 * 
	 * @param idgame
	 */
	public void setIdgame(String idgame) {
		this.idgame = idgame;
	}

	/**
	 * nome
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * nome
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * valor
	 * 
	 * @return valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * valor
	 * 
	 * @param valor
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	/**
	 * plataforma
	 * 
	 * @return plataforma
	 */
	public String getPlataforma() {
		return plataforma;
	}

	/**
	 * plataforma
	 * 
	 * @param plataforma
	 */
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	/**
	 * quantidade
	 * 
	 * @return quantidade
	 */
	public String getQuantidade() {
		return quantidade;
	}

	/**
	 * quantidade
	 * 
	 * @param quantidade
	 */
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * categoria
	 * 
	 * @return categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * categoria
	 * 
	 * @param categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * construtor
	 */
	public JavaBeans() {
		super();

	}

	/**
	 * construtor para uso do Arraylist
	 * 
	 * @param idgame
	 * @param nome
	 * @param valor
	 * @param plataforma
	 * @param quantidade
	 * @param categoria
	 */
	public JavaBeans(String idgame, String nome, String valor, String plataforma, String quantidade, String categoria) {
		super();
		this.idgame = idgame;
		this.nome = nome;
		this.valor = valor;
		this.plataforma = plataforma;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}

}
