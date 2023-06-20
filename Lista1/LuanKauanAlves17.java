import java.util.*;
class LuanKauanAlves17 {
  public static void main(String[] args) 
  {
    double numeroReal, parteFracionaria;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.print("Insira seu numero real: ");
    numeroReal = Entrada.nextDouble();

    parteFracionaria = numeroReal - ((int)numeroReal);

    System.out.printf("\nA parte inteira do seu numero é %.0f e a parte fracionaria é %.2f.", numeroReal,  parteFracionaria);
  }    
}