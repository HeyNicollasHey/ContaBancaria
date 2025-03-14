import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int numero = input.nextInt();

        System.out.println("Digite o numero da agencia: ");
        String agencia = input.next();

        System.out.println("Digite o nome do cliente: ");
        String cliente = input.next();

        System.out.println("Digite o saldo da conta: ");
        BigDecimal saldo = input.nextBigDecimal();

        System.out.println("Numero da conta: " + numero + "\nAgencia: " + agencia + "\nCliente: " + cliente + "\nSaldo: " + saldo);
    }
}
