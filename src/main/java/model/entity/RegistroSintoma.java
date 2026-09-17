package model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.time.LocalDate;

// @Entity avisa que esta classe vai virar uma tabela no banco de dados.
@Entity
@Table(name = "RegistroSintoma")
public class RegistroSintoma {

    // Identificador único (Chave Primária)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column mapeia o atributo da data em que o sintoma foi sentido
    @Column
    private LocalDate data;

    // Construtor vazio (obrigatório para o JPA)
    public RegistroSintoma() {
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}