package model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.time.LocalDate;

// @Entity avisa ao Spring Boot (JPA) que esta classe é uma entidade, ou seja,
// ela vai virar uma tabela no banco de dados.
@Entity
// @Table permite dar um nome específico para a tabela no banco. Neste caso, "RegistroCiclo".
@Table(name = "RegistroCiclo")
public class RegistroCiclo {

    // @Id diz que este atributo é a Chave Primária (Primary Key) da tabela.
    @Id
    // @GeneratedValue ensina o banco de dados a gerar o ID automaticamente (como o AUTO_INCREMENT, ex: 1, 2, 3...).
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column mapeia o atributo para virar uma coluna na tabela.
    @Column
    private LocalDate dataInicio;

    @Column
    private LocalDate dataFim;

    @Column
    private String observacoes;

    @Column
    private boolean codStatus;

    // Construtor vazio (obrigatório para o Spring Boot e o JPA funcionarem corretamente)
    public RegistroCiclo() {
    }

    // =========================================================================
    // Abaixo estão os Getters e Setters gerados manualmente (como o Alt+Insert).
    // Eles servem para pegar (get) ou alterar (set) os valores dos atributos.
    // =========================================================================

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}