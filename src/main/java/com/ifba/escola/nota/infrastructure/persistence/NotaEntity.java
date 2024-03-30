/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.nota.infrastructure.persistence;

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
@Table(name = "Nota")
public class NotaEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int codigo;
    private double nota;
    private String nomeEstudante;
    private int codigoDisciplina;
    private int codigoProfessor;

    public NotaEntity(int codigo, double nota, String nomeEstudante, int codigoDisciplina, int codigoProfessor) {
        this.codigo = codigo;
        this.nota = nota;
        this.nomeEstudante = nomeEstudante;
        this.codigoDisciplina = codigoDisciplina;
        this.codigoProfessor = codigoProfessor;
    }
    
    
}
