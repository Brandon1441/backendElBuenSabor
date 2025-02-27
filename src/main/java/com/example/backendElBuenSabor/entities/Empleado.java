package com.example.backendElBuenSabor.entities;
import com.example.backendElBuenSabor.entities.enums.Rol;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "empleados")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empleado extends Persona {

    @Column(name = "tipo_empleado")
    private Rol rol;

    @OneToOne
    @JoinColumn(name = "fk_imagen_empleado")
    private Imagen imagenEmpleado;

    @OneToOne
    @JoinColumn(name = "fk_usuario_empleado")
    private Usuario usuarioEmpleado;

    @ManyToOne
    @JoinColumn(name = "fk_sucursal")
    private Sucursal sucursal;
}
