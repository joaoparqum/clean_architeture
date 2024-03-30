package com.ifba.escola.professor.infrastructure.persistence;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Table(name = "PROFESSOR")
public class ProfessorEntity {
    private static final long serialVersionUID = 1L;

    public ProfessorEntity(String nivelAcademico, String nome, String genero, int codigo) {
        this.nivelAcademico = nivelAcademico;
        this.nome = nome;
        this.genero = genero;
        this.codigo = codigo;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nivelAcademico;
    private String nome;
    private String genero;
    private int codigo;
}
