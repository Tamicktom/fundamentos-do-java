import java.util.Map;
import java.util.HashMap;

public class Collections {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    map.put("João", 1);
    map.put("Maria", 2);

    map.forEach((nome, id) -> System.out.println(nome + " " + id));
    
    for(Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    Integer nota = map.get("João");
    System.out.println(nota);
  }
}
