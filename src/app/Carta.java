package app;


public class Carta {
    private String palo;
    private String valor;

    public Carta(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public int getCuenta() {
        if ("2".equals(this.valor) || "3".equals(this.valor) || "4".equals(this.valor) || "5".equals(this.valor) || "6".equals(this.valor)) return 1;
        if ("7".equals(this.valor) || "8".equals(this.valor) || "9".equals(this.valor)) return 0;
        return -1;
    }
    
    public String getInfo() {
        return "Palo: " + this.palo + " - Valor: " + this.valor;
    }
}
