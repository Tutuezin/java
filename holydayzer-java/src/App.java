import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Holidays holidays = new Holidays();

        Scanner scannerDate = new Scanner(System.in);

        System.out.println("Digite uma data no formato dd/mm/2023 para verificar se existe feriado nesse dia:");

        String date = scannerDate.nextLine();
        System.out.println(holidays.checkHoliday(date));

        Holidays getHolidays = new Holidays();

        getHolidays.getArrHolidays();

    }
}
