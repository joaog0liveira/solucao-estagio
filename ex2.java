import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        try {
            System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
            numero = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Erro! Insira um valor inteiro válido.");
            scanner.close();
            return;
        }

        int fib1 = 0;
        int fib2 = 1;
        boolean pertence = false;

        while (fib2 <= numero) {
            if (numero == fib1 || numero == fib2) {
                pertence = true;
                break;
            }

            int proximo = fib1 + fib2;

            fib1 = fib2;
            fib2 = proximo;
        }

        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
