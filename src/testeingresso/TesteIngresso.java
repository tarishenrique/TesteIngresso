package testeingresso;

import java.util.Scanner;

public class TesteIngresso {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao1;
        int opcao2;

        System.out.println("Escolha o seu ingresso: \n1 - Ingresso Normal \n2 - Ingresso VIP");
        opcao1 = entrada.nextInt();

        if (opcao1 == 1) {

            Normal n1 = new Normal();
            n1.setValor(50);

            n1.imprimeNormal();
        } else if (opcao1 == 2) {

            VIP vip1 = new VIP();
            vip1.setValor(50);
            vip1.setValorAdicional(20);

            System.out.println("Escolha seu VIP: \n1 - Camarote Superior \n2 - Camarote Inferior");
            opcao2 = entrada.nextInt();

            if (opcao2 == 1) {

                CamaroteSuperior ci = new CamaroteSuperior();
                ci.setValor(50);
                ci.setValorAdicional(20);
                System.out.println(ci.imprimeCamaroteSuperior());

            } else if (opcao2 == 2) {

                CamaroteInferior ci = new CamaroteInferior();
                ci.setValor(50);
                ci.setLocalizacao("Lateral do Palco");
                ci.imprimeLocalizacao();

            } else {
                System.out.println("Opção Inválida");
            }

        } else {
            System.out.println("Opção Inválida");
        }

    }

}
