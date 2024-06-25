package com.example.backendElBuenSabor.services;
import com.example.backendElBuenSabor.entities.ArticuloManuFacturado;
import com.example.backendElBuenSabor.repositories.ArticuloManuFacturadoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArticuloManuFacturadoService extends BaseService<ArticuloManuFacturado, Long> {

    @Autowired
    private ArticuloManuFacturadoRepository articuloManuFacturadoRepository;

    public ArticuloManuFacturadoService(ArticuloManuFacturadoRepository articuloManuFacturadoRepository) {
        super(articuloManuFacturadoRepository);
    }

    @Transactional
    public List<ArticuloManuFacturado> categoria(Long id) throws Exception{
        try {
            return articuloManuFacturadoRepository.findAllByCategoria_Id(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
