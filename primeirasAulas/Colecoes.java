package primeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
  
  public static void main(String[] args) {
    // Integer = int porém ele n aceita os tipos de dados primitivos como int e etc...
    // o hashMap ele sobre-escreve key do mesmo nome então se tivermos dois João o segundo sobre-escreve o primeiro
    Map<String, Integer> notas = new HashMap<>();
    notas.put("Mateus", 10);   
    notas.put("Pedro", 9);   
    notas.put("João",4);   
    notas.put("Leonardo", 10);   

    for( Map.Entry<String, Integer> entry : notas.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();

      System.out.println("A chave é " + key + "e o valor é " + value);
    }
    var nota = notas.get("João");
    System.out.println(nota);

  }
}
