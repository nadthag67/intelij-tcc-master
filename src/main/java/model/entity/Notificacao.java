package model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.time.LocalDate;

// @Entity avisa que esta classe vai virar a tabela Notificacao no banco de dados.
@Entity
@Table(name = "Notificacao")
public class Notificacao {

    // Identificador único (Chave Primária).
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column mapeia o texto do aviso que a usuária vai receber.
    @Column
    private String mensagem;

    // @Column mapeia a data em que a notificação foi gerada ou deve ser enviada.
    @Column
    private LocalDate data;

    // Construtor vazio (obrigatório para o JPA)
    public Notificacao() {
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

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}