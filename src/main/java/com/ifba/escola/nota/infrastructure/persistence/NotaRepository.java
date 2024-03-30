/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ifba.escola.nota.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author João P. Arquim
 */
public interface NotaRepository extends JpaRepository<NotaEntity, Long>{
    
}
