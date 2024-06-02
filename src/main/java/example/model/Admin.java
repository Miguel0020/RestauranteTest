package example.model;

public class Admin {
    private String crear;
    private String ver;
    private String actualizar;
    private String eliminar;

    public Admin(String crear, String ver, String actualizar, String eliminar) {
        this.crear = crear;
        this.ver = ver;
        this.actualizar = actualizar;
        this.eliminar = eliminar;
    }

    public String getCrear() {
        return this.crear;
    }

    public void setCrear(String crear) {
        this.crear = crear;
    }

    public String getVer() {
        return this.ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getActualizar() {
        return this.actualizar;
    }

    public void setActualizar(String actualizar) {
        this.actualizar = actualizar;
    }

    public String getEliminar() {
        return this.eliminar;
    }

    public void setEliminar(String eliminar) {
        this.eliminar = eliminar;
    }
}
