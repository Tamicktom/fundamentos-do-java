package pessoa;

public class Aluno extends Pessoa {
  private String matricula;

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public Aluno(String nome, int idade, String cpf, String matricula) {
    super(nome, idade, cpf);
    this.matricula = matricula;
  }
}
