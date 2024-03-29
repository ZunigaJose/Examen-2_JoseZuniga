package examen.pkg2_josezuniga_31841432;

import java.io.Serializable;
import java.util.ArrayList;

public class Canales implements Serializable {
    private int subs, cantVideos, likes;
    private String nombre,categoría;
    private ArrayList<Videos> videos = new ArrayList<>();

    public Canales() {
    }

    public Canales(String nombre, String categoría) {
        this.subs = 0;
        this.cantVideos = 0;
        this.likes = 0;
        this.nombre = nombre;
        this.categoría = categoría;
    }

    public int getSubs() {
        return subs;
    }

    public void setSubs(int subs) {
        this.subs = subs;
    }

    public int getCantVideos() {
        return cantVideos;
    }

    public void setCantVideos(int cantVideos) {
        this.cantVideos = cantVideos;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
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

    @Override
    public String toString() {
        return nombre;
    }
}
