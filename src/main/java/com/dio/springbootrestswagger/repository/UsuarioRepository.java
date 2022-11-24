package com.dio.springbootrestswagger.repository;

import com.dio.springbootrestswagger.handler.BusinessException;
import com.dio.springbootrestswagger.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if(usuario.getLogin() == null){
            throw new BusinessException("O campo login e obrigatorio");
        }
        if(usuario.getPassword() == null){
            throw new BusinessException("O campo password e obrigatorio");
        }

        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuario na camada de repositorio");
        else
            System.out.println("UPDATE - Recebendo o usuario na camada de repositorio");

        System.out.println(usuario);
    }
    public void deleteByld(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um repositorio", id));
        System.out.println(id);
    }
    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Felipe", "12345"));
        usuarios.add(new Usuario("Lorenna", "56789"));
        return usuarios;
    }
    public Usuario findByld(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um repositorio", id));
        return new Usuario("Felipe", "12345");
    }
    public Usuario findByldUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o id: %s para localizar um repositorio", username));
        return new Usuario("Lorenna", "56789");
    }
}
