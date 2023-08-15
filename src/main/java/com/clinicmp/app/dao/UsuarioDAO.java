package com.clinicmp.app.dao;

import com.clinicmp.app.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario,Integer> {

    Usuario findByDniAndContra(String dni,String contra);

}
