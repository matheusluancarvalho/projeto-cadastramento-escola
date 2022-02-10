package Program;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo, Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Bem vindo " + nome + " deseja continuar?");
        System.out.println("1 - Sim, 2 - Não");
        Integer entrada = sc.nextInt();

        while (entrada > 1){
            System.out.println("Vamos continuar");
            entrada = sc.nextInt();
        }
        System.out.println("Até a próxima " + nome);

        sc.close();
    }
}
