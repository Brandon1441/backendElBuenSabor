package com.example.backendElBuenSabor.services;

import com.example.backendElBuenSabor.entities.ArticuloManuFacturadoDetalle;
import com.example.backendElBuenSabor.repositories.ArticuloManuFacturadoDetalleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloManuFacturadoDetalleService extends BaseService<ArticuloManuFacturadoDetalle, Long>{

    public ArticuloManuFacturadoDetalleService(ArticuloManuFacturadoDetalleRepository articuloManuFacturadoDetalleRepository) {
        super(articuloManuFacturadoDetalleRepository);
    }

    @Autowired
    private ArticuloManuFacturadoDetalleRepository articuloManuFacturadoDetalleRepository;

    @Transactional
    public List<ArticuloManuFacturadoDetalle> listarPorArticuloManu(Long articuloManuFacturadoId) throws Exception {
        try {
            return articuloManuFacturadoDetalleRepository.findByArticuloManuFacturado_Id(articuloManuFacturadoId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<ArticuloManuFacturadoDetalle> listarPorArticuloInsumo(Long articuloInsumoId) throws Exception {
        try {
            return articuloManuFacturadoDetalleRepository.findByArticuloInsumo_Id(articuloInsumoId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}