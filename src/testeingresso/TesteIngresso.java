package testeingresso;

import java.util.Scanner;

public class TesteIngresso {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao1;
        int opcao2;

        Ingresso ing1 = new Ingresso();
        ing1.setValor(350);

        System.out.println("Escolha o tipo de ingresso: \n1 - Ingresso Normal \n2 - Ingresso VIP");

        opcao1 = entrada.nextInt();

    }

}
