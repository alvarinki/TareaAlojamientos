package naranco.dam.proyectoalojamientos.service;

import naranco.dam.proyectoalojamientos.model.Distrito;

import java.util.List;
import java.util.Optional;

public interface DistritoService {

    public List<Distrito> findAllDistritos();

    public Optional<Distrito> findDistritoById(Long id);
}
