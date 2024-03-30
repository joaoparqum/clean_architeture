package com.ifba.escola.avaliacao.application.usecases;

import com.ifba.escola.avaliacao.application.gateways.AvaliacaoGateway;
import com.ifba.escola.avaliacao.domain.entity.Avaliacao;

public class CreateAvaliacaoInteractor {
    private AvaliacaoGateway avaliacaoGateway;

    public CreateAvaliacaoInteractor(AvaliacaoGateway avaliacaoGateway){
        this.avaliacaoGateway = avaliacaoGateway;
    }

    public Avaliacao createAvaliacao(Avaliacao avaliacao){
        return avaliacaoGateway.createAvaliacao(avaliacao);
    }
    
    public Avaliacao getAvaliacaoById(Long id) {
        return avaliacaoGateway.getAvaliacaoById(id);
    }

    public Avaliacao updateAvaliacao(Avaliacao avaliacao) {
        return avaliacaoGateway.updateAvaliacao(avaliacao);
    }

    public void deleteAvaliacao(Long id) {
        avaliacaoGateway.deleteAvaliacao(id);
    }
}
