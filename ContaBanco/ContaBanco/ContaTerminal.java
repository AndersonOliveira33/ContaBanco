
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception  {
        int numeroConta;
        String numeroAgencia;
        String primeiroNomeCliente;
        String sobrenomeCliente;
        float valorDeposito;
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Por favor, digite o número da Conta: ");
            numeroConta = sc.nextInt();

            System.out.println("Informe o número da Agência: ");
            numeroAgencia = sc.next();

            System.out.println("Informe o primeiro nome do Cliente: ");
            primeiroNomeCliente = sc.next();

            System.out.println("Informe o sobrenome do Cliente: ");
            sobrenomeCliente = sc.next();

            System.out.println("Informe o valor do Deposito: ");
            valorDeposito = sc.nextFloat();
        }

        System.out.println("Ola, " +primeiroNomeCliente+" "+sobrenomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo "+valorDeposito+" já está disponível.");


    }
}
