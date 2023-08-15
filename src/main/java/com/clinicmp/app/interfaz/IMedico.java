package com.clinicmp.app.interfaz;

import com.clinicmp.app.models.Medico;

import java.util.List;

public interface IMedico {

    public List<Medico> listar();
    public List<Medico> medicoXespecialidad(Integer id);


}
