import java.util.*;
class LuanKauanAlves4 {
  public static void main(String[] args) 
  {
    double mediaPonderada, nota1, peso1, nota2, peso2, nota3, peso3;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.println("Informe sua nota 1: ");
    nota1 = Entrada.nextDouble();
    System.out.println("Informe o peso da nota 1: ");
    peso1 = Entrada.nextDouble();
    
    System.out.println("Informe sua nota 2: ");
    nota2 = Entrada.nextDouble();
    System.out.println("Informe o peso da nota 2: ");
    peso2 = Entrada.nextDouble();
    
    System.out.println("Informe sua nota 3: ");
    nota3 = Entrada.nextDouble();
    System.out.println("Informe o peso da nota 3: ");
    peso3 = Entrada.nextDouble();
    
    mediaPonderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

    System.out.printf("\nSua media ponderada é %.2f", mediaPonderada);
  }
}