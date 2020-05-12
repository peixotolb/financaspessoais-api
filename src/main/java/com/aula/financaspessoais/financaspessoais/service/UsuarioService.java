package com.aula.financaspessoais.financaspessoais.service;

import com.aula.financaspessoais.model.entity.Usuario;

public interface UsuarioService {
	
	Usuario autenticar(String email, String senha);

	Usuario salvarUsuario(Usuario usuario);
	
	void validarEmail(String email);
}
