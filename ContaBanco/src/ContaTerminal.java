import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {

        double saldo= 2538.50;
        
        

        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();


        System.out.println("Por favor, digite o número da agência:");
         String agencia = scanner.next();

         
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.next();

            System.out.println( "Olá" + nomeCliente + " obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta "  +numero +" e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();

    }
}
