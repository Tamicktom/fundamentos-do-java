package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();
    pessoa.cpf = "123456789-00";
    pessoa.idade = 18;
    pessoa.nome = "Fulano";

    pessoa.imprimirDados();
  }
}
