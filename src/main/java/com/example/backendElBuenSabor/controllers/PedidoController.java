package com.example.backendElBuenSabor.controllers;
import com.example.backendElBuenSabor.entities.Pedido;
import com.example.backendElBuenSabor.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseController<Pedido, Long> {
    @Autowired
    private PedidoService pedidoService;
    public PedidoController(PedidoService pedidoService){
        super(pedidoService);
    }

    @PutMapping("/total")
    public Optional<Pedido> calcularTotal(@RequestBody Pedido pedido) throws Exception {
        Pedido pedido_aux = pedidoService.calcularTotal(pedido);
        return Optional.ofNullable(pedido_aux);
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<List<Pedido>> pedidoPorCliente(@PathVariable Long id) throws Exception {
        List<Pedido> clientes = pedidoService.cliente(id);
        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/empleado/{id}")
    public ResponseEntity<List<Pedido>> pedidoPorEmpleado(@PathVariable Long id) throws Exception {
        List<Pedido> empleados = pedidoService.empleado(id);
        return ResponseEntity.ok(empleados);
    }

    @GetMapping("/sucursal/{id}")
    public ResponseEntity<List<Pedido>> pedidoPorSucursal(@PathVariable Long id) throws Exception {
        List<Pedido> sucursales = pedidoService.sucursal(id);
        return ResponseEntity.ok(sucursales);
    }

    @GetMapping("/factura/{id}")
    public ResponseEntity<List<Pedido>> pedidoPorFactura(@PathVariable Long id) throws Exception {
        List<Pedido> facturas = pedidoService.factura(id);
        return ResponseEntity.ok(facturas);
    }
}
