import java.util.*;
class LuanKauanAlves19 {
  public static void main(String[] args) 
  {
    double numeroPositivo, aoQuadrado, aoCubo, raizQuadrada, raizCubica;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.print("Insira um numero Positivo: ");
    numeroPositivo = Entrada.nextDouble();

    aoQuadrado = Math.pow(numeroPositivo, 2);
    aoCubo = Math.pow(numeroPositivo, 3);
    raizQuadrada = Math.sqrt(numeroPositivo);
    raizCubica = Math.cbrt(numeroPositivo);

    /*  O número digitado elevado ao quadrado;
       O número digitado elevado ao cubo;
       A raiz quadrada do número;
       A raiz cúbica do número.                */
    
    System.out.printf("\n%.2f² = %.2f \n%.2f³ = %.2f \n√%.2f = %.2f \n√³%.2f = %.2f", numeroPositivo, aoQuadrado, numeroPositivo, aoCubo, numeroPositivo, raizQuadrada, numeroPositivo, raizCubica);
  }
}