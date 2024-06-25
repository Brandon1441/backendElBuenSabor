package com.example.backendElBuenSabor.services;

import com.example.backendElBuenSabor.entities.Empresa;
import com.example.backendElBuenSabor.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService extends BaseService<Empresa, Long>{

    @Autowired
    private EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        super(empresaRepository);
    }
}
