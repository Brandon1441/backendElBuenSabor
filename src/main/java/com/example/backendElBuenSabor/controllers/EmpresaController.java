package com.example.backendElBuenSabor.controllers;
import com.example.backendElBuenSabor.entities.Empresa;
import com.example.backendElBuenSabor.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresas")
public class EmpresaController extends BaseController<Empresa, Long>{
    @Autowired
    private EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        super(empresaService);
    }
}
