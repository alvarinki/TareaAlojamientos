package naranco.dam.proyectoalojamientos.ServiceImpl;

import naranco.dam.proyectoalojamientos.model.Alojamiento;
import naranco.dam.proyectoalojamientos.repository.AlojamientoRepository;
import naranco.dam.proyectoalojamientos.service.AlojamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlojamientoServiceImpl implements AlojamientoService {

    @Autowired
    private AlojamientoRepository alojamientoRepository;


    @Override
    public List<Alojamiento> findAllAlojamientos() {
        return alojamientoRepository.findAll();
    }

    @Override
    public Alojamiento updateAlojamiento(Alojamiento alojamiento) {
        if(alojamientoRepository.findById(alojamiento.getIdAlojamiento()).isPresent()){
            return alojamientoRepository.save(alojamiento);
        }
        return null;
    }

    @Override
    public Alojamiento saveAlojamiento(Alojamiento alojamiento) {
        if(alojamiento!=null){
            return alojamientoRepository.save(alojamiento);
        }
        return null;
    }

    @Override
    public List<Alojamiento> getAlojamientosByDistrito(Long idDistrito) {
        return alojamientoRepository.findAlojamientosByBarrio_Distrito_IdDistrito(idDistrito);

    }

    @Override
    public List<Alojamiento> getAlojamientoByDistritoAndBetweenPrecios(Long idDistrito, Double min, Double max) {
        return alojamientoRepository.findAlojamientosByBarrio_Distrito_IdDistritoAndPrecioBetween
                (idDistrito, min, max);
    }

    @Override
    public List<Alojamiento> getAlojamientoByDistritoAndHabitaciones(Long idDistrito, int habitaciones) {
        return alojamientoRepository.findAlojamientosByBarrio_Distrito_IdDistritoAndHabitaciones(idDistrito, habitaciones);
    }

    @Override
    public List<Alojamiento> getAlojamientoByDistritoAndHabitacionesAndBanos(Long idDistrito, int numHabitaciones, int numBanos) {
        return alojamientoRepository.findAlojamientosByBarrio_Distrito_IdDistritoAndHabitacionesAndBanos(idDistrito, numHabitaciones, numBanos);
    }


}
