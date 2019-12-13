package examen.pkg2_josezuniga_31841432;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuarios implements Serializable {
    private String nombre, correo, usuario, contraseña;
    private Canales canal;
    private int edad;
    private ArrayList<Canales> canalesSub = new ArrayList<>();
    private Playlist favoritos = new Playlist();

    public Usuarios(String nombre, String correo, String usuario, Canales canal, String contraseña, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.usuario = usuario;
        this.canal = canal;
        this.contraseña = contraseña;
        this.edad = edad;
    }

    public Usuarios() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Canales getCanal() {
        return canal;
    }

    public void setCanal(Canales canal) {
        this.canal = canal;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Canales> getCanalesSub() {
        return canalesSub;
    }

    public void setCanalesSub(ArrayList<Canales> canalesSub) {
        this.canalesSub = canalesSub;
    }
    
    public Canales getCanalSub(int pos) {
        return canalesSub.get(pos);
    }

    public void setCanalSub(Canales canal) {
        this.canalesSub.add(canal);
    }

    public Playlist getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(Playlist favoritos) {
        this.favoritos = favoritos;
    }
    
    
}
