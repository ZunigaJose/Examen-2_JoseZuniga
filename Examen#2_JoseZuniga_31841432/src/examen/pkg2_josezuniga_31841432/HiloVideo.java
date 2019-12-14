package examen.pkg2_josezuniga_31841432;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class HiloVideo implements Runnable {
    private Videos video;
    private JProgressBar barrita;
    private JTextArea text;
    private Date inicio;
    private boolean vive;
    private boolean reset;

    public HiloVideo(Videos video, JProgressBar barrita, Date inicio, JTextArea area) {
        this.video = video;
        this.barrita = barrita;
        vive = true;
        reset = true;
        this.inicio = inicio;
        this.text = area;
    }

    public HiloVideo() {
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isReset() {
        return reset;
    }

    public void setReset(boolean reset) {
        this.reset = reset;
    }
    
    @Override
    public void run() {
        int pos = 0;
        int segundos = 0;
        video.getTiempo();
        barrita.setMaximum(video.getTiempo());
        while (vive) {
            long tiempo = new Date().getTime() - inicio.getTime();
            segundos = (int)tiempo/1000;
            if (segundos == barrita.getMaximum()) {
                vive = false;
                break;
            }
            if (segundos % 10 == 0) {
                text.setText(video.getSubtitulo(pos));
                pos++;
            }
            barrita.setValue(segundos);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloVideo.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }
}
