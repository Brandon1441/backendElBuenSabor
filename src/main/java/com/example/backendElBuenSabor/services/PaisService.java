package com.example.backendElBuenSabor.services;

import com.example.backendElBuenSabor.entities.Pais;
import com.example.backendElBuenSabor.repositories.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisService extends BaseService<Pais, Long>{

    @Autowired
     private PaisRepository paisRepository;

    public PaisService(PaisRepository paisRepository) {
        super(paisRepository);
    }
}
