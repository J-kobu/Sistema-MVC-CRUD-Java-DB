package modelo;

public class Persona {
    private int id; // PK
    private String apellidos;
    private String nombres;
    private int genero;

    public Persona(int id, String apellidos, String nombres, int genero) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.genero = genero;
    }

    public Persona() {
    }

    public Persona(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }
    
    
    
    
    
}
