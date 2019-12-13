package examen.pkg2_josezuniga_31841432;

import java.util.ArrayList;

public class Videos {
    private String nombre;
    private ArrayList<String> subtitulos = new ArrayList<>();
    private int likes, dislikes, tiempo;

    public Videos(String nombre, int likes, int dislikes, int tiempo) {
        this.nombre = nombre;
        this.likes = likes;
        this.dislikes = dislikes;
        this.tiempo = tiempo;
    }

    public Videos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(ArrayList<String> subtitulos) {
        this.subtitulos = subtitulos;
    }
    
    public String getSubtitulo(int pos) {
        return subtitulos.get(pos);
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulos.add(subtitulo);
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes() {
        this.likes += 1;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
