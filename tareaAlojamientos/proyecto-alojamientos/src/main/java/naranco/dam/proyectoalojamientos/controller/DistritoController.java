package naranco.dam.proyectoalojamientos.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import naranco.dam.proyectoalojamientos.model.Distrito;
import naranco.dam.proyectoalojamientos.service.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="/distrito/")
public class DistritoController extends AbstractController{

    @Autowired
    private DistritoService distritoService;
    @Operation(summary = "Obtiene una lista de todos los distritos")
    @GetMapping
    public ResponseEntity<List<Distrito>> getDistritos(){
        List<Distrito> distritos= distritoService.findAllDistritos();
        if(distritos==null || distritos.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(distritos, HttpStatus.OK);
    }



}
