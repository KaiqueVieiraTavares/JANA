package model;

import model.enums.Perfil;

public class Admin extends Usuario{
    private String cpf;

    public Admin(int id, String nome, String matricula, String cpf, String email, String senhaHash, Perfil perfil) {
        super(id, nome, matricula, email, senhaHash, perfil);
        this.cpf=cpf;
    }
    public Admin(int id, String nome, String matricula, String email, Perfil perfil) {
        super(id, nome, matricula, email, perfil);
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



}
