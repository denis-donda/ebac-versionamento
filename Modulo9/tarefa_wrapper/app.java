package Modulo9.tarefa_wrapper;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        String nome;
        int idade;
        Integer idadeWrapper;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        nome = leitor.next();

        System.out.println("Bom dia " + nome + ", qual é a sua idade?");
        idade = leitor.nextInt();

        System.out.println("Sua idade no tipo Primitivo: " + idade);

        idadeWrapper = idade;

        System.out.println("Sua idade no tipo Wrapper: " + idadeWrapper);
    }
}
