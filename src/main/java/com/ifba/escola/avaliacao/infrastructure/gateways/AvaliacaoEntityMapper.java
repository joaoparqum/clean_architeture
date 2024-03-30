package com.ifba.escola.avaliacao.infrastructure.gateways;

import com.ifba.escola.avaliacao.domain.entity.Avaliacao;
import com.ifba.escola.avaliacao.infrastructure.persistence.AvaliacaoEntity;

public class AvaliacaoEntityMapper {
    
    AvaliacaoEntity toEntity(Avaliacao avaliacaoDomainObj){
        return new AvaliacaoEntity(avaliacaoDomainObj.codigo(), avaliacaoDomainObj.nomeAvaliacao(), avaliacaoDomainObj.data(), avaliacaoDomainObj.codigoDisciplina(), avaliacaoDomainObj.nomeDisciplina(), avaliacaoDomainObj.codigoProfessor(), avaliacaoDomainObj.nomeProfessor());
    }

    Avaliacao toDomainObj(AvaliacaoEntity avaliacaoEntity){

        return new Avaliacao(avaliacaoEntity.getCodigo(), avaliacaoEntity.getNomeAvaliacao(), avaliacaoEntity.getData(), avaliacaoEntity.getCodigoDisciplina(), avaliacaoEntity.getNomeDisciplina(), avaliacaoEntity.getCodigoProfessor(), avaliacaoEntity.getNomeProfessor());
    }
}
