package com.ifba.escola.avaliacao.application.gateways;

import com.ifba.escola.avaliacao.domain.entity.Avaliacao;

public interface AvaliacaoGateway{
    Avaliacao createAvaliacao(Avaliacao avaliacao);
    
    Avaliacao getAvaliacaoById(Long id);

    Avaliacao updateAvaliacao(Avaliacao avaliacao);

    void deleteAvaliacao(Long id);
    }

