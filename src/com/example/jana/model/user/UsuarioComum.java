package com.example.jana.model.user;

import com.example.jana.model.enums.user.Perfil;

public class UsuarioComum extends Usuario {

    public UsuarioComum(int id, String nome, String matricula, String email, String senhaHash, Perfil perfil) {
        super(id, nome, matricula, email, senhaHash, perfil);
    }

    @Override
    public String toString() {
        return "Comum{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", matricula='" + getMatricula() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", perfil=" + getPerfil() +
                '}';
    }
}