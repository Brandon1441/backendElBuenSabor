package com.example.backendElBuenSabor.controllers;
import java.util.List;
import org.springframework.http.ResponseEntity;
import com.example.backendElBuenSabor.entities.Provincia;
import com.example.backendElBuenSabor.services.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController extends BaseController<Provincia, Long> {
    @Autowired
    private ProvinciaService provinciaService;
    public ProvinciaController(ProvinciaService provinciaService) {
        super(provinciaService);
    }

    @GetMapping("/pais/{id}")
    public ResponseEntity<List<Provincia>> getByPais(@PathVariable Long id) throws Exception{
        List<Provincia> pais = provinciaService.pais(id);
        return ResponseEntity.ok(pais);
    }
}
