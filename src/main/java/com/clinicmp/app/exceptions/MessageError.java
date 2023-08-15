package com.clinicmp.app.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class MessageError{

    private String mensaje;
    private Boolean valor;
    private HttpStatus httpStatus;

    public MessageError(String mensaje, Boolean valor, HttpStatus httpStatus) {
        this.mensaje = mensaje;
        this.valor = valor;
        this.httpStatus = httpStatus;
    }
}
