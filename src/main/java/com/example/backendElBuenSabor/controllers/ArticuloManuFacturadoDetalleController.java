package com.example.backendElBuenSabor.controllers;
import com.example.backendElBuenSabor.entities.ArticuloManuFacturadoDetalle;
import com.example.backendElBuenSabor.services.ArticuloManuFacturadoDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/articulos/manufacturados/detalles")
public class ArticuloManuFacturadoDetalleController extends BaseController<ArticuloManuFacturadoDetalle, Long>{

    public ArticuloManuFacturadoDetalleController(ArticuloManuFacturadoDetalleService articuloManuFacturadoDetalleService) {
        super(articuloManuFacturadoDetalleService);
    }

    @Autowired
    private ArticuloManuFacturadoDetalleService articuloManuFacturadoDetalleService;
    @GetMapping("/manu/{id}")
    public ResponseEntity<List<ArticuloManuFacturadoDetalle>> listArtManufacturados(@PathVariable Long id) throws Exception {
        List<ArticuloManuFacturadoDetalle> am = articuloManuFacturadoDetalleService.listarPorArticuloManu(id);
        return ResponseEntity.ok(am);
    }
    @GetMapping("/insumos/{id}")
    public ResponseEntity<List<ArticuloManuFacturadoDetalle>> listArtInsumos(@PathVariable Long id) throws Exception {
        List<ArticuloManuFacturadoDetalle> ai = articuloManuFacturadoDetalleService.listarPorArticuloInsumo(id);
        return ResponseEntity.ok(ai);
    }
}
