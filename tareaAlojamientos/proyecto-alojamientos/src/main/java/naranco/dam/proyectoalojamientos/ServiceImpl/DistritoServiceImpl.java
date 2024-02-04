package naranco.dam.proyectoalojamientos.ServiceImpl;

import naranco.dam.proyectoalojamientos.model.Distrito;
import naranco.dam.proyectoalojamientos.repository.DistritoRepository;
import naranco.dam.proyectoalojamientos.service.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistritoServiceImpl implements DistritoService {


    @Autowired
    private DistritoRepository distritoRepo;
    @Override
    public List<Distrito> findAllDistritos() {
        return distritoRepo.findAll();
    }

    @Override
    public Optional<Distrito> findDistritoById(Long id) {
        return distritoRepo.findById(id);
    }
}
