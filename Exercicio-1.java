public class Bola {
    
    private String cor;
    private double circunferencia;
    private String material;

    
    public Bola(String cor, double circunferencia, String material) {
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    
    public void trocaCor(String novaCor) {
        this.cor = novaCor;
    }

    
    public String mostraCor() {
        return this.cor;
    }

    
    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    Override
    public String toString() {
        return "Bola{" +
                "cor='" + cor + '\'' +
                ", circunferencia=" + circunferencia +
                ", material='" + material + '\'' +
                '}';
    }
}