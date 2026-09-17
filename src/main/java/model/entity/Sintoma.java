package model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

// Marcamos como @Entity para o Spring Boot criar a tabela no banco.
@Entity
@Table(name = "Sintoma")
public class Sintoma {

    // Identificador único do sintoma (Chave Primária).
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column mapeia os atributos para colunas na tabela.
    @Column
    private String nome;

    @Column
    private String descricao;

    // Construtor vazio (obrigatório para o JPA funcionar corretamente)
    public Sintoma() {
    }

    // =========================================================================
    // Getters e Setters gerados manualmente
    // =========================================================================

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}