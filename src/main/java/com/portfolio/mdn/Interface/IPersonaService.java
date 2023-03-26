
package com.portfolio.mdn.Interface;

import com.portfolio.mdn.Entity.Persona;
import java.util.List;

/**
 *
 * @author Gabri
 */
public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto que buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
