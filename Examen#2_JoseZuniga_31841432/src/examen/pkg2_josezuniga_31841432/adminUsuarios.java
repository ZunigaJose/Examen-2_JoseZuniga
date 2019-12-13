package examen.pkg2_josezuniga_31841432;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminUsuarios {
    private File file;
    private ArrayList<Usuarios> users = new ArrayList<>();

    public adminUsuarios(String path) {
        this.file = new File(path);
    }

    public ArrayList<Usuarios> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Usuarios> users) {
        this.users = users;
    }
    
    public Usuarios getUser(int pos) {
        return users.get(pos);
    }

    public void setUser(Usuarios user) {
        this.users.add(user);
    }
    
    public void guardarArchivo() {
        ObjectOutputStream ob = null;
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream(file);
            ob = new ObjectOutputStream(fo);
            for (Usuarios usuario : users ) {
                ob.writeObject(usuario);
            }            
            ob.flush();
        } catch (Exception e) {
            
        }
        try {
            ob.close();
            fo.close();
        } catch (Exception e) {
        }
    }
    
    public void leerArchivo() {
        FileInputStream fi = null;
        ObjectInputStream oi = null;
        try {
            users = new ArrayList<>();
            fi = new FileInputStream(file);
            oi = new ObjectInputStream(fi);
            Usuarios user;//objecto que va en arraylist
            while ((user = (Usuarios) oi.readObject()) != null) {//castear!!
                users.add(user);
            }
        } catch (Exception e) {
            
        }
        try {
            oi.close();
            fi.close();
        } catch (Exception e) {
        }
    }
}
