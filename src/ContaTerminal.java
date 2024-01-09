
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("Insira seu Número:");
        Scanner numeroScanner = new Scanner(System.in);
        int numero = numeroScanner.nextInt();

        System.out.println("Insira sua Agência:");
        Scanner agenciaScanner = new Scanner(System.in);
        String agencia = agenciaScanner.nextLine();

        System.out.println("Insira seu Nome:");
        Scanner nomeScanner = new Scanner(System.in);
        String nome = nomeScanner.nextLine();

        System.out.println("Insira seu saldo:");
        Scanner saldoScanner = new Scanner(System.in);
        double saldo = saldoScanner.nextDouble();

        System.err.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque ");

        
    }
}
