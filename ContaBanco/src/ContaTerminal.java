

import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        float valorMinimo = 0.0f;
        float valorMaximo = 1000.0f;

        int numero;
        String agencia;
        String nomeCliente;
        //Saldo é gerado de forma aleatória com pacote Random
        float saldo = valorMinimo + random.nextFloat() * (valorMaximo - valorMinimo);

        System.out.println("Olá, Sempre após informar um campo, pressione enter para informar o próximo !\n");

        System.out.println("Por favor, Informe seu nome !");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, Digite o número da Agência !");
        agencia = sc.next();

        System.out.println("Por favor, Digite o número da Conta !");
        numero = sc.nextInt();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo é R$ %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);

        sc.close();

    }
}
