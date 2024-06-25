package com.example.backendElBuenSabor.repositories;

import com.example.backendElBuenSabor.entities.Provincia;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinciaRepository extends BaseRepository<Provincia, Long>{
    List<Provincia> findAllByPais_Id(Long id);
}
