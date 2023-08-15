package com.clinicmp.app.controller;

import com.clinicmp.app.exceptions.MessageError;
import com.clinicmp.app.interfaz.IUsuario;
import com.clinicmp.app.models.Usuario;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private IUsuario data;

    @Autowired
    public UsuarioController(IUsuario data){
        this.data=data;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> buscar(@PathVariable Integer id){
        Usuario usu=data.buscar(id);
        if(usu!=null){
            return ResponseEntity.ok(usu);
        }
        return new ResponseEntity<Object>(new MessageError("Usuario no encontrado",false, HttpStatus.NOT_FOUND),HttpStatus.NOT_FOUND);
    }

    @PostMapping("/sesion/{dni}/{password}")
    public ResponseEntity<Object> iniciarSesion(@PathVariable String dni,@PathVariable String password){
        Usuario usu=data.sesion(dni,password);
        if(usu!=null){
            return ResponseEntity.ok(usu);
        }
        return new ResponseEntity<>(new MessageError("Sesion no iniciada",false,HttpStatus.NOT_FOUND),HttpStatus.NOT_FOUND);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Object> registrar(@RequestBody Usuario usuario){
        Usuario res = data.guardar(usuario);
        if(res!=null){
            return ResponseEntity.ok(res);
        }
        return new ResponseEntity<>(res,HttpStatus.NOT_FOUND);
    }

}
