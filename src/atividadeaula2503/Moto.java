package atividadeaula2503;

public class Moto extends Veiculos {
    int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Moto(String marca, String modelo, String cor, int ano, int cilindradas) {
        super(marca, modelo, cor, ano);
        this.cilindradas = cilindradas;
    }
    public void mostrarVeiculo(){
        super.mostrarVeiculo();
        System.out.println("Cilindradas: "+ cilindradas);
    }


}
