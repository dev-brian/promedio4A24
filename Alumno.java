public class Alumno {
    private String nombre;
    private String matricula;
    private double ingles;
    private double iot;
    private double estructuras;
    private double promedio;

    //constructor
    public Alumno(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getIngles() {
        return ingles;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

    public double getIot() {
        return iot;
    }

    public void setIot(double iot) {
        this.iot = iot;
    }

    public double getEstructuras() {
        return estructuras;
    }

    public void setEstructuras(double estructuras) {
        this.estructuras = estructuras;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = (this.estructuras+ this.ingles+ this.iot) / 3;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", matricula=" + matricula + ", promedio=" + promedio + "]";
    }

    
    
    //getters y setters
}
