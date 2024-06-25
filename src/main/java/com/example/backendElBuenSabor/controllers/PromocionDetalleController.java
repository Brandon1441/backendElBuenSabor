package com.example.backendElBuenSabor.controllers;
import com.example.backendElBuenSabor.entities.PromocionDetalle;
import com.example.backendElBuenSabor.services.PromocionDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promocion/detalle")
public class PromocionDetalleController extends BaseController<PromocionDetalle, Long>{
    @Autowired
    private PromocionDetalleService promocionDetalleService;
    public PromocionDetalleController(PromocionDetalleService promocionDetalleService) {
        super(promocionDetalleService);
    }
}
