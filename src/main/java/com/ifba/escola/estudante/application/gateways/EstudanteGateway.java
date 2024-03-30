/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ifba.escola.estudante.application.gateways;

import com.ifba.escola.estudante.domain.entity.Estudante;

public interface EstudanteGateway {
    
    Estudante createEstudante(Estudante estudante);
    
    Estudante getEstudanteById(Long id);

    Estudante updateEstudante(Estudante estudante);

    void deleteEstudante(Long id);
    
}
