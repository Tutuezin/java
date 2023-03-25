import java.util.ArrayList;

public class Holidays implements IHoliday {

  ArrayList<Holiday> arrHolidays = new ArrayList<>();

  public Holidays() {
    arrHolidays.add(new Holiday("01/01/2023", "Confraternização mundial"));
    arrHolidays.add(new Holiday("21/02/2023", "Carnaval"));
    arrHolidays.add(new Holiday("17/04/2023", "Páscoa"));
    arrHolidays.add(new Holiday("21/04/2023", "Tiradentes"));
    arrHolidays.add(new Holiday("01/05/2023", "Dia do trabalho"));
    arrHolidays.add(new Holiday("08/06/2023", "Corpus Christi"));
    arrHolidays.add(new Holiday("07/09/2023", "Independência do Brasil"));
    arrHolidays.add(new Holiday("12/10/2023", "Nossa Senhora Aparecida"));
    arrHolidays.add(new Holiday("02/11/2023", "Finados"));
    arrHolidays.add(new Holiday("15/11/2023", "Proclamação da República"));
    arrHolidays.add(new Holiday("25/12/2023", "Natal"));

  }

  public void getArrHolidays() {
    System.out.println("\nLista de feriados no ano: ");

    for (int i = 0; i < arrHolidays.size(); i++) {
      System.out.println(arrHolidays.get(i).getDate() + " => " + arrHolidays.get(i).getName());
    }
  }

  public String checkHoliday(String date) {
    String isHoliday = "\nO dia " + date + " não é um feriado.";

    for (int i = 0; i < arrHolidays.size(); i++) {
      if (arrHolidays.get(i).getDate().equals(date)) {
        isHoliday = "\nO dia " + date + " é feriado de " + arrHolidays.get(i).getName();
        break;
      }
    }

    return isHoliday;

  }

}
