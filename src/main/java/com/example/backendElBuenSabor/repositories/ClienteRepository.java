package com.example.backendElBuenSabor.repositories;

import com.example.backendElBuenSabor.entities.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente, Long>{
    List<Cliente> findAllByDomicilio_Id(Long id);
}
