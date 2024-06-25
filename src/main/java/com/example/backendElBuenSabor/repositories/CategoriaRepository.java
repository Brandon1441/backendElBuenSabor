package com.example.backendElBuenSabor.repositories;

import com.example.backendElBuenSabor.entities.Categoria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria, Long> {


    List<Categoria> findAllByCategoriaPadre_Id(Long idCategoriaPadre);

}
