import java.util.*;
class LuanKauanAlves3 {
  public static void main(String[] args) 
  {
    double resultado, numeroR1, numeroR2, numeroR3;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.println("Informe seu numero real 1: ");
    numeroR1 = Entrada.nextDouble();
    
    System.out.println("Informe seu numero real 2: ");
    numeroR2 = Entrada.nextDouble();
    
    System.out.println("Informe seu numero real 3: ");
    numeroR3 = Entrada.nextDouble();
    
    resultado = (numeroR1 * numeroR2) / numeroR3;
    System.out.printf("\nSei resultado é %.2f", resultado);
    
  }
}