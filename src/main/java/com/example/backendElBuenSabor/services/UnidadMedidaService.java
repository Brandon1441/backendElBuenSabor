package com.example.backendElBuenSabor.services;

import com.example.backendElBuenSabor.entities.UnidadMedida;
import com.example.backendElBuenSabor.repositories.UnidadMedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaService extends BaseService<UnidadMedida, Long>{

    @Autowired
    private UnidadMedidaRepository unidadMedidaRepository;

    public UnidadMedidaService(UnidadMedidaRepository unidadMedidaRepository){
        super(unidadMedidaRepository);
    }
}
