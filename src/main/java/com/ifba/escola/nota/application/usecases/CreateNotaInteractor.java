/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.nota.application.usecases;

import com.ifba.escola.nota.application.gateways.NotaGateway;
import com.ifba.escola.nota.domain.entity.Nota;

/**
 *
 * @author João P. Arquim
 */
public class CreateNotaInteractor {
    
    private NotaGateway notaGateway;

    public CreateNotaInteractor(NotaGateway notaGateway) {
        this.notaGateway = notaGateway;
    }
    
    public Nota createNota(Nota nota) {
        return notaGateway.createNota(nota);
    }
    
    public Nota getNotaById(Long id) {
        return notaGateway.getNotaById(id);
    }

    public Nota updateNota(Nota nota) {
        return notaGateway.updateNota(nota);
    }

    public void deleteNota(Long id) {
        notaGateway.deleteNota(id);
    }
    
}
