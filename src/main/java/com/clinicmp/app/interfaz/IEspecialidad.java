package com.clinicmp.app.interfaz;

import com.clinicmp.app.models.Especialidad;

import java.util.List;

public interface IEspecialidad {

    public List<Especialidad> listar();
    public Especialidad buscar(Integer id);

}
