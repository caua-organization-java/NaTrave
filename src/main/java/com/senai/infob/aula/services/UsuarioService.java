package com.senai.infob.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.aula.models.Usuario;
import com.senai.infob.aula.repositories.UsuarioRepository;

@Service
public class UsuarioService { 

     @Autowired
    public UsuarioRepository usuarioRepository;
     public String login(String email, String senha) {
        Usuario usuario = usuarioRepository.findByEmail(email);
        if(usuario != null && usuario.equals(usuario.getSenha())) {
            return "Login efetuado com sucesso";        
        }
        return "Falha ao realizar login";
    }

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
