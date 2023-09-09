
package lab8p2_alejandrocardona;

import javax.swing.JProgressBar;
import javax.swing.JSpinner;

public class Nadador1 extends Thread{
    
    private JProgressBar progBar_c;
    private int tiempoMax;
    private boolean vive;

    public Nadador1(JProgressBar progBar_c, int tiempoMax) {
        this.progBar_c = progBar_c;
        this.tiempoMax = tiempoMax;
        vive = true;
    }

    

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
                progBar_c.setMaximum(tiempoMax*100);
                progBar_c.setValue(progBar_c.getValue()+100);
                if(progBar_c.getValue() >= tiempoMax*100){
                    
                    vive = false;
                    
                }
            try {
                Thread.sleep(100);
                
            } catch (InterruptedException ex) {
            }
        }

    }
    
}
