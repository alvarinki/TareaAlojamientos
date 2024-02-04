package naranco.dam.proyectoalojamientos.controller;

import io.swagger.v3.oas.annotations.Operation;
import naranco.dam.proyectoalojamientos.model.Alojamiento;
import naranco.dam.proyectoalojamientos.model.Distrito;
import naranco.dam.proyectoalojamientos.service.AlojamientoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin
@RequestMapping(value="/alojamiento/")
public class AlojamientoController extends AbstractController {

    @Autowired
    private AlojamientoService alojamientoService;

    @Operation(summary = "Obtiene una lista de todos los alojamientos")
    @GetMapping
    public ResponseEntity<List<Alojamiento>> getAlojamientos() {
        List<Alojamiento> alojamientos = alojamientoService.findAllAlojamientos();
        if (alojamientos == null || alojamientos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(alojamientos, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Alojamiento> savePelicula(@RequestBody Alojamiento alojamiento) {
        if (alojamiento != null) {
            return new ResponseEntity<>(alojamientoService.saveAlojamiento(alojamiento), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }

    @PutMapping
    public ResponseEntity<Alojamiento> updatePelicula(@RequestBody Alojamiento alojamiento) {
        Alojamiento alojamientoUpdated = alojamientoService.updateAlojamiento(alojamiento);
        if (alojamientoUpdated != null) {
            return new ResponseEntity<>(alojamientoUpdated, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/distrito/{idDistrito}")
    public ResponseEntity<List<Alojamiento>> findAlojamientosByDistritoId(@PathVariable Long idDistrito) {
        List<Alojamiento> alojamientos = alojamientoService.getAlojamientosByDistrito(idDistrito);
        if (alojamientos == null || alojamientos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(alojamientos, HttpStatus.OK);
    }

    @GetMapping("/distrito/{idDistrito}/min/{min}/max/{max}")
    public ResponseEntity<List<Alojamiento>> findAlojamientosByDistritoAndBetweenPrecios(@PathVariable Long idDistrito, @PathVariable Double min, @PathVariable Double max) {
        List<Alojamiento> alojamientos = alojamientoService.getAlojamientoByDistritoAndBetweenPrecios(idDistrito, min, max);
        if (alojamientos == null || alojamientos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(alojamientos, HttpStatus.OK);
    }

    @GetMapping("/distrito/{idDistrito}/habitaciones/{numHabitaciones}")
    public ResponseEntity<List<Alojamiento>> findAlojamientosByDistritoAndHabitaciones(@PathVariable Long idDistrito, @PathVariable int numHabitaciones) {
        List<Alojamiento> alojamientos= alojamientoService.getAlojamientoByDistritoAndHabitaciones(idDistrito, numHabitaciones);
        if(alojamientos==null || alojamientos.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(alojamientos, HttpStatus.OK);
    }

    @GetMapping("/distrito/{idDistrito}/habitaciones/{numHabitaciones}/banos/{numBanos}")
    public ResponseEntity<List<Alojamiento>> findAlojamientosByDistritoAndHabitacionesAndBanos(@PathVariable Long idDistrito, @PathVariable int numHabitaciones, @PathVariable int numBanos){
        List<Alojamiento> alojamientos= alojamientoService.getAlojamientoByDistritoAndHabitacionesAndBanos(idDistrito, numHabitaciones, numBanos);
        if(alojamientos==null || alojamientos.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(alojamientos, HttpStatus.OK);
    }
}
