package com.example.backendElBuenSabor.services;

import com.example.backendElBuenSabor.entities.Cliente;
import com.example.backendElBuenSabor.repositories.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService extends BaseService<Cliente, Long>{
    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteService (ClienteRepository clienteRepository){
        super(clienteRepository);
    }

    @Transactional
    public List<Cliente> domicilio(Long id) throws Exception {
        try{
            return clienteRepository.findAllByDomicilio_Id(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

