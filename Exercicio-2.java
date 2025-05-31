public class Quadrado {
    
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    public void mudarLado(double novoLado) {
        this.lado = novoLado;
    }

    public double retornarLado() {
        return this.lado;
    }

    public double calcularArea() {
        return this.lado * this.lado;
    }

    Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                ", area=" + calcularArea() +
                '}';
    }
}