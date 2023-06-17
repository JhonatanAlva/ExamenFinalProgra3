package com.examenfinalprogra.controlacademico.controller;

import com.examenfinalprogra.controlacademico.entity.Grade;
import com.examenfinalprogra.controlacademico.entity.Students;
import com.examenfinalprogra.controlacademico.service.GradeServie;
import com.examenfinalprogra.controlacademico.service.Studentservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {

    @Autowired
    Studentservices studentservices;

    //@Autowired
    //private GradeServie gradeServie;

    @PostMapping("/estudiantes/{id}/calificaciones")
    public ResponseEntity<String> agregarCalificacion(@PathVariable Long id, @RequestBody Grade calificacion) {
        // Obtener el estudiante por su ID desde el repositorio de estudiantes
        Students estudiante = studentservices.findById(id).orElse(null);

        if (estudiante == null) {
            return ResponseEntity.notFound().build();
        }

        // Establecer la relación entre el estudiante y la calificación
        calificacion.setEstudiante(estudiante);

        // Guardar la calificación en el repositorio de calificaciones
        //gradeServie.save(calificacion);

        return ResponseEntity.ok("Calificación agregada exitosamente");
    }

}

