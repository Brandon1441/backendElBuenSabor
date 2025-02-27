package com.example.backendElBuenSabor.controllers;
import java.util.List;
import org.springframework.http.ResponseEntity;
import com.example.backendElBuenSabor.entities.Localidad;
import com.example.backendElBuenSabor.services.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseController<Localidad, Long> {

    @Autowired
    private LocalidadService localidadService;
    public LocalidadController(LocalidadService localidadService) {
        super(localidadService);
    }
    @GetMapping("/provincia/{id}")
    public ResponseEntity<List<Localidad>> buscarPorProvincia(@PathVariable Long id) throws Exception{
        List<Localidad> localidades = localidadService.provincia(id);
        return ResponseEntity.ok(localidades);
    }
}