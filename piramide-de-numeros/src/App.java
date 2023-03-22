import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scannerNum1 = new Scanner(System.in);
        Scanner scannerNum2 = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scannerNum1.nextInt();


        System.out.println("Digite o segundo número: ");
        int num2 = scannerNum2.nextInt();

        System.out.println("\n" + "Produzindo pirâmide..." + "\n");

        for (int i = num1; i <= num2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }

    }
}
