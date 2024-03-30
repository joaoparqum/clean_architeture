package com.ifba.escola.disciplina.domain.entity;

public record Disciplina(int codigo, String nomeDisciplina, int horasPorSemana, int creditos, int codigoProfessor, String nomeProfessor, String nivelAcademico) {
    // essas propriedades que preciso para cadastrar as regras de negocio no estudante
}
