package naranco.dam.proyectoalojamientos.repository;

import naranco.dam.proyectoalojamientos.model.Alojamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.util.AlternativeJdkIdGenerator;

import java.util.List;

public interface AlojamientoRepository extends JpaRepository<Alojamiento, Long> {


    List<Alojamiento> findAlojamientosByBarrio_Distrito_IdDistrito(Long idDistrito);

    List<Alojamiento> findAlojamientosByBarrio_Distrito_IdDistritoAndPrecioBetween(Long idDistrito, Double min, Double max);

    List<Alojamiento> findAlojamientosByBarrio_Distrito_IdDistritoAndHabitaciones(Long idDistrito, int habitaciones);

    List<Alojamiento> findAlojamientosByBarrio_Distrito_IdDistritoAndHabitacionesAndBanos(Long idDistrito, int habitaciones, int banos);

}
