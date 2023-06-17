package com.examenfinalprogra.controlacademico.service;

import com.examenfinalprogra.controlacademico.dao.GradeDao;
import com.examenfinalprogra.controlacademico.entity.Grade;
import org.springframework.beans.factory.annotation.Autowired;

public class GradeImpl implements GradeServie{
    @Autowired
    private GradeDao gradeDao;
    @Override
    public void createNota(Grade grade) {

    }

    @Override
    public void modifyStudent(Long id, Grade grade) {

    }

    @Override
    public void deleteStudent(Long id) {

    }
}
