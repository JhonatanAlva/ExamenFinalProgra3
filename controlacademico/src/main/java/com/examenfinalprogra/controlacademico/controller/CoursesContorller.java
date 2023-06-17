package com.examenfinalprogra.controlacademico.controller;

import com.examenfinalprogra.controlacademico.entity.Courses;
import com.examenfinalprogra.controlacademico.entity.Students;
import com.examenfinalprogra.controlacademico.service.CoursesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cursos")
public class CoursesContorller {
    @Autowired
    CoursesServices coursesServices;

    @GetMapping
    public List<Courses> listaCursos(){
        return coursesServices.findAll();
    }
    @GetMapping(value = "/buscar_por_id")
    public Optional<Courses> obtenerCursosId(@RequestParam Long id){
        return coursesServices.findById(id);
    }

    @PostMapping()
    public void crearCurso(@RequestBody Courses courses){
        coursesServices.createCurso(courses);
    }

    @PutMapping(value = "/{id}")
    public void modificarCurso(@PathVariable Long id, @RequestBody Courses courses){
        coursesServices.modifyCurso(id, courses);
    }

    @DeleteMapping(value = "/{id}")
    public void borrarCurso(@PathVariable Long id){
        coursesServices.deleteCurso(id);
    }
}
