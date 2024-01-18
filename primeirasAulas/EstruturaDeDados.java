package primeirasAulas;
import java.util.List;
import java.util.ArrayList;

public class EstruturaDeDados {
  public static void main(String[] args) {
    // lista
    List<String> nomes = new ArrayList<String>();
    List<List<String>> nomes2 = new ArrayList<List<String>>();

    nomes.add("João");
    nomes.add("Maria");

    nomes2.add(nomes);
    nomes2.add(nomes);

    nomes.forEach(nome -> System.out.println(nome));
    nomes2.forEach(System.out::println);

    for (String nome : nomes) {
      System.out.println(nome);
    }
  }
}
