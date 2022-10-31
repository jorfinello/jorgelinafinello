package com.porfolio.jor.Interface;

import com.porfolio.jor.entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una personaS
    public List<Persona> getPersona();
    //Guardar un objeto tipo persona
    public void savePersona (Persona persona);
    //Eliminar un objeto pero lo buscamos por id
    public void deletePersona (Long id);
    //Buscar una persona por id
    public Persona findPersona (Long id);
}