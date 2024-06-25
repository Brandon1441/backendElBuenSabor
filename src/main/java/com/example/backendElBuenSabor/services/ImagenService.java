package com.example.backendElBuenSabor.services;

import com.example.backendElBuenSabor.entities.Imagen;
import com.example.backendElBuenSabor.repositories.ImagenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagenService extends BaseService<Imagen, Long>{

    @Autowired
    private ImagenRepository imagenRepository;

    public ImagenService(ImagenRepository imagenRepository) {
        super(imagenRepository);
    }
}
