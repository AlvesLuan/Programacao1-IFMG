import java.util.*;
class LuanKauanAlves13 {
  public static void main(String[] args) 
  {
    double anoAtual, quantidadeCopas;

    Scanner Entrada = new Scanner(System.in);

    System.out.printf("\nInforme o ano Atual: ");
    anoAtual = Entrada.nextDouble();
    quantidadeCopas = 0 ;
      
    for (int i = 1930; i <= anoAtual;){
      quantidadeCopas += 1;
      i += 4;                           //a copa ocorre de 4 em 4 anos
    }
    
    quantidadeCopas -= 2;               //-2 pelas 2 edicoes q nao ocorrem por causa da guerra
      
    //versão sem for:
    //quantidadeCopas = ((anoAtual - 1930) / 4) - 2;

    System.out.printf("\nEstamos em %.0f e ja ocorreram %.0f Copas do Mundo!", anoAtual, quantidadeCopas); 
          
  }
}