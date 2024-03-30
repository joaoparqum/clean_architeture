/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.nota.infrastructure.gateways;

import com.ifba.escola.nota.application.gateways.NotaGateway;
import com.ifba.escola.nota.domain.entity.Nota;
import com.ifba.escola.nota.infrastructure.persistence.NotaEntity;
import com.ifba.escola.nota.infrastructure.persistence.NotaRepository;
import java.util.Optional;

/**
 *
 * @author João P. Arquim
 */
public class NotaRepositoryGateway implements NotaGateway{
    
    private final NotaRepository notaRepository;
    private final NotaEntityMapper notaEntityMapper;

    public NotaRepositoryGateway(NotaRepository notaRepository, NotaEntityMapper notaEntityMapper) {
        this.notaRepository = notaRepository;
        this.notaEntityMapper = notaEntityMapper;
    }

    @Override
    public Nota createNota(Nota notaDomainObj) {
        NotaEntity notaEntity = notaEntityMapper.toEntity(notaDomainObj);
        NotaEntity savedObj = notaRepository.save(notaEntity);
        return notaEntityMapper.toDomainObj(savedObj);
    }

    @Override
    public Nota getNotaById(Long id) {
        Optional<NotaEntity> optionalEntity = notaRepository.findById(id);
        return optionalEntity.map(notaEntityMapper::toDomainObj).orElse(null);
    }

    @Override
    public Nota updateNota(Nota notaDomainObj) {
        NotaEntity notaEntity = notaEntityMapper.toEntity(notaDomainObj);
        NotaEntity updatedObj = notaRepository.save(notaEntity);
        return notaEntityMapper.toDomainObj(updatedObj);
    }

    @Override
    public void deleteNota(Long id) {
       notaRepository.deleteById(id);
    }
    
}
