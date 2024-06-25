package com.example.backendElBuenSabor.repositories;

import com.example.backendElBuenSabor.entities.Localidad;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad, Long>{
    List<Localidad> findAllByProvincia_Id(Long provinciaId);
}
