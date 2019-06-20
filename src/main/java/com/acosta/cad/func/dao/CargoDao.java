package com.acosta.cad.func.dao;

import java.util.List;

import com.acosta.cad.func.domain.Cargo;

public interface CargoDao {

    void save(Cargo cargo );

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
