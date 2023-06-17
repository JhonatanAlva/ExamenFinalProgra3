package com.examenfinalprogra.controlacademico.service;

import com.examenfinalprogra.controlacademico.entity.Students;

import java.util.List;
import java.util.Optional;

public interface Studentservices {
    public List<Students> findAll();
    public Optional<Students> findById(Long id);
    public void createStudent(Students students);
    public void modifyStudent(Long id, Students students);
    public void deleteStudent(Long id);
}
