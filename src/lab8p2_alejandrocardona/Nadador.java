
package lab8p2_alejandrocardona;

import java.io.Serializable;



public class Nadador implements Serializable{
    
    private String nombre;
    private int edad, distancia, medallasCant;
    private Pais paisOrigen;
    private String estilo;
    private double estatura;
    private double mejorTemp;

    public Nadador(String nombre, int edad, int distancia, int medallasCant, Pais paisOrigen, double estatura, String estilo, double mejorTemp) {
        this.nombre = nombre;
        this.edad = edad;
        this.distancia = distancia;
        this.medallasCant = medallasCant;
        this.paisOrigen = paisOrigen;
        this.estatura = estatura;
        this.estilo = estilo;
        this.mejorTemp = mejorTemp;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMejorTemp() {
        return mejorTemp;
    }

    public void setMejorTemp(double mejorTemp) {
        this.mejorTemp = mejorTemp;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getMedallasCant() {
        return medallasCant;
    }

    public void setMedallasCant(int medallasCant) {
        this.medallasCant = medallasCant;
    }

    public Pais getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(Pais paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    
    
}
