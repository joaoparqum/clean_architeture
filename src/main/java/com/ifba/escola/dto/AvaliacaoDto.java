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
public class AvaliacaoDto {
    
    @NotBlank
    private int codigo;
    @NotBlank
    private String nomeAvaliacao;
    @NotBlank
    private String data;
    @NotBlank
    private int codigoDisciplina;
    @NotBlank
    private String nomeDisciplina;
    @NotBlank
    private int codigoProfessor;
    @NotBlank
    private String nomeProfessor;

    public AvaliacaoDto(int codigo, String nomeAvaliacao, String data, int codigoDisciplina, String nomeDisciplina, int codigoProfessor, String nomeProfessor) {
        this.codigo = codigo;
        this.nomeAvaliacao = nomeAvaliacao;
        this.data = data;
        this.codigoDisciplina = codigoDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.codigoProfessor = codigoProfessor;
        this.nomeProfessor = nomeProfessor;
    }
    
    
}
