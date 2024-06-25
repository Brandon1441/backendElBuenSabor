package com.example.backendElBuenSabor.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario extends Base{
    @Column(name = "auth_O_Id")
    private String auth0Id;
    @Column(name = "user_name")
    private String userName;
}
