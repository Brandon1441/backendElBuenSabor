package com.example.backendElBuenSabor.controllers;
import org.springframework.http.ResponseEntity;
import com.example.backendElBuenSabor.entities.Sucursal;
import com.example.backendElBuenSabor.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalController extends BaseController<Sucursal, Long> {

    @Autowired
    private SucursalService sucursalService;

    public SucursalController(SucursalService sucursalService) {
        super(sucursalService);
    }

    @GetMapping("/empresa/{id}")
    public ResponseEntity<List<Sucursal>> listEmpresa(@PathVariable Long id) throws Exception{
        List<Sucursal> emp = sucursalService.empresa(id);
        return ResponseEntity.ok(emp);
    }
    @GetMapping("/promocion/{id}")
    public ResponseEntity<List<Sucursal>> listPromo(@PathVariable Long id) throws Exception{
        List<Sucursal> emp = sucursalService.promocion(id);
        return ResponseEntity.ok(emp);
    }
}
