package com.example.jana.dao;

import com.example.jana.model.user.UsuarioAdmin;
import com.example.jana.model.user.UsuarioComum;
import com.example.jana.model.user.Usuario;
import com.example.jana.model.enums.user.Perfil;
import com.example.jana.utils.DatabaseUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public List<Usuario> getAllUsers() throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        try(Connection connection = DatabaseUtils.getConnection()){
            String sql = "SELECT id, nome, matricula,perfil, email FROM usuarios";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet result = preparedStatement.executeQuery();
            while(result.next()){
                Perfil perfil = Perfil.valueOf(result.getString("perfil"));
                if(perfil==Perfil.ADMIN){
                        var usuario = new UsuarioAdmin(
                                result.getInt("id"),
                                result.getString("nome"),
                                result.getString("matricula"),
                                result.getString("email"),
                                perfil
                        );
                    usuarios.add(usuario);
                } else{
                    var usuario = new UsuarioComum(result.getInt("id"),
                            result.getString("nome"),
                            result.getString("matricula"),
                            result.getString("email"),
                            perfil);
                    usuarios.add(usuario);
                }
            }
            return usuarios;
        }
    }
}
