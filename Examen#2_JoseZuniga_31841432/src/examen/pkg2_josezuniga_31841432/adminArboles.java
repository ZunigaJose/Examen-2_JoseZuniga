package examen.pkg2_josezuniga_31841432;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminArboles {
    private File file = null;
    private ArrayList<Arbolito> arboles = new ArrayList<>();

    public adminArboles(String path) {
        file = new File(path);
    }

    public ArrayList<Arbolito> getArboles() {
        return arboles;
    }

    public void setArboles(ArrayList<Arbolito> arboles) {
        this.arboles = arboles;
    }
    
    public Arbolito getArbol(int pos) {
        return arboles.get(pos);
    }

    public void setArbol(Arbolito arbol) {
        this.arboles.add(arbol);
    }
    
    public void leerArchivo() {
        FileInputStream fi = null;
        ObjectInputStream oi = null;
        try {
            arboles = new ArrayList<>();
            fi = new FileInputStream(file);
            oi = new ObjectInputStream(fi);
            Arbolito arbol;//objecto que va en arraylist
            while ((arbol = (Arbolito) oi.readObject()) != null) {//castear!!
                arboles.add(arbol);
            }
        } catch (Exception e) {
            
        }
        try {
            oi.close();
            fi.close();
        } catch (Exception e) {
        }
    }
    
    public void guardarArchivo() {
        ObjectOutputStream ob = null;
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream(file);
            ob = new ObjectOutputStream(fo);
            for (Arbolito arbol : arboles ) {
                ob.writeObject(arbol);
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
}
