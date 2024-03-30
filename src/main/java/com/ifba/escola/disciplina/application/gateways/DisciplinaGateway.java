/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ifba.escola.disciplina.application.gateways;

import com.ifba.escola.disciplina.domain.entity.Disciplina;

public interface DisciplinaGateway {
    
    Disciplina createDisciplina(Disciplina disciplina);
    
    Disciplina getDisciplinaById(Long id);

    Disciplina updateDisciplina(Disciplina disciplina);

    void deleteDisciplina(Long id);
    
}
