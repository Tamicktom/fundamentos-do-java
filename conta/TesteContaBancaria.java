package conta;

public class TesteContaBancaria {
  public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria();
    conta.numero = "123456";
    conta.titular = "Fulano";
    conta.saldo = 1000.0;

    conta.depositar(100.0);
    conta.sacar(200.0);

    System.out.println("Saldo: " + conta.saldo);
  }
}
