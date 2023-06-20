import java.util.*;
class LuanKauanAlves2 {
  public static void main(String[] args) 
  {
    int numero, sucessor, antecessor;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.println("Informe seu numero: ");
    numero = Entrada.nextInt();
    
    sucessor = numero + 1;
    antecessor = numero - 1;

    System.out.printf("\nSeu sucessor é %d e seu antecessor é %d", sucessor, antecessor);
  }
}