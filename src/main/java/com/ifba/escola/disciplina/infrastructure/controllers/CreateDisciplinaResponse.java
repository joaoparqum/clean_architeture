/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.disciplina.infrastructure.controllers;

/**
 *
 * @author felip
 */
public record CreateDisciplinaResponse(int codigo, String nomeDisciplina, int horasPorSemana, int creditos, int codigoProfessor, String nomeProfessor, String nivelAcademico) {
    
}
