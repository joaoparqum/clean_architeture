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
public class EstudanteDto {
    
    @NotBlank
    private int anoIngresso;
    @NotBlank
    private String nome;
    @NotBlank
    private String genero;
    @NotBlank
    private int codigo;
    
    public EstudanteDto(int anoIngresso, String nome, String genero, int codigo) {
        this.anoIngresso = anoIngresso;
        this.nome = nome;
        this.genero = genero;
        this.codigo = codigo;
    }
}
