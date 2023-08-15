package com.clinicmp.app.controller;

import com.clinicmp.app.interfaz.IMedico;
import com.clinicmp.app.models.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired private IMedico data;

    @GetMapping("/")
    public ResponseEntity<List<Medico>> listar(){
        return ResponseEntity.ok(data.listar());
    }

    @GetMapping("/filtrar/{id}")
    public ResponseEntity<List<Medico>> buscar(@PathVariable Integer id){
        return ResponseEntity.ok(data.medicoXespecialidad(id));
    }

}
