/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.estudante.infrastructure.persistence;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;


/**
 *
 * @author João P. Arquim
 */
@Data
@Table(name = "ESTUDANTE")
public class EstudanteEntity {
    private static final long serialVersionUID = 1L;

    public EstudanteEntity(int anoIngresso, String nome, String genero, int codigo) {
        this.anoIngresso = anoIngresso;
        this.nome = nome;
        this.genero = genero;
        this.codigo = codigo;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int anoIngresso;
    private String nome;
    private String genero;
    private int codigo;
}
