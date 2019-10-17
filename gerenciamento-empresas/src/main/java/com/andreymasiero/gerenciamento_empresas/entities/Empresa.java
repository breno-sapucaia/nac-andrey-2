package com.andreymasiero.gerenciamento_empresas.entities;

/**
 * 
 * Classe que define os atributos de uma Empresa no sistema.
 *
 */
public class Empresa {
	private Long id = 0l;
	private String nome;

	/**
	 * Construtor da classe Empresa
	 * 
	 * @param String
	 */
	public Empresa(String nome) {
		this.nome = nome;
	}

	/**
	 * 
	 * Retorna o id da empresa
	 * 
	 * @return Long
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 
	 * Retorna o nome da empresa
	 *  
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Atribui um id para a empresa
	 * 
	 * @param Long
	 */
	public void setId(long id) {
		this.id = id;

	}
}
