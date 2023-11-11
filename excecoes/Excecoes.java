package excecoes;

import pessoa.Pessoa;

public class Excecoes {

  public static void main(String[] args) throws Exception {
  //   try {
  //     validarNumero();
  //   }
  //   catch(Exception e) {
  //     System.out.println("Deu ruim");
  //     e.printStackTrace();
  //   }
    Pessoa p = null;
    p.getCpf();
}


  // static quer dizer que n precisamos iniciar o metodo para usa-lo simplismente chamamos  
  public static void validarNumero() throws Exception {
    int numero = 10;
    if(numero < 100) {
      throw new Exception("O número é menor que 100");
    }
  }
  
}
