package colaborador;

public class Colaborador {
    // Atributos
    private String Nome;
    private String sobrenome;
    private double salarioMensal;

    // Construtor
    public Colaborador(String Nome, String sobrenome, double salarioMensal) {
        this.Nome = Nome;
        this.sobrenome = sobrenome;
        if (salarioMensal > 0.0)
            this.salarioMensal = salarioMensal;
        else
            this.salarioMensal = 0.0;
    }

    // get e set necessários
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0.0)
            this.salarioMensal = salarioMensal;
        else
            this.salarioMensal = 0.0;
    }

    // calculo do salario anual
    public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    // ajuste do salário anual
    public void Ajuste() {
        salarioMensal *= 1.1;
    }
}
