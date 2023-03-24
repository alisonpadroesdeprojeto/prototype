package prototype;

public class Formiga implements Cloneable {

    private int idade;
    private String cor;
    private double tamanho;

    public Formiga(int idade, String cor, double tamanho) {
        this.idade = idade;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public int getIdade() { return idade; }

    public void setIdade(int idade) { this.idade = idade; }

    public String getCor() { return cor; }

    public void setCor(String cor) { this.cor = cor; }

    public double getTamanho() { return tamanho; }

    public void setTamanho(double tamanho) { this.tamanho = tamanho; }

    @Override
    public Formiga clone() throws CloneNotSupportedException {
        return (Formiga) super.clone();
    }

    public String toString() {
        return "Forminga{" +
                "idade=" + this.getIdade() +
                ", cor='" + this.getCor() + '\'' +
                ", tamanho=" + this.getTamanho() +
                '}';
    }
}
