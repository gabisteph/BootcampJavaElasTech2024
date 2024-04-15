package lastexePOO.continente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exemplo de uso da classe Continente
        Continente america = new Continente("América");

        // Add países
        america.adicionarPais(new Pais("Brasil", 8510000, 211000000));
        america.adicionarPais(new Pais("Chile", 756626, 19600000));
        america.adicionarPais(new Pais("Argentina", 2780000,  40276376));


        System.out.println("Dimensão total do continente "+america.getNome()+ ": "+ america.dimensaoTotal() + " km²");
        System.out.println("População total do continente"+america.getNome()+ ": " + america.populacaoTotal() + " habitantes");
        System.out.println("Densidade populacional do continente "+america.getNome()+ ": " + america.densidadePopulacional() + " hab/km²");
        System.out.println("País com maior população na "+america.getNome()+ ": " + america.paisComMaiorPopulacao().getNome());
        System.out.println("País com menor população na "+america.getNome()+ ": " + america.paisComMenorPopulacao().getNome());
        System.out.println("País de maior dimensão na América "+america.getNome()+ ": " + america.paisMaiorDimensao().getNome());
        System.out.println("País de menor dimensão na América "+america.getNome()+ ": "+ america.paisMenorDimensao().getNome());
        System.out.println("Razão territorial do maior país em relação ao menor país: " + america.razaoTerritorial());


    }
}
