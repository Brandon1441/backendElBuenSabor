
package com.example.backendElBuenSabor.repositories;
import java.util.List;
import com.example.backendElBuenSabor.entities.Empleado;
import com.example.backendElBuenSabor.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends BaseRepository<Empleado,Long> {
    List<Empleado> findAllBySucursal_Id(Long idSucursal);
}

