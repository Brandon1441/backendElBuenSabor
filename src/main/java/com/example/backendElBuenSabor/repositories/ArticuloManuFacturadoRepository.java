
package com.example.backendElBuenSabor.repositories;
import java.util.List;
import com.example.backendElBuenSabor.entities.ArticuloManuFacturado;
import com.example.backendElBuenSabor.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloManuFacturadoRepository extends BaseRepository<ArticuloManuFacturado, Long> {

    List<ArticuloManuFacturado> findAllByCategoria_Id(Long categoriaId);
}
