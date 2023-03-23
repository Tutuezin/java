import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String[] ArrFruits1 = { "Morango", "Uva", "Acerola", "Manga" };
        String[] ArrFruits2 = { "Pêra", "Caju", "Morango", "Acerola" };

        List<String> duplicatedFruits = new ArrayList<>();

        for (int i = 0; i < ArrFruits1.length; i++) {
            for (int j = 0; j < ArrFruits2.length; j++) {
                if (ArrFruits1[i].equals(ArrFruits2[j])) {
                    duplicatedFruits.add(ArrFruits1[i]);
                }
            }
        }
       
        System.out.println(duplicatedFruits);
    }
}
