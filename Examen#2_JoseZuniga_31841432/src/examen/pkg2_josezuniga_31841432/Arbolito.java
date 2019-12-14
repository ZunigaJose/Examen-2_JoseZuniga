package examen.pkg2_josezuniga_31841432;

import javax.swing.tree.DefaultTreeModel;

public class Arbolito {
    private DefaultTreeModel model;
    private Usuarios user;

    public Arbolito(DefaultTreeModel model, Usuarios user) {
        this.model = model;
        this.user = user;
    }

    public DefaultTreeModel getModel() {
        return model;
    }

    public void setModel(DefaultTreeModel model) {
        this.model = model;
    }

    public Usuarios getUser() {
        return user;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }
}
