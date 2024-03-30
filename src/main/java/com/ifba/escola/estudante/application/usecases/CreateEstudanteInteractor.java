/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.estudante.application.usecases;

import com.ifba.escola.estudante.application.gateways.EstudanteGateway;
import com.ifba.escola.estudante.domain.entity.Estudante;
public class CreateEstudanteInteractor {
    
    private EstudanteGateway estGateway;

    public CreateEstudanteInteractor(EstudanteGateway estGateway) {
        this.estGateway = estGateway;
    }
    
    public Estudante createEstudante(Estudante estudante) {
        return estGateway.createEstudante(estudante);
    }
    
    public Estudante getEstudanteById(Long id) {
        return estGateway.getEstudanteById(id);
    }

    public Estudante updateEstudante(Estudante estudante) {
        return estGateway.updateEstudante(estudante);
    }

    public void deleteEstudante(Long id) {
        estGateway.deleteEstudante(id);
    }
    
}
