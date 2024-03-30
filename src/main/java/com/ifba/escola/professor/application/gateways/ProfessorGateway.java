package com.ifba.escola.professor.application.gateways;

import com.ifba.escola.professor.domain.entity.Professor;

public interface ProfessorGateway {
    Professor createProfessor(Professor professor);

    Professor getProfessorById(Long id);

    Professor updateProfessor(Professor professor);

    void deleteProfessor(Long id);
}
