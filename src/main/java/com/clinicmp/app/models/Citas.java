package com.clinicmp.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "citas")
public class Citas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCitas;
    @ManyToOne
    @JoinColumn(name = "id_med")
    private Medico idMed;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private Usuario idUser;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaAtencion;
    private Boolean estado;

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
