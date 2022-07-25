package examenfinal;

/**
 *
 * @author desktop
 */
public class Auto {

    private String marca;
    private int modelo;
    private String tipo;
    private String color;
    private int precio;

    public Auto() {
    }

    public Auto(String marca, int modelo, String tipo, String color, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("marca: " + marca + " modelo: " + modelo + " tipo: " + tipo + " color: "
                + color + " precio: " + precio);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
