package com.example.backendElBuenSabor.services;

import com.example.backendElBuenSabor.entities.DetallePedido;
import com.example.backendElBuenSabor.repositories.DetallePedidoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoService extends BaseService<DetallePedido, Long>{

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoService(DetallePedidoRepository detallePedidoRepository) {
        super(detallePedidoRepository);
    }

    @Transactional
    public List<DetallePedido> listarPorPedido(Long idPedido) throws Exception {
        try{
            return detallePedidoRepository.findAllByPedido_Id(idPedido);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }

    }

}
