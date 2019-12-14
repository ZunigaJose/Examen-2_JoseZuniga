package examen.pkg2_josezuniga_31841432;

import javax.swing.JProgressBar;

public class HiloVideo implements Runnable {
    private Videos video;
    private JProgressBar barrita;

    public HiloVideo(Videos video, JProgressBar barrita) {
        this.video = video;
        this.barrita = barrita;
    }

    public HiloVideo() {
    }

    @Override
    public void run() {
        
    }
    
    
}
