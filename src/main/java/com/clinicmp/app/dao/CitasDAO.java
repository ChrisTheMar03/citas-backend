package com.clinicmp.app.dao;

import com.clinicmp.app.models.Citas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitasDAO extends JpaRepository<Citas,Integer> {

    List<Citas> findByIdUserIdUser(Integer idUser);

}
