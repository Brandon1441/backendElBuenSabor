package com.example.backendElBuenSabor.services;
import com.example.backendElBuenSabor.entities.Factura;
import com.example.backendElBuenSabor.repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService extends BaseService<Factura, Long>{

    @Autowired
    private FacturaRepository facturaRepository;

    public FacturaService(FacturaRepository facturaRepository){
        super(facturaRepository);
    }
}
