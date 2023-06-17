package com.examenfinalprogra.controlacademico.service;

import com.examenfinalprogra.controlacademico.entity.Courses;
import com.examenfinalprogra.controlacademico.entity.Students;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface CoursesServices {
    public List<Courses> findAll();
    public Optional<Courses> findById(Long id);
    public void createCurso(Courses courses);
    public void modifyCurso(Long id, Courses courses);
    public void deleteCurso(Long id);
}
