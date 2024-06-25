package com.example.backendElBuenSabor.controllers;
import com.example.backendElBuenSabor.entities.Promocion;
import com.example.backendElBuenSabor.services.PromocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promocion")
public class PromocionController extends BaseController<Promocion, Long>{
    @Autowired
    private PromocionService promocionService;
    public PromocionController(PromocionService promocionService) {
        super(promocionService);
    }
}
