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
public class NotaDto {
    
    @NotBlank
    private int codigo;
    @NotBlank
    private double nota;
    @NotBlank
    private String nomeEstudante;
    @NotBlank
    private int codigoDisciplina;
    @NotBlank
    private int codigoProfessor;

    public NotaDto(int codigo, double nota, String nomeEstudante, int codigoDisciplina, int codigoProfessor) {
        this.codigo = codigo;
        this.nota = nota;
        this.nomeEstudante = nomeEstudante;
        this.codigoDisciplina = codigoDisciplina;
        this.codigoProfessor = codigoProfessor;
    }
    
    
}
