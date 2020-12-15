package modelo;

import java.util.ArrayList;

public class PersonaDAO {
    // Data Access Object
    Persona p;
    
    public void ingresarPersona(ArrayList<Persona> lista,int id,String apellidos,String nombres,int genero){
        p=new Persona(id, apellidos, nombres, genero);
        lista.add(p);
    }
    
    
}
