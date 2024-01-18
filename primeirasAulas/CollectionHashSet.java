package primeirasAulas;
import java.util.HashSet;

public class CollectionHashSet {
  public static void main(String[] args){
    HashSet<Integer> numbers = new HashSet<Integer>();

    numbers.add(1);
    numbers.add(2);
    numbers.add(3);

    for (int i : numbers) {
      System.out.println(i);
    }
  }
}
