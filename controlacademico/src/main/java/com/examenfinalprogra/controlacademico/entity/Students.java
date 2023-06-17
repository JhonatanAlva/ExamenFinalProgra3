package com.examenfinalprogra.controlacademico.entity;

import net.bytebuddy.agent.builder.AgentBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "estudiantes")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotBlank(message = "El nombre no puede estar vacio")
    @Column(name = "nombre")
    private String name;

    @NotBlank(message = "El email no puede estar vacio")
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "estudiante", cascade = CascadeType.ALL)
    private List<Grade> calificaciones;

    private Long carnet;

    private Long qualification;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCarnet() {
        return carnet;
    }

    public void setCarnet(Long carnet) {
        this.carnet = carnet;
    }

    public Long getQualification() {
        return qualification;
    }

    public void setQualification(Long qualification) {
        this.qualification = qualification;
    }

    public List<Grade> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Grade> calificaciones) {
        this.calificaciones = calificaciones;
    }
}
