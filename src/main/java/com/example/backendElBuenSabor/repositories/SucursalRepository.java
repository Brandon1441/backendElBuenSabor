package com.example.backendElBuenSabor.repositories;

import com.example.backendElBuenSabor.entities.Sucursal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SucursalRepository extends BaseRepository<Sucursal, Long>{
    List<Sucursal> findAllByEmpresa_Id(Long empresaId);

    List<Sucursal> findAllByPromocion_Id(Long promocionId);
}
