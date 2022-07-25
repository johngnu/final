package examenfinal;

/**
 *
 * @author desktop
 */
public class Duenio {

    private int ci;
    private String nombre;
    private ListaAutomovilB ls;

    public Duenio() {
    }

    public Duenio(int ci, String nombre, ListaAutomovilB ls) {
        this.ci = ci;
        this.nombre = nombre;
        this.ls = ls;
    }

    public void mostrar() {

    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaAutomovilB getLs() {
        return ls;
    }

    public void setLs(ListaAutomovilB ls) {
        this.ls = ls;
    }

}
