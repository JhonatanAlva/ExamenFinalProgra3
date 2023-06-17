package com.examenfinalprogra.controlacademico.service;

import com.examenfinalprogra.controlacademico.entity.Grade;
import com.examenfinalprogra.controlacademico.entity.Students;

public interface GradeServie {
    public void createNota(Grade grade);
    public void modifyStudent(Long id, Grade grade);
    public void deleteStudent(Long id);
}
