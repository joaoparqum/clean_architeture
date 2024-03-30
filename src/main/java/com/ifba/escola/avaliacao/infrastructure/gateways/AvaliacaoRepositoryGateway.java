package com.ifba.escola.avaliacao.infrastructure.gateways;

import com.ifba.escola.avaliacao.application.gateways.AvaliacaoGateway;
import com.ifba.escola.avaliacao.domain.entity.Avaliacao;
import com.ifba.escola.avaliacao.infrastructure.persistence.AvaliacaoEntity;
import com.ifba.escola.avaliacao.infrastructure.persistence.AvaliacaoRepository;
import java.util.Optional;

public class AvaliacaoRepositoryGateway implements AvaliacaoGateway{
    private final AvaliacaoRepository avaliacaoRepository;
    private final AvaliacaoEntityMapper avaliacaoEntityMapper;

    public AvaliacaoRepositoryGateway(AvaliacaoRepository avaliacaoRepository,
            AvaliacaoEntityMapper avaliacaoEntityMapper) {
        this.avaliacaoRepository = avaliacaoRepository;
        this.avaliacaoEntityMapper = avaliacaoEntityMapper;
    }    

    @Override
    public Avaliacao createAvaliacao(Avaliacao avaliacaoDomainObj) {
        AvaliacaoEntity avaliacaoEntity = avaliacaoEntityMapper.toEntity(avaliacaoDomainObj);
        AvaliacaoEntity saveObj = avaliacaoRepository.save(avaliacaoEntity);
        return avaliacaoEntityMapper.toDomainObj(saveObj);  
      }

    @Override
    public Avaliacao getAvaliacaoById(Long id) {
        Optional<AvaliacaoEntity> optionalEntity = avaliacaoRepository.findById(id);
        return optionalEntity.map(avaliacaoEntityMapper::toDomainObj).orElse(null);
    }

    @Override
    public Avaliacao updateAvaliacao(Avaliacao avaliacaoDomainObj) {
    AvaliacaoEntity avaliacaoEntity = avaliacaoEntityMapper.toEntity(avaliacaoDomainObj);
        AvaliacaoEntity updatedObj = avaliacaoRepository.save(avaliacaoEntity);
        return avaliacaoEntityMapper.toDomainObj(updatedObj);
    }

    @Override
    public void deleteAvaliacao(Long id) {
        avaliacaoRepository.deleteById(id);
    }
    
}
