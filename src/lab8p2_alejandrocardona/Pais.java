
package lab8p2_alejandrocardona;

import java.util.ArrayList;

import java.io.Serializable;

public class Pais implements Serializable{
    
    private String nombre;
    private ArrayList <Nadador> nadadores = new ArrayList();
    private int medallas;

    public Pais() {
    }

    
    
    public Pais(String nombre, int medallas) {
        this.nombre = nombre;
        this.medallas = medallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Nadador> getNadadores() {
        return nadadores;
    }

    public void setNadadores(ArrayList<Nadador> nadadores) {
        this.nadadores = nadadores;
    }
    
    public void addNadadores(Nadador n){
        
        this.nadadores.add(n);
        
    }
    
    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }
    
    

    @Override
    public String toString() {
        return getNombre();
    }
    
    
    
}
