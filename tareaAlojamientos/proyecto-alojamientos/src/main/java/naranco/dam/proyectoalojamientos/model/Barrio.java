package naranco.dam.proyectoalojamientos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "barrios")
public class Barrio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idBarrio;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "distrito_id")
    private Distrito distrito;

    @Column(name = "nombre")
    private String nombre;

}