package model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.time.LocalDate;

// @Entity avisa que esta classe vai virar a tabela RegistroHumor no banco de dados.
@Entity
@Table(name = "RegistroHumor")
public class RegistroHumor {

    // Identificador único do registro (Chave Primária).
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column mapeia a data em que o humor foi registrado.
    @Column
    private LocalDate data;

    // @Column mapeia qual foi o humor registrado no dia.
    @Column
    private String humor;

    // Construtor vazio (obrigatório para o JPA funcionar sem dar erro)
    public RegistroHumor() {
    }

    // =========================================================================
    // Getters e Setters gerados manualmente (como o Alt+Insert)
    // =========================================================================

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }
}