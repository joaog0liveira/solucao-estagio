import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String input = scanner.nextLine();

        String invertedString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            invertedString += input.charAt(i);
        }

        System.out.println("String invertida: " + invertedString);

        scanner.close();
    }
}
