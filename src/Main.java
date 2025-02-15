import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner infosConta = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência!");
        String agencia  = infosConta.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        int conta = infosConta.nextInt();
        infosConta.nextLine();

        System.out.println("Por favor, digite o seu nome!");
        String nome = infosConta.nextLine();

        System.out.println("Por favor, digite o saldo inicial!");
        Double saldoInicial = infosConta.nextDouble();
        infosConta.nextLine();

        infosConta.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +
         ", conta" + conta + " e seu saldo " + saldoInicial + " já está disponível");

    }
}

