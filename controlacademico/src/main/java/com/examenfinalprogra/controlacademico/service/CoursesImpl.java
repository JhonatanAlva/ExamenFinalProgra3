package com.examenfinalprogra.controlacademico.service;

import com.examenfinalprogra.controlacademico.dao.CoursesDao;
import com.examenfinalprogra.controlacademico.entity.Courses;
import com.examenfinalprogra.controlacademico.entity.Students;
import com.examenfinalprogra.controlacademico.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursesImpl implements CoursesServices{
    @Autowired
    private CoursesDao coursesDao;
    @Override
    public List<Courses> findAll() {
        return (List<Courses>)coursesDao.findAll() ;
    }

    @Override
    public Optional<Courses> findById(Long id) {
        Optional<Courses> courses = coursesDao.findById(id);
        if(courses.isEmpty()){
            throw new NotFoundException("Curso no encontrado con " + id);
        }
        return courses;
    }

    @Override
    public void createCurso(Courses courses) {
        coursesDao.save(courses);
        if(courses == null){
            throw new NotFoundException(("No se pudo crear el curso "));
        }
    }

    @Override
    public void modifyCurso(Long id, Courses courses) {
        if(coursesDao.existsById(id)){
            courses.setId(id);
            coursesDao.save(courses);
        }
        if(courses == null){
            throw new NotFoundException("No se pudo modificar el curso con ID "+ id);
        }
    }

    @Override
    public void deleteCurso(Long id) {
        if(coursesDao.existsById(id)){
            coursesDao.deleteById(id);
        }
        if(coursesDao == null){
            throw new NotFoundException(("No se encontro el curso con ID "+ id));
        }
    }
}
