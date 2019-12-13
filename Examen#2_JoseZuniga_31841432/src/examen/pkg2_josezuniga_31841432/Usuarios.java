package examen.pkg2_josezuniga_31841432;

import java.util.ArrayList;

public class Usuarios {
    private String nombre, correo, usuario, canal, contraseña;
    private ArrayList<Canales> canales = new ArrayList<>();
    private Playlist favoritos;

    public Usuarios(String nombre, String correo, String usuario, String canal, String contraseña, Playlist favoritos) {
        this.nombre = nombre;
        this.correo = correo;
        this.usuario = usuario;
        this.canal = canal;
        this.contraseña = contraseña;
        this.favoritos = favoritos;
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

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Canales> getCanales() {
        return canales;
    }

    public void setCanales(ArrayList<Canales> canales) {
        this.canales = canales;
    }
    
    public Canales getCanalA(int pos) {
        return canales.get(pos);
    }

    public void setCanalA(Canales canal) {
        this.canales.add(canal);
    }

    public Playlist getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(Playlist favoritos) {
        this.favoritos = favoritos;
    }
    
    
}
