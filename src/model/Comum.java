package model;

import model.enums.Perfil;

public class Comum extends Usuario{

    public Comum(int id, String nome, String matricula, String email, String senhaHash, Perfil perfil) {
        super(id, nome, matricula, email, senhaHash, perfil);
    }
    public Comum(int id, String nome, String matricula, String email, Perfil perfil) {
        super(id, nome, matricula, email, null, perfil);
    }
}
