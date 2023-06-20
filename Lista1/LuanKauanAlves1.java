import java.util.*;
class LuanKauanAlves1 {
  public static void main(String[] args) 
  {
    double nota1, nota2, nota3, media;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.println("Informe sua primeira nota: ");
    nota1 = Entrada.nextDouble();
    
    System.out.println("Informe sua segunda nota: ");
    nota2 = Entrada.nextDouble();
    
    System.out.println("Informe sua terceira nota: ");
    nota3 = Entrada.nextDouble();

    media = (nota1 + nota2+ nota3) / 3;

    System.out.printf("\nSua média é %.2f ", media);
  }
}