import java.util.*;
class LuanKauanAlves15 {
  public static void main(String[] args) 
  {
    double raio, area;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.print("informe o raio da sua circuferencia: ");
    raio = Entrada.nextDouble();

    area = 3.14 * (raio*raio); 
          
    System.out.printf("\nA area da sua circuferencia é %.2fcm²", area);
  }
}