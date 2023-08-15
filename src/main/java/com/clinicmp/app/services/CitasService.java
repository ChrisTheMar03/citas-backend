package com.clinicmp.app.services;

import com.clinicmp.app.dao.CitasDAO;
import com.clinicmp.app.interfaz.ICitas;
import com.clinicmp.app.models.Citas;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitasService implements ICitas {

    @Autowired private CitasDAO data;

    @Transactional
    @Override
    public Citas guardar(Citas citas) {
        return data.save(citas)!=null?citas:null;
    }

    @Override
    public Citas obtener(Integer id) {
        return data.findById(id).orElse(null);
    }

    @Override
    public List<Citas> citaXusuario(Integer id) {
        return data.findByIdUserIdUser(id);
    }

    @Transactional
    @Override
    public Citas actualizarCita(Citas citas) {
        citas.setEstado(false);
        return data.save(citas)!=null?citas:null;
    }
}
