package com.example.backendElBuenSabor.controllers;
import com.example.backendElBuenSabor.entities.Usuario;
import com.example.backendElBuenSabor.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends BaseController<Usuario, Long>{
    @Autowired
    private UsuarioService usuarioService;
    public UsuarioController(UsuarioService usuarioService) {
        super(usuarioService);
    }
}
