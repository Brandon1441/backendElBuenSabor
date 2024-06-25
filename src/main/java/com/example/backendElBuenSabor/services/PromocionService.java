package com.example.backendElBuenSabor.services;

import com.example.backendElBuenSabor.entities.Promocion;
import com.example.backendElBuenSabor.repositories.PromocionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromocionService extends BaseService<Promocion, Long>{
    @Autowired
    private PromocionRepository promocionRepository;

    public PromocionService(PromocionRepository promocionRepository) {
        super(promocionRepository);
    }
}
