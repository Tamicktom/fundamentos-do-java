package pessoa;

public class Professor extends Pessoa {
  private double salario;

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public Professor(String nome, int idade, String cpf, double salario) {
    super(nome, idade, cpf);
    this.salario = salario;
  }
}
