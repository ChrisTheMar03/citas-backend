package com.clinicmp.app.interfaz;

import com.clinicmp.app.models.Usuario;

import java.util.List;

public interface IUsuario {

    public Usuario buscar(Integer id);
    public Usuario sesion(String dni,String contraseña);
    public Usuario guardar(Usuario usuario);

}
