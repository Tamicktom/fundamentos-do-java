package excecoes;

public class Excecoes {
  public static void main(String[] args) throws Exception {
    try {
      validarNumero();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }

  public static void validarNumero() throws Exception {
    int numero = 10;
    if (numero > 5) {
      throw new Exception("Número maior que 5");
    }
  }
}
