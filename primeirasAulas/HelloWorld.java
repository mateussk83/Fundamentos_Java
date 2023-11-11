package primeirasAulas;

/*
 * HelloWorld = nome da minha classe
 * public = Tipo de acesso da classe
 * class = tipo da classe
 */
public class HelloWorld {
    public static void main(String[] args) {
     
      /*
       * Numeros (int, double, float, long)
       * Texto (String) unico maiusculo
       * Boleano (boolean)
       */ 
      int dadoDoTipoInt = 12;
      double dadoDoTipoDouble = 3.14;  //double valores mto especificos é melhor 
      float dadoDoTipoFloat = 3.14f;   //float colocar f no final
      long dadoDoTipoLong = 101298312098571350L; // int porém com muitos MUITOS numeros e colocar L no final
      String dadosDoTipoString = "Colocar o meu texto";
      boolean dadoDoTipoBoolean = true;

      // if - else
      // if (dadoDoTipoInt == 10) {
      //   //sysout
      //   System.out.println("Entrou no if");
      // } else if( dadoDoTipoInt == 12) {
      //   //sysout
      //   //sysout
      //   System.out.println("Entrou no if do 12");
      // } 
      // else {
      //   System.out.println("Entrou no else");
      // }

      // While (Enquanto algo for verdadeiro, faça alguma coisa)
      // int valorInicial = 0;
      // while (valorInicial < 3) {
      //   System.out.println("O valor inicial é menor que 3");
      //   System.out.println(valorInicial);
      //   valorInicial++;
      // }

      // For 
      for(int i = 0; i < 4; i++) {
        System.out.println("O valor do i é " + i);
      }
    }
  //Todo conteúdo deverá ser indesrido aqui dentro
 }