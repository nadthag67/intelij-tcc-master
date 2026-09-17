package model.entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
// ... (resto dos seus imports)

// Marcamos como @Entity para o Spring Boot...
@Entity
@Table(name = "Usuario")
public class Usuario {

    // Identificador único...
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column mapeia cada um desses atributos para colunas na tabela "Usuario".
    @Column
    private String nome;

    @Column
    private String email;

    @Column
    private String senha;

    @Column
    private LocalDate dataNascimento;

    @Column
    private String tipoUsuario;

    @Column
    private boolean codStatus;

    // Construtor vazio (obrigatório para o JPA)
    public Usuario() {
    }

    // =========================================================================
    // Getters e Setters gerados manualmente (Alt+Insert)
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}