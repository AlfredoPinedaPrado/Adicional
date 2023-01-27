package Adicional;

public class Marca extends Operadora {
    private String marca;

    public Marca(String linea, String marca) {
        super(linea);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
