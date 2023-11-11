package pessoa;

public class TesteDePessoa {
  
  public static void main(String[] args) {
    Aluno aluno = new Aluno();
    aluno.setCpf("33322211");
    aluno.setNome("Mateus");
    aluno.setIdade(21);
    aluno.setMatricula("abc");

    System.out.println(aluno.imprimirDadosDaPessoa());
    Professor professor = new Professor();
    professor.setCpf("33322211123");
    professor.setNome("João");
    professor.setIdade(20);
    professor.setSalario(3000);

    
    System.out.println(professor.imprimirDadosDaPessoa());
  }
}
