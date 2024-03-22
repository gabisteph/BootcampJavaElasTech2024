package colaborador;

public class Main {
    public static void main(String[] args) {

        Colaborador colaborador1 = new Colaborador("Gabrielle", "Mestrinho", 5500.0);
        Colaborador colaborador2 = new Colaborador("Viviane", "Capella", 8000.0);
         //
        // coloquei assim pq tava vindo muitos zeros no valor pós a vírgula
        System.out.printf("Salário anual de %s %s: $%.2f%n", colaborador1.getNome(), colaborador1.getSobrenome(), colaborador1.getSalarioAnual());
        System.out.printf("Salário anual de %s %s: $%.2f%n", colaborador2.getNome(), colaborador2.getSobrenome(), colaborador2.getSalarioAnual());

        //chamando o método do Ajusteee
        colaborador1.Ajuste();
        colaborador2.Ajuste();

        System.out.printf("Ajuste salário anual de %s %s: $%.2f%n", colaborador1.getNome(), colaborador1.getSobrenome(), colaborador1.getSalarioAnual());
        System.out.printf("Ajuste salário anual de %s %s: $%.2f%n", colaborador2.getNome(), colaborador2.getSobrenome(), colaborador2.getSalarioAnual());
    }
}