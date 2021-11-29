package Modelo.Domain;

public class Persona {

    // Atributos
    private String documento;
	private String nombre;
	private String direccion;







    // Metodos de acceso
    public void setDocumento(String documento){
        this.documento=documento;
    }

    public String getDocumento(){
        return this.documento;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public String getDireccion(){
        return this.direccion;
    }


}
