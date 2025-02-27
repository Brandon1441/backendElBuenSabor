package com.example.backendElBuenSabor.services;

import com.example.backendElBuenSabor.entities.Localidad;
import com.example.backendElBuenSabor.repositories.LocalidadRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadService extends BaseService<Localidad, Long>{

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadService(LocalidadRepository localidadRepository) {
        super(localidadRepository);
    }

    @Transactional
    public List<Localidad> provincia(Long id) throws Exception {
        try {
            return localidadRepository.findAllByProvincia_Id(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
