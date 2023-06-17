package com.examenfinalprogra.controlacademico.entity;

import com.examenfinalprogra.controlacademico.entity.Students;

import javax.persistence.*;

@Entity
@Table(name = "calificaciones")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseId;
    private Long gradeValue;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Students estudiante;

    // Constructor, getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public Long getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(Long gradeValue) {
        this.gradeValue = gradeValue;
    }

    public Students getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Students estudiante) {
        this.estudiante = estudiante;
    }
}
