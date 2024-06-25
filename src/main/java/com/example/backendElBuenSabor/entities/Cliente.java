package com.example.backendElBuenSabor.entities;
import com.example.backendElBuenSabor.entities.enums.Rol;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente extends Persona {

    @Column(name = "tipo_Cliente")
    private Rol rol;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Domicilio domicilio;

    @OneToOne
    @JoinColumn(name = "fk_imagen_cliente")
    private Imagen imagenCliente;

    @OneToOne
    @JoinColumn(name = "fk_usuario_cliente")
    private Usuario usuarioCliente;
}
