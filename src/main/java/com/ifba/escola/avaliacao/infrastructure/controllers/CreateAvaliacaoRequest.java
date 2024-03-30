package com.ifba.escola.avaliacao.infrastructure.controllers;

public record CreateAvaliacaoRequest(int codigo, String nomeAvaliacao, String data,int codigoDisciplina, String nomeDisciplina, int codigoProfessor, String nomeProfessor) {
    
}
