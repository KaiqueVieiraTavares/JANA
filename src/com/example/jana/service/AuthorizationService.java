package com.example.jana.service;

import com.example.jana.exceptions.user.UnauthorizedRoleException;
import com.example.jana.model.user.Usuario;
import com.example.jana.model.enums.user.Perfil;

public class AuthorizationService {

    public void verificarAdmin(Usuario usuario){
        if(usuario.getPerfil()!= Perfil.ADMIN){
            throw new UnauthorizedRoleException("Role: %s não tem permissão para este conteudo".formatted(usuario.getPerfil()));
        }
    }
}
