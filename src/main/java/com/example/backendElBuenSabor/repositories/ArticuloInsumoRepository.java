package com.example.backendElBuenSabor.repositories;

import com.example.backendElBuenSabor.entities.ArticuloInsumo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloInsumoRepository extends BaseRepository<ArticuloInsumo, Long>{
    List<ArticuloInsumo> findAllByCategoria_Id(Long id);
}
