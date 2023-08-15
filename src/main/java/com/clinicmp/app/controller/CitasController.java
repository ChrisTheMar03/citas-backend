package com.clinicmp.app.controller;

import com.clinicmp.app.exceptions.MessageError;
import com.clinicmp.app.interfaz.ICitas;
import com.clinicmp.app.models.Citas;
import com.clinicmp.app.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitasController {

    @Autowired private ICitas data;

    @PostMapping("/")
    public ResponseEntity<Object> registrar(@RequestBody Citas citas){
        Citas res = data.guardar(citas);
        if(res!=null){
            return ResponseEntity.ok(res);
        }
        return new ResponseEntity<Object>(new MessageError("Cita no se pudo registrar",false, HttpStatus.NOT_FOUND),HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> obtener(@PathVariable Integer id){
        Citas citas=data.obtener(id);
        if(citas!=null){
            return ResponseEntity.ok(citas);
        }
        return new ResponseEntity<Object>(new MessageError("Cita no obtenida",false, HttpStatus.NOT_FOUND),HttpStatus.NOT_FOUND);
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<Object> citasXusuario(@PathVariable Integer id){
        List<Citas> listar = data.citaXusuario(id);
        return ResponseEntity.ok(listar);
    }

    @PutMapping("/")
    public ResponseEntity<Citas> desactivarCita(@RequestBody Citas citas){
        Citas cts = data.actualizarCita(citas);
        if(cts!=null){
            return ResponseEntity.ok(cts);
        }
        return new ResponseEntity<Citas>(cts,HttpStatus.NOT_FOUND);
    }

}
