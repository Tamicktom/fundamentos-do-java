import java.util.Map;
import java.util.HashMap;

public class Collections {
  public static void main(String[] args) {
    Map<String, Integer> notas = new HashMap<>();

    notas.put("João", 1);
    notas.put("Maria", 2);

    notas.forEach((nome, id) -> System.out.println(nome + " " + id));
    
    for(Map.Entry<String, Integer> entry : notas.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    Integer nota = notas.get("João");
    System.out.println(nota);
  }
}
