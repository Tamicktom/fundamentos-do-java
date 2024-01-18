package conta;

public class ContaBancaria {
  String numero;
  String titular;
  double saldo;

  // depositar
  void depositar(double valor) {
    if (valor > 0) {
      saldo += valor;
    } else {
      System.out.println("Não é possível depositar um valor negativo");
    }
  }

  // sacar
  void sacar(double valor) {
    if (valor > 0) {
      saldo -= valor;
    } else {
      System.out.println("Não é possível sacar um valor negativo");
    }
  }
}
