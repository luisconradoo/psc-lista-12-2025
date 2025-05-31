public class Pessoa {
    
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer() {
        this.idade++;
        
        if (this.idade < 21) {
            this.altura += 0.005;
        }
    }
    
    public void engordar(double pesoGanho) {
        if (pesoGanho > 0) {
            this.peso += pesoGanho;
        }
    }

    public void emagrecer(double pesoPerdido) {
        if (pesoPerdido > 0) {
            this.peso -= pesoPerdido;
        }
    }

    public void crescer(double alturaGanha) {
        if (alturaGanha > 0) {
            this.altura += alturaGanha;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso + " kg" +
                ", altura=" + altura + " m" +
                '}';
    }
}