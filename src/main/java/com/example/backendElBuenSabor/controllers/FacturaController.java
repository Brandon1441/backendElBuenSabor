
package com.example.backendElBuenSabor.controllers;
import com.example.backendElBuenSabor.entities.Factura;
import com.example.backendElBuenSabor.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facturas")
public class FacturaController extends BaseController<Factura, Long>{
    @Autowired
    private FacturaService facturaService;
    public FacturaController(FacturaService facturaService) {
        super(facturaService);
    }
}
