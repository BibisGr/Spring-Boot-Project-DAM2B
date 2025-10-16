package progresa.relacionalclase.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table
@Getter
@Setter

public class categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    @JsonIgnore
    private Set<Restaurante> restaurantes;

}
