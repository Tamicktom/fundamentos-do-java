package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Professor professor = new Professor("João", 30, "123.456.789-00", 1000.0);
    Aluno aluno = new Aluno("Maria", 20, "987.654.321-00", "20190001");

    professor.imprimirDados();
    System.out.println("Salário: " + professor.getSalario());

    aluno.imprimirDados();
    System.out.println("Matrícula: " + aluno.getMatricula());
  }
}
