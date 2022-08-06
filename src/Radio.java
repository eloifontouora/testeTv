import java.util.Scanner;

public class Radio {
    private String marca;
    private String fabricante;
    private boolean ligado;
    private int quantidade;

    public Radio(String marca, String fabricante, boolean ligado, int quantidade) {
        this.marca = marca;
        this.fabricante = fabricante;
        this.ligado = ligado;
        this.quantidade = quantidade;
    }

    public Radio() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "marca='" + marca + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", ligado=" + ligado +
                ", quantidade=" + quantidade +
                '}';
    }
}


