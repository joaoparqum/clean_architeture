package com.ifba.escola.avaliacao.infrastructure.controllers;

public record CreateAvaliacaoResponse(int codigo, String nomeAvaliacao, String data,int codigoDisciplina, String nomeDisciplina, int codigoProfessor, String nomeProfessor) {
    
}
