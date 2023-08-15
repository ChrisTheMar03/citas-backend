package com.clinicmp.app.dao;

import com.clinicmp.app.models.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicoDAO extends JpaRepository<Medico,Integer> {

    List<Medico> findByIdEspIdEsp(Integer idEsp);

}
