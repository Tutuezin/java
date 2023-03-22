import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scannerValue = new Scanner(System.in);
        Scanner scannerSize = new Scanner(System.in);

        System.out.println("Qual número você deseja multiplicar?");
        int value = scannerValue.nextInt();

        System.out.println("Quantas vezes você deseja multiplicar esse número?");
        int size = scannerSize.nextInt();

        System.out.println("\n" + "Número " + value + " multiplicado " + size + " vezes." + "\n");

        for (int i = 0; i <= size; i++) {

            int result = i * value;

            System.out.println(value + "x" + i + "=" + result);
           
        }
        
    }
}
