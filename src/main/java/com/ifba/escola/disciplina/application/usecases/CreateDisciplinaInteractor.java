/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.disciplina.application.usecases;

import com.ifba.escola.disciplina.domain.entity.Disciplina;
import com.ifba.escola.disciplina.application.gateways.DisciplinaGateway;
public class CreateDisciplinaInteractor {
    
    private DisciplinaGateway disciGateway;

    public CreateDisciplinaInteractor(DisciplinaGateway disciGateway) {
        this.disciGateway = disciGateway;
    }
    
    public Disciplina createDisciplina(Disciplina disciplina) {
        return disciGateway.createDisciplina(disciplina);
    }
    
    public Disciplina getDisciplinaById(Long id) {
        return disciGateway.getDisciplinaById(id);
    }

    public Disciplina updateDisciplina(Disciplina disciplina) {
        return disciGateway.updateDisciplina(disciplina);
    }

    public void deleteDisciplina(Long id) {
        disciGateway.deleteDisciplina(id);
    }
    
}
