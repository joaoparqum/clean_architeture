/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.disciplina.infrastructure.persistence;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;


/**
 *
 * @author felip
 */
@Data
@Table(name = "DISCIPLINA")
public class DisciplinaEntity {
    private static final long serialVersionUID = 1L;

    public DisciplinaEntity(int codigo, String nomeDisciplina, int horasPorSemana, int creditos, int codigoProfessor, String nomeProfessor, String nivelAcademico) {
        this.codigo = codigo;
        this.nomeDisciplina = nomeDisciplina;
        this.horasPorSemana = horasPorSemana;
        this.creditos = creditos;
        this.codigoProfessor = codigoProfessor;
        this.nomeProfessor = nomeProfessor;
        this.nivelAcademico = nivelAcademico;
    }

    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int codigo;
    private String nomeDisciplina;
    private int horasPorSemana;
    private int creditos;
    private int codigoProfessor;
    private String nomeProfessor;
    private String nivelAcademico;
}
