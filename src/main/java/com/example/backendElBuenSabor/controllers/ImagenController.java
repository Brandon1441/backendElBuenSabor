package com.example.backendElBuenSabor.controllers;
import com.example.backendElBuenSabor.entities.Imagen;
import com.example.backendElBuenSabor.services.ImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "Imagen")
public class ImagenController extends BaseController<Imagen, Long> {
    @Autowired
    private ImagenService imagenService;
    public ImagenController(ImagenService imagenService) {
        super(imagenService);
    }
}
