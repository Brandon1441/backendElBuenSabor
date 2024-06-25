package com.example.backendElBuenSabor.controllers;
import com.example.backendElBuenSabor.entities.Pais;
import com.example.backendElBuenSabor.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisController extends BaseController<Pais, Long>{
    @Autowired
    private PaisService paisService;
    public PaisController(PaisService paisService) {
        super(paisService);
    }
}
