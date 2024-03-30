package com.ifba.escola.estudante.domain.entity;

public record Estudante(int anoIngresso, String nome, String genero, int codigo) {
    // essas propriedades que preciso para cadastrar as regras de negocio no estudante
}
