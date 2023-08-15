package com.clinicmp.app.interfaz;

import com.clinicmp.app.models.Citas;

import java.util.List;

public interface ICitas {

        public Citas guardar(Citas citas);
    public Citas obtener(Integer id);
    public List<Citas> citaXusuario(Integer id);
    public Citas actualizarCita(Citas citas);

}
