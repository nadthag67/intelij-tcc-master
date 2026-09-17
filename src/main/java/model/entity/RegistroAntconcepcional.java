package model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.time.LocalTime;

// @Entity avisa que esta classe vai virar uma tabela no banco de dados.
@Entity
@Table(name = "RegistroAnticoncepcional")
public class RegistroAntconcepcional {

    // Identificador único (Chave Primária).
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column mapeia o tipo do anticoncepcional (ex: pílula, injeção, DIU).
    @Column
    private String tipo;

    // @Column mapeia o horário em que a usuária toma/usa o anticoncepcional.
    // Usamos LocalTime porque ele guarda apenas a hora (ex: 20:00).
    @Column
    private LocalTime horarioUso;

    // Construtor vazio (obrigatório para o JPA funcionar certinho)
    public RegistroAntconcepcional() {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalTime getHorarioUso() {
        return horarioUso;
    }

    public void setHorarioUso(LocalTime horarioUso) {
        this.horarioUso = horarioUso;
    }
}


