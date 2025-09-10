package model;

import model.enums.Perfil;

import java.util.Objects;

public abstract class Usuario {
    private int id;
    private String nome;
    private String matricula;
    private String email;
    private String senhaHash;
    private Perfil perfil;


    public Usuario(int id, String nome, String matricula, String email, String senhaHash, Perfil perfil) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.senhaHash = senhaHash;
        this.perfil = perfil;
    }

    public Usuario(int id, String nome, String matricula, String email, Perfil perfil) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.perfil = perfil;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenhaHash() {
        return senhaHash;
    }

    public void setSenhaHash(String senhaHash) {
        this.senhaHash = senhaHash;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
