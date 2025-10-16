package progresa.relacionalclase.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter

public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column
    private String calle;
    @Column
    private String numero;
    @Column
    private String codigoPostal;

    @OneToOne
    private Restaurante restaurante;
}
