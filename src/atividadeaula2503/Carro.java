package atividadeaula2503;

public class Carro extends Veiculos{
    private int qtdportas;
    public int getQtdportas(){

        return qtdportas;
    }

    public void setQtdportas(int qtdportas) {

        this.qtdportas = qtdportas;
    }

    public Carro(String marca, String modelo, String cor, int ano, int qtdportas){
        super(marca, modelo, cor, ano);
        this.qtdportas = qtdportas;
    }


    public void mostrarVeiculo(){
        super.mostrarVeiculo();
        System.out.println("quantidade de portas: "+ qtdportas);
    }


}
