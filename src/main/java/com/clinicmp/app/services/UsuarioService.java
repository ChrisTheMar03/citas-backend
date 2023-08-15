package com.clinicmp.app.services;

import com.clinicmp.app.dao.UsuarioDAO;
import com.clinicmp.app.interfaz.IUsuario;
import com.clinicmp.app.models.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuario {

    private UsuarioDAO dao;

    @Autowired
    public UsuarioService(UsuarioDAO dao){
        this.dao=dao;
    }

    @Override
    public Usuario buscar(Integer id) {
        return (Usuario) dao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public Usuario sesion(String dni, String contraseña) {
        return dao.findByDniAndContra(dni,contraseña);
    }

    @Transactional
    @Override
    public Usuario guardar(Usuario usuario) {
        return dao.save(usuario)!=null?usuario:null;
    }
}
