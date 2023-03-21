import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class App {
  public static void main(String[] args) {
    String[] arr1 = new String[] { "Morango", "Uva", "Acerola", "Manga" };
    String[] arr2 = new String[] { "Pêra", "Caju", "Morango", "Kiwi", "Uva" };
    List<String> result = new ArrayList<>();

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        if (Objects.equals(arr1[i], arr2[j])) {
          result.add(arr1[i]);
        }
      }
    }
    System.out.println(result);
  }
}
