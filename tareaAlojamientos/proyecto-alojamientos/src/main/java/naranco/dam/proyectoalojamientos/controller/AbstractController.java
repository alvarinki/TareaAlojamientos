package naranco.dam.proyectoalojamientos.controller;

import naranco.dam.proyectoalojamientos.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@CrossOrigin
public class AbstractController {
    @Autowired
    private JWTUtil jwtUtil;

    public void comprobarAutorizacion(String token){
        if(!jwtUtil.validate(token)){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"Token incorrecto o expirado");
        }
    }
}
