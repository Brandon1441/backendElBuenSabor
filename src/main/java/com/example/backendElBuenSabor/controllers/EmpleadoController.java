package com.example.backendElBuenSabor.controllers;
import com.example.backendElBuenSabor.entities.Empleado;
import com.example.backendElBuenSabor.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController extends BaseController<Empleado, Long>{
    @Autowired
    private EmpleadoService empleadoService;
    public EmpleadoController(EmpleadoService empleadoService) {
        super(empleadoService);
    }

    @GetMapping("/sucursales/{id}")
    public ResponseEntity<List<Empleado>> obtenerSucursalesDelEmpleado(@PathVariable Long id) throws Exception{
        List<Empleado> e = empleadoService.buscarPorSucursal(id);
        return ResponseEntity.ok(e);
    }
}
