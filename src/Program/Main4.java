package Program;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("DIGITE 1 - SIM, QUERO CONTINUAR!");
        System.out.println("DIGITE 2 - NÃO! FAREI ISSO MAIS TARDE!");
        Integer resposta = entrada.nextInt();

        entrada.close();

    }
}
