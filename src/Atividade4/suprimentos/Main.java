package Atividade4.suprimentos;

public class Main {
    public static void main(String[] args) {
        Suprimentos suprimento1 = new Suprimentos(1, "Mouse", 2, 25.0);

        System.out.println("id: " + suprimento1.getId());
        System.out.println("Descrição do suprimento: " + suprimento1.getDescricaoItem());
        System.out.println("Quantidade: " + suprimento1.getQtd());
        System.out.println("Preço da Unidade: $ " + suprimento1.getPrecoUnitario());
        System.out.println("Valor Total da Fatura: $ " + suprimento1.getInvoiceAmount());

        Suprimentos suprimento2 = new Suprimentos(2, "Cabo HDMI", 2, 28.0);

        System.out.println("id: " + suprimento2.getId());
        System.out.println("Descrição do suprimento: " + suprimento2.getDescricaoItem());
        System.out.println("Quantidade: " + suprimento2.getQtd());
        System.out.println("Preço da Unidade: $ " + suprimento2.getPrecoUnitario());
        System.out.println("Valor Total da Fatura: $ " + suprimento2.getInvoiceAmount());
    }
}
