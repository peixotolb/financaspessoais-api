package com.aula.financaspessoais.exception;

public class ErroAutenticacao extends RuntimeException {

	public ErroAutenticacao(String mensagem) {
		super(mensagem);
	}
}
