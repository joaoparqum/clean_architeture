package com.ifba.escola.avaliacao.infrastructure.controllers;

import com.ifba.escola.avaliacao.domain.entity.Avaliacao;
import com.ifba.escola.dto.AvaliacaoDto;

public class AvaliacaoDTOMapper {
    CreateAvaliacaoResponse toResponse(Avaliacao avaliacao){
        return new CreateAvaliacaoResponse(avaliacao.codigo(), avaliacao.nomeAvaliacao(), avaliacao.data(), avaliacao.codigoDisciplina(), avaliacao.nomeDisciplina(), avaliacao.codigoProfessor(), avaliacao.nomeProfessor());
    }
    public Avaliacao toAvaliacao(CreateAvaliacaoRequest request){
    return new Avaliacao(request.codigo(), request.nomeAvaliacao(), request.data(), request.codigoDisciplina(), request.nomeDisciplina(), request.codigoProfessor(), request.nomeProfessor());
    }

        AvaliacaoDto toDTO(Avaliacao avaliacao){
        return new AvaliacaoDto(avaliacao.codigo(), avaliacao.nomeAvaliacao(), avaliacao.data(), avaliacao.codigoDisciplina(), avaliacao.nomeDisciplina(), avaliacao.codigoProfessor(), avaliacao.nomeProfessor());
    }

}
