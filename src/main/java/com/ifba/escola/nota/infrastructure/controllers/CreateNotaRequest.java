/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.nota.infrastructure.controllers;

/**
 *
 * @author João P. Arquim
 */
public record CreateNotaRequest(int codigo, double nota, String nomeEstudante, int codigoDisciplina, int codigoProfessor) {
    
}
