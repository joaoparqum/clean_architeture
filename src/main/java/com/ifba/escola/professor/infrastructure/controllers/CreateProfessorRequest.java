package com.ifba.escola.professor.infrastructure.controllers;

public record CreateProfessorRequest(String nivelAcademico, String nome, String genero, int codigo) {
    
}
