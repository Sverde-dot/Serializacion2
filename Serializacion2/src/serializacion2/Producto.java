package serializacion2;

import java.io.Serializable;

public class Producto implements Serializable{
    
    private String cod;
    private String info;
    private double precio;
    
    public Producto(String cod, String info, double precio) {
        this.cod = cod;
        this.info = info;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String desc) {
        this.info = info;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrezo(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Product{" + "cod=" + cod + ", desc=" + info + ", prezo=" + precio + '}';
    }

}
