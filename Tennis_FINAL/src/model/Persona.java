package model;

public class Persona {
    
    private String nombre;
    private Integer edad;
    private String nacionalidad;

    public Persona() {
    }

    public Persona(String nombre, Integer edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Persona {" + "Nombre: " + nombre + ", edad: " + edad + ", nacionalidad: " + nacionalidad + " }";
    }
    
    
}
