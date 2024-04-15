package atividadeaula2503;

public class Main {
    public static void main(String[] args) {

        Carro car1 = new Carro("Fiat", "Mobi", "vermelho", 2023, 4);
        Moto moto1 = new Moto("teste","teste","amarela",2025,56);
        car1.mostrarVeiculo();
        moto1.mostrarVeiculo();
    }
}
