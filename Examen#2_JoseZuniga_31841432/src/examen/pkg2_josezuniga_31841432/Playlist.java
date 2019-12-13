package examen.pkg2_josezuniga_31841432;

import java.io.Serializable;
import java.util.ArrayList;

public class Playlist implements Serializable {
    private ArrayList<Videos> videos = new ArrayList<>();
    private int tiempoDura;

    public Playlist() {
    }

    public ArrayList<Videos> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Videos> videos) {
        this.videos = videos;
    }
    
    public Videos getVideo(int pos) {
        return videos.get(pos);
    }

    public void setVideo(Videos video) {
        this.videos.add(video);
    }

    public int getTiempoDura() {
        return tiempoDura;
    }

    public void setTiempoDura(int tiempoDura) {
        this.tiempoDura = tiempoDura;
    }    
}
