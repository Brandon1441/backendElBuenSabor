package com.example.backendElBuenSabor.controllers;
import com.example.backendElBuenSabor.entities.UnidadMedida;
import com.example.backendElBuenSabor.services.UnidadMedidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidades")
public class UnidadMedidaController extends BaseController<UnidadMedida, Long>{
    @Autowired
    private UnidadMedidaService unidadMedidaService;
    public UnidadMedidaController(UnidadMedidaService unidadMedidaService) {
        super(unidadMedidaService);
    }
}
