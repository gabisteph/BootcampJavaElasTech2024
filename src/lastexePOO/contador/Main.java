package lastexePOO.contador;

import lastexePOO.contador.Contador;

public class Main {
    public static void main(String[] args){
        Contador evento = new Contador();
        //adicionar até 5 eventos
        for(int i=0; i<5; i++) {
            evento.incrementar();
        }
        System.out.println("Essa qtd de eventos:");
        System.out.println(evento.getNum());
        //zerar eventos
        System.out.println("Zerando eventos:");
        evento.zerar();
        System.out.println(evento.getNum());

    }

}
