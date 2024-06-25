package com.example.backendElBuenSabor.repositories;

import com.example.backendElBuenSabor.entities.ArticuloManuFacturado;
import com.example.backendElBuenSabor.entities.ArticuloManuFacturadoDetalle;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloManuFacturadoDetalleRepository extends BaseRepository<ArticuloManuFacturadoDetalle, Long>{
    List<ArticuloManuFacturadoDetalle> findByArticuloManuFacturado_Id(Long articuloManuFacturadoId);

    List<ArticuloManuFacturadoDetalle> findByArticuloInsumo_Id(Long articuloInsumoId);

}
