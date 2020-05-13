package com.aula.financaspessoais.api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.aula.financaspessoais.model.enums.StatusLancamento;
import com.aula.financaspessoais.model.enums.TipoLancamento;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LancamentoDTO {
	
	private Long id;
	private String descricao;
	private Integer mes;
	private Integer ano;
	private Long usuario;
	private BigDecimal valor;
	private LocalDate dataCadastro;
	private String tipo;
	private String status;

}
