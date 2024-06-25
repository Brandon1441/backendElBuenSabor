package com.example.backendElBuenSabor.controllers;
import com.example.backendElBuenSabor.entities.ArticuloManuFacturado;
import com.example.backendElBuenSabor.services.ArticuloManuFacturadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/articulos/manufacturados")
public class ArticuloManuFacturadoController extends BaseController<ArticuloManuFacturado, Long>{

    @Autowired
    private ArticuloManuFacturadoService autoArticuloManuFacturadoService;

    public ArticuloManuFacturadoController(ArticuloManuFacturadoService autoArticuloManuFacturadoService) {
        super(autoArticuloManuFacturadoService);
    }
    @GetMapping("/categoria/{id}")
    public ResponseEntity<List<ArticuloManuFacturado>> getByCategpry(@PathVariable Long id) throws Exception {
        List<ArticuloManuFacturado> articuloManuFacturado = autoArticuloManuFacturadoService.categoria(id);
        return ResponseEntity.ok(articuloManuFacturado);
    }
}

