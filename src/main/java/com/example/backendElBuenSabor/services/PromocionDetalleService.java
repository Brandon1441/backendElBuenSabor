package com.example.backendElBuenSabor.services;

import com.example.backendElBuenSabor.entities.PromocionDetalle;
import com.example.backendElBuenSabor.repositories.PromocionDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromocionDetalleService extends BaseService<PromocionDetalle, Long>{

    @Autowired
    private PromocionDetalleRepository promocionDetalleRepository;

    public PromocionDetalleService(PromocionDetalleRepository promocionDetalleRepository) {
        super(promocionDetalleRepository);
    }
}
