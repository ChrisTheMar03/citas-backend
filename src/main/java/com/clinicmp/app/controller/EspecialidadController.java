package com.clinicmp.app.controller;

import com.clinicmp.app.exceptions.MessageError;
import com.clinicmp.app.interfaz.IEspecialidad;
import com.clinicmp.app.models.Especialidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {

    @Autowired private IEspecialidad data;

    @GetMapping("/")
    public ResponseEntity<List<Especialidad>> listar(){
        return ResponseEntity.ok(data.listar());
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Object> buscar(@PathVariable Integer id){
        Especialidad especialidad=data.buscar(id);
        if(especialidad!=null){
            return ResponseEntity.ok(especialidad);
        }
        return new ResponseEntity<>(new MessageError("No se encontro la especialidad",false, HttpStatus.NOT_FOUND),HttpStatus.NOT_FOUND);
    }

}
