package com.ifba.escola.avaliacao.infrastructure.persistence;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Avaliacao")
public class AvaliacaoEntity implements Serializable {
 
      private static final long serialVersionUID = 1L;
    

    public AvaliacaoEntity(int codigo, String nomeAvaliacao, String data, int codigoDisciplina, String nomeDisciplina,int codigoProfessor, String nomeProfessor) {
        this.codigo = codigo;
        this.nomeAvaliacao = nomeAvaliacao;
        this.data = data;
        this.codigoDisciplina = codigoDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.codigoProfessor = codigoProfessor;
        this.nomeProfessor = nomeProfessor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int codigo;
    private String nomeAvaliacao;
    private String data;
    private int codigoDisciplina;
    private String nomeDisciplina;
    private int codigoProfessor;
    private String nomeProfessor;    
}
