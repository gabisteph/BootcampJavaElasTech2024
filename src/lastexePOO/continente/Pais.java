package lastexePOO.continente;

public class Pais {
    private String nome;
    private double dimensao; // em quilômetros quadrados
    private long populacao; // número de habitantes

    // Construtor
    public Pais(String nome, double dimensao, long populacao) {
        this.nome = nome;
        this.dimensao = dimensao;
        this.populacao = populacao;
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public double getDimensao() {
        return dimensao;
    }

    public long getPopulacao() {
        return populacao;
    }

    // Métodos de modificação
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }
}
