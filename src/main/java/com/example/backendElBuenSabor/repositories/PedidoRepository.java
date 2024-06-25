package com.example.backendElBuenSabor.repositories;

import com.example.backendElBuenSabor.entities.Empleado;
import com.example.backendElBuenSabor.entities.Pedido;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido, Long>{

    List<Pedido> findAllByCliente_Id(Long idCliente);

    List<Pedido> findAllByEmpleado_Id(Long idEmpleado);

    List<Pedido> findAllBySucursal_Id(Long idSucursal);

    List<Pedido> findAllByFactura_Id(Long idFactura);

}
