package src.pacotes;

public class Cachorro implements Paciente {
    private String nome;
    private int idade;
    private double peso;

    public Cachorro(String _nome, int _idade, double _peso) {
        this.nome = _nome;
        this.idade = _idade;
        this.peso = _peso;
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public void setIdade(int _idade) {
        this.idade = _idade;
    }

    public void setPeso(double _peso) {
        this.peso = _peso;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public String dizerOla() {
        return "Wolf... Wolf....";
    }

    @Override
    public String dizerDoenca() {
        return "Cainnnn....";
    }
}
