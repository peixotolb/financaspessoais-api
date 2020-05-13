package com.aula.financaspessoais.service;

import java.util.Optional;

import com.aula.financaspessoais.model.entity.Usuario;

public interface UsuarioService {
	
	Usuario autenticar(String email, String senha);

	Usuario salvarUsuario(Usuario usuario);
	
	Optional<Usuario> obterPorId(Long id);
	
	void validarEmail(String email);
}
