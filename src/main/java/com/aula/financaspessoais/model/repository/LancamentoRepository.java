package com.aula.financaspessoais.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.financaspessoais.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {


}
