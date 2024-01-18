package conta;

public class ContaBancaria {
  private String numero;
  private String titular;
  private double saldo;

  // getters e setters
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    if (numero != null && numero.length() > 0) {
      this.numero = numero;
    } else {
      System.out.println("Número inválido");
    }
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    if (titular != null && titular.length() > 0) {
      this.titular = titular;
    } else {
      System.out.println("Titular inválido");
    }
  }

  public double getSaldo() {
    return saldo;
  }

  // construtor
  public ContaBancaria(String numero, String titular, double saldo) {
    setNumero(numero);
    setTitular(titular);
    this.saldo = saldo;
  }

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
