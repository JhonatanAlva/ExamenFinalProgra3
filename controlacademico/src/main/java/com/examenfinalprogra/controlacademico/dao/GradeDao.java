package com.examenfinalprogra.controlacademico.dao;

import com.examenfinalprogra.controlacademico.entity.Grade;
import org.springframework.data.repository.CrudRepository;

public interface GradeDao extends CrudRepository<Grade, Long> {
}
