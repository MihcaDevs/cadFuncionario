package com.acosta.cad.func.dao;

import java.util.List;

import com.acosta.cad.func.domain.Funcionario;

public interface FuncionarioDao {
    
	void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();

	List<Funcionario> findByNome(String nome);

	List<Funcionario> findByCargoId(Long id);
}
