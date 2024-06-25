package com.example.backendElBuenSabor.services;

import com.example.backendElBuenSabor.entities.ArticuloInsumo;
import com.example.backendElBuenSabor.repositories.ArticuloInsumoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloInsumoService extends BaseService<ArticuloInsumo, Long>{

    @Autowired
    private ArticuloInsumoRepository articuloInsumoRepository;

    public ArticuloInsumoService(ArticuloInsumoRepository articuloInsumoRepository) {
        super(articuloInsumoRepository);
    }

    @Transactional
    public List<ArticuloInsumo> categoria(Long id) throws Exception {
        try {
            return articuloInsumoRepository.findAllByCategoria_Id(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
