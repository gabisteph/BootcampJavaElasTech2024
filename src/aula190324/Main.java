package aula190324;

import java.util.Scanner;

public class Main {


    public static void mensagemInicial(){
        System.out.println("Bem vindo ao Sistema!");
    }
    public static void mensagemUsuario(String nome){
        System.out.println("Bem vindo "+nome);
    }
    public static int somar(int numero1, int numero2){
        return numero1+numero2;
    }
    public static void verificarParImpar(int numero){
        if(numero%2==0){
            System.out.println("Número par");
        }else {
            System.out.println("Número ímpar");
        }
    }

    public static void verificarParImparComNome(int numero, String nome) {
        if(numero%2==0){
            System.out.println("O número é par e seu nome é"+nome);
        }else {
            System.out.println("O número é ímpar e seu nome é "+nome);
        }
    }
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        mensagemInicial();
        mensagemUsuario("Gabrielle");
        System.out.println(somar(10,15));
        int n1 = 5, n2=9;
        System.out.println(somar(n1,n2));
        System.out.println("Digite um número: ");
        int numero= leitura.nextInt();
        verificarParImpar(numero);
        verificarParImparComNome(numero,"Gabrielle");

    }
}
