public class Retangulo {
    
    private double ladoA;  // Comprimento
    private double ladoB;  // Largura

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public void setLadoA(double novoLadoA) {
        this.ladoA = novoLadoA;
    }

    public void setLadoB(double novoLadoB) {
        this.ladoB = novoLadoB;
    }

    public double getLadoA() {
        return this.ladoA;
    }

    public double getLadoB() {
        return this.ladoB;
    }

    public double calcularArea() {
        return this.ladoA * this.ladoB;
    }

    public double calcularPerimetro() {
        return 2 * (this.ladoA + this.ladoB);
    }

    Override
    public String toString() {
        return "Retangulo{" +
                "ladoA=" + ladoA +
                ", ladoB=" + ladoB +
                ", area=" + calcularArea() +
                ", perimetro=" + calcularPerimetro() +
                '}';
    }
}