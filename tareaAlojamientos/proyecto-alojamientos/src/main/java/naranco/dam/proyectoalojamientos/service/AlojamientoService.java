package naranco.dam.proyectoalojamientos.service;

import naranco.dam.proyectoalojamientos.model.Alojamiento;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AlojamientoService {

    List<Alojamiento> findAllAlojamientos();

    Alojamiento updateAlojamiento(Alojamiento alojamiento);

    Alojamiento saveAlojamiento(Alojamiento alojamiento);

    List<Alojamiento> getAlojamientosByDistrito(Long idDistrito);

    List<Alojamiento> getAlojamientoByDistritoAndBetweenPrecios(Long idDistrito, Double min, Double max);



    List<Alojamiento> getAlojamientoByDistritoAndHabitaciones(Long idDistrito, int habitaciones);

    List<Alojamiento> getAlojamientoByDistritoAndHabitacionesAndBanos(Long idDistrito, int numHabitaciones, int numBanos);
}
