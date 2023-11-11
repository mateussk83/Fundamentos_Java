package primeirasAulas;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {

  public static void main(String[] args) {
    // Lista
    List<String> nomes = new ArrayList<>();

    nomes.add("Mateus");
    nomes.add("Pedro");
    nomes.add("João");
    nomes.add("Leonardo");

    nomes.forEach(nome -> System.out.println("O nome é " + nome));
  }
}
