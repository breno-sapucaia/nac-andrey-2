package com.andreymasiero.gerenciamento_empresas.dao;

import java.util.HashMap;
import java.util.Map;

import com.andreymasiero.gerenciamento_empresas.entities.Usuario;

/**
 * Classe que simula um banco de dados para usuário cadastrados.
 *
 */
public class UsuarioDAO {
	private final static Map<String, Usuario> USUARIOS = new HashMap<>();
	static {
		USUARIOS.put("eu@andreymasiero.com", new Usuario("eu@andreymasiero.com", "masiero"));
		USUARIOS.put("contato@andreymasiero.com", new Usuario("contato@andreymasiero.com", "contato"));
	}

	/**
	 * Buscar um usuário cadastrado com base em seu email e senha
	 * 
	 * @param String
	 * @param String
	 * @return Usuario
	 */
	public Usuario buscaPorEmailESenha(String email, String senha) {
		if (!USUARIOS.containsKey(email))
			return null;

		Usuario usuario = USUARIOS.get(email);
		if (usuario.getSenha().equals(senha))
			return usuario;

		return null;
	}
}
