
package lab8p2_alejandrocardona;

public class Evento {
    
    private String estilo;
    private int distancia;
    private int record;

    public Evento(String estilo, int distancia, int record) {
        this.estilo = estilo;
        this.distancia = distancia;
        this.record = record;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }
    
    
    
}
