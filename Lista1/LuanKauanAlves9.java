import java.util.*;
class LuanKauanAlves9 {
  public static void main(String[] args) 
  {
    double ladosPoligono, numeroDiagonais;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.println("Informe o numero de lados do seu poligono: ");
    ladosPoligono = Entrada.nextDouble();
    
    numeroDiagonais = ladosPoligono * (ladosPoligono - 3) / 2;    
          
    System.out.printf("\nO numero de Diagonais do seu poligono é: %.2f", numeroDiagonais);
  }
}