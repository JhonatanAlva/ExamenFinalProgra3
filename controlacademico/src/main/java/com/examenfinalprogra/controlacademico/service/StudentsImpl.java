package com.examenfinalprogra.controlacademico.service;

import com.examenfinalprogra.controlacademico.dao.StudentDao;
import com.examenfinalprogra.controlacademico.entity.Students;
import com.examenfinalprogra.controlacademico.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentsImpl implements Studentservices {
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Students> findAll() {
        return (List<Students>)studentDao.findAll();
    }

    @Override
    public Optional<Students> findById(Long id) {
        Optional<Students> students = studentDao.findById(id);
        if(students.isEmpty()){
            throw new NotFoundException("Estudiante no encontrado " + id);
        }
        return students;
    }

    @Override
    public void createStudent(Students students) {
        studentDao.save(students);
        if(students == null){
            throw new NotFoundException(("No se pudo crear el estudiante "));
        }
    }

    @Override
    public void modifyStudent(Long id, Students students) {
        if(studentDao.existsById(id)){
            students.setId(id);
            studentDao.save(students);
        }
        if(students == null){
            throw new NotFoundException("No se pudo modificar el estudiantes con ID "+ id);
        }
    }

    @Override
    public void deleteStudent(Long id) {
        if(studentDao.existsById(id)){
            studentDao.deleteById(id);
        }
        if(studentDao == null){
            throw new NotFoundException(("No se encontro el estudiante con ID "+ id));
        }
    }
}
