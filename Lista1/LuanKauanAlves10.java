import java.util.*;
class LuanKauanAlves10 {
  public static void main(String[] args) 
  {
    double montante, capital;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.print("Informe seu capital: ");
    capital = Entrada.nextDouble();

    montante = capital * Math.pow(1.05,24);    
          
    System.out.printf("\nEm 2 anos você terá R$%.2f", montante);
  }
}