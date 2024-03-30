/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 *
 * @author João P. Arquim
 */
@Data
public class DisciplinaDto {
    
    @NotBlank
    private int codigo;
    @NotBlank
    private String nomeDisciplina;
    @NotBlank
    private int horasPorSemana;
    @NotBlank
    private int creditos;
    @NotBlank
    private int codigoProfessor;
    @NotBlank
    private String nomeProfessor;
    @NotBlank
    private String nivelAcademico;

    public DisciplinaDto(int codigo, String nomeDisciplina, int horasPorSemana, int creditos, int codigoProfessor, String nomeProfessor, String nivelAcademico) {
        this.codigo = codigo;
        this.nomeDisciplina = nomeDisciplina;
        this.horasPorSemana = horasPorSemana;
        this.creditos = creditos;
        this.codigoProfessor = codigoProfessor;
        this.nomeProfessor = nomeProfessor;
        this.nivelAcademico = nivelAcademico;
    }
    
    
}
