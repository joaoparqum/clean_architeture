package com.ifba.escola.professor.application.usecases;

import com.ifba.escola.professor.application.gateways.ProfessorGateway;
import com.ifba.escola.professor.domain.entity.Professor;

public class CreateProfessorInteractor {
    private ProfessorGateway profGateway;

    public CreateProfessorInteractor(ProfessorGateway profGateway) {
        this.profGateway = profGateway;
    }
    
    public Professor createProfessor(Professor professor) {
        return profGateway.createProfessor(professor);
    }
    
    public Professor getProfessorById(Long id) {
        return profGateway.getProfessorById(id);
    }

    public Professor updateProfessor(Professor professor) {
        return profGateway.updateProfessor(professor);
    }

    public void deleteProfessor(Long id) {
        profGateway.deleteProfessor(id);
    }
}
