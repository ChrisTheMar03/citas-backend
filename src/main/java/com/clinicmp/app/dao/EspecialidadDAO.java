package com.clinicmp.app.dao;

import com.clinicmp.app.models.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadDAO extends JpaRepository<Especialidad,Integer> {

}
