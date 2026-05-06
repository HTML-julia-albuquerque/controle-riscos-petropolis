package com.senai.backend.riscos_petropolis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.riscos_petropolis.models.Usuario;
import com.senai.backend.riscos_petropolis.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Long contarUsuarios() {
        return usuarioRepository.count();
    }

    public Usuario buscarUsuario(Integer id) {
        return usuarioRepository.findById(id).get();
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public Boolean deletarUsuario(Integer id) {
        if(usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

}
