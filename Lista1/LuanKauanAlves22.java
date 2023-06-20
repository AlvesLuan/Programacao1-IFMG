import java.util.*;
class LuanKauanAlves22 {
  public static void main(String[] args) 
  {
    String a, b, newA, newB;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.print("informe sua variavel A? ");
    a = Entrada.nextLine();

    System.out.print("informe sua variavel b? ");
    b = Entrada.nextLine();

    newA = b;  
    newB = a;

    System.out.printf("\nCom a inversao suas variaveis ficaram assim:\nA = %s\nB = newB", newA, newB );
  }
}