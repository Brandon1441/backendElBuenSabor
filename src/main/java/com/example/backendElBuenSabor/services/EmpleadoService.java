package com.example.backendElBuenSabor.services;

import com.example.backendElBuenSabor.entities.Empleado;
import com.example.backendElBuenSabor.repositories.EmpleadoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService extends BaseService<Empleado, Long> {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        super(empleadoRepository);
    }

    @Transactional
    public List<Empleado> buscarPorSucursal(Long idSucursal) throws Exception{
        try {
            return empleadoRepository.findAllBySucursal_Id(idSucursal);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
