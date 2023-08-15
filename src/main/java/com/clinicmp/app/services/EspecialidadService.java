package com.clinicmp.app.services;

import com.clinicmp.app.dao.EspecialidadDAO;
import com.clinicmp.app.interfaz.IEspecialidad;
import com.clinicmp.app.models.Especialidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadService implements IEspecialidad {

    @Autowired private EspecialidadDAO data;

    @Override
    public List<Especialidad> listar() {
        return data.findAll();
    }

    @Override
    public Especialidad buscar(Integer id) {
        return data.findById(id).orElse(null);
    }
}
