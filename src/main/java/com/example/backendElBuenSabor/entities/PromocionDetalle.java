package com.example.backendElBuenSabor.entities;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "promocion_detalle")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PromocionDetalle extends Base {

    @Column(name = "cantidad")
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "id_promocion")
    private Promocion promocion;

    @ManyToOne
    @JoinColumn(name = "id_articulo")
    private Articulo articulo;
}
