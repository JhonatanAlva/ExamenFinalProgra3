package com.examenfinalprogra.controlacademico.dao;

import com.examenfinalprogra.controlacademico.entity.Students;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.OptionalInt;

public interface StudentDao extends CrudRepository<Students, Long> {
    //Optional<Students> findByName(String name);
}
