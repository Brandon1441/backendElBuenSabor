package com.example.backendElBuenSabor.entities;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "domicilios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Domicilio extends Base{

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "codigo_postal")
    private Integer cp;

    @ManyToOne
    @JoinColumn(name = "fk_Localidad")
    private Localidad localidad;
}
