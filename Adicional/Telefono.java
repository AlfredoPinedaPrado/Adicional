package Adicional;

public class Telefono extends Acciones {
    private String TipoTel;
    private String numero;
    private String contrato;

    public Telefono(String linea, String marca, String tipoTel, String numero, String contrato) {
        super(linea, marca);
        TipoTel = tipoTel;
        this.numero = numero;
        this.contrato = contrato;
    }

    public String getTipoTel() {
        return TipoTel;
    }

    public void setTipoTel(String tipoTel) {
        TipoTel = tipoTel;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }
}
