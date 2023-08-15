package com.clinicmp.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMe;
    private String nombre;
    private String apellido;
    private String sexo;
    private Boolean activo;
    private String imagen;
    @ManyToOne
    @JoinColumn(name = "id_esp")
    private Especialidad idEsp;

}
