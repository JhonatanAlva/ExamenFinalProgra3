package com.examenfinalprogra.controlacademico.controller;

import com.examenfinalprogra.controlacademico.entity.Students;
import com.examenfinalprogra.controlacademico.service.Studentservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
public class StudentController {

    @Autowired
    Studentservices studentservices;

    @GetMapping
    public List<Students> listaStudents(){
        return studentservices.findAll();
    }
    @GetMapping(value = "/buscar_por_id")
    public Optional<Students> obtenerStudent(@RequestParam Long id){
        return studentservices.findById(id);
    }

    @PostMapping()
    public void crearEstudiante(@RequestBody Students students){
        studentservices.createStudent(students);
    }

    @PutMapping(value = "/{id}")
    public void modificarEstudiante(@PathVariable Long id, @RequestBody Students students){
        studentservices.modifyStudent(id, students);
    }

    @DeleteMapping(value = "/{id}")
    public void borrarEstudiante(@PathVariable Long id){
        studentservices.deleteStudent(id);
    }
}
