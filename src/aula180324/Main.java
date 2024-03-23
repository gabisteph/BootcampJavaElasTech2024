package aula180324;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaTarefas = new ArrayList<>();
        String tarefa = "vazia";
        Scanner leitura = new Scanner(System.in);
        while (!tarefa.equalsIgnoreCase("sair")) {
            System.out.println("1- Criar lista de tarefa");
            System.out.println("2- Adicionar mais tarefas a lista");
            System.out.println("3- remover tarefa");
            System.out.println("4- Exibir todas as tarefas na lista");
            System.out.println("0- Sair do sistema");
            int option = leitura.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Digite atividade a fazer");
                    System.out.println("Digite 'menu' para voltar ao menu principal");
                    while (true) {
                        tarefa = leitura.nextLine();
                        if (tarefa.equalsIgnoreCase("menu")) {
                            break;
                        }
                        listaTarefas.add(tarefa);
                    }
                    break;
                case 2:
                    System.out.println("Digite mais atividades: ");
                    System.out.println("Digite 'menu' para voltar ao menu principal");
                    while (true) {
                        tarefa = leitura.nextLine();
                        if (tarefa.equals("menu")) {
                            break;
                        }
                        listaTarefas.add(tarefa);
                    }
                    break;
                case 3:
                    System.out.println("Qual tarefa deseja remover?");
                    System.out.println("Digite 'menu' para voltar ao menu principal");
                    leitura.nextLine();
                    tarefa = leitura.nextLine();
                    if (tarefa.equals("menu")) {
                        break;
                    }
                    listaTarefas.remove(tarefa);
                    break;
                case 4:
                    System.out.println("Lista de tarefas: "+listaTarefas);
                    break;
                default:
                    tarefa = "sair";
                    break;

            }
        }



    }
}
