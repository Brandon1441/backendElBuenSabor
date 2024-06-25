package com.example.backendElBuenSabor.controllers;
import java.util.List;
import org.springframework.http.ResponseEntity;
import com.example.backendElBuenSabor.entities.ArticuloInsumo;
import com.example.backendElBuenSabor.services.ArticuloInsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articulos/insumo")
public class ArticuloInsumoController extends BaseController<ArticuloInsumo, Long> {

    @Autowired
    private ArticuloInsumoService articuloInsumoService;
    public ArticuloInsumoController(ArticuloInsumoService articuloInsumoService) {
        super(articuloInsumoService);
    }
    @GetMapping("/categoria/{id}")
    public ResponseEntity<List<ArticuloInsumo>> getByCategory(@PathVariable Long id) throws Exception {
        List<ArticuloInsumo> articuloInsumo = articuloInsumoService.categoria(id);
        return ResponseEntity.ok(articuloInsumo);
    }
}
