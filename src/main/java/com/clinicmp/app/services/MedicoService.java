package com.clinicmp.app.services;

import com.clinicmp.app.dao.MedicoDAO;
import com.clinicmp.app.interfaz.IMedico;
import com.clinicmp.app.models.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService implements IMedico {

    @Autowired private MedicoDAO data;

    @Override
    public List<Medico> listar() {
        return data.findAll();
    }

    @Override
    public List<Medico> medicoXespecialidad(Integer id) {
        return data.findByIdEspIdEsp(id);
    }
}
