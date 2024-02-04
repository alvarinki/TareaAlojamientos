package naranco.dam.proyectoalojamientos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "propietarios")
public class Propietario {
    @Id
    @Column(name = "id", nullable = false)
    private Long idPropietario;

    @Column(name = "nombre")
    private String nombre;

}