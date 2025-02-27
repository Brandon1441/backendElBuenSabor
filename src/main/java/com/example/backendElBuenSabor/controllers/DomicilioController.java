package com.example.backendElBuenSabor.controllers;
import com.example.backendElBuenSabor.entities.Domicilio;
import com.example.backendElBuenSabor.services.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController extends BaseController<Domicilio, Long>{
    @Autowired
    private DomicilioService domicilioService;

    public DomicilioController(DomicilioService domicilioService){
        super(domicilioService);
    }

    @GetMapping("/localidad/{id}")
    public ResponseEntity<List<Domicilio>> getByLocalidad(@PathVariable Long id) throws Exception{
        List<Domicilio> loca =  domicilioService.localidad(id);
        return ResponseEntity.ok(loca);
    }
}
