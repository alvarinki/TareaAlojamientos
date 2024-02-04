package naranco.dam.proyectoalojamientos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alojamientos")
public class Alojamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idAlojamiento;

    @Column(name = "aseos", nullable = false)
    private Integer aseos;

    @Column(name = "banos", nullable = false)
    private Integer banos;

    @Column(name = "camas", nullable = false)
    private Integer camas;

    @Column(name = "habitaciones", nullable = false)
    private Integer habitaciones;

    @Column(name = "latitud", nullable = false)
    private Double latitud;

    @Column(name = "longitud", nullable = false)
    private Double longitud;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "puntuacion", nullable = false)
    private Double puntuacion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "barrio_id")
    private Barrio barrio;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "propietario_id")
    private Propietario propietario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tipoHabitacion_id")
    private Tiposhabitacion tipoHabitacion;

    @Column(name = "nombre")
    private String nombre;

}