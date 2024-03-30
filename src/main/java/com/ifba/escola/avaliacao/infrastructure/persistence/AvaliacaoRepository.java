/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ifba.escola.avaliacao.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author João P. Arquim
 */
@Repository
public interface AvaliacaoRepository extends JpaRepository<AvaliacaoEntity, Long>{
    
}
