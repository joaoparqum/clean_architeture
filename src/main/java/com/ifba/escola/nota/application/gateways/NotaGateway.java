/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ifba.escola.nota.application.gateways;

import com.ifba.escola.nota.domain.entity.Nota;

/**
 *
 * @author João P. Arquim
 */
public interface NotaGateway {
    
    Nota createNota(Nota nota);
    
    Nota getNotaById(Long id);

    Nota updateNota(Nota nota);

    void deleteNota(Long id);
    
}
