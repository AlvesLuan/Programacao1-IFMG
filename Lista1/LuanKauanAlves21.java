import java.util.*;
class LuanKauanAlves21 {
  public static void main(String[] args) 
  {
    double angulo, alturaParede, medidaEscada, rad;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.print("Insira o angulo: ");
    angulo = Entrada.nextDouble();

    System.out.print("Insira a altura da sua Parede: ");
    alturaParede = Entrada.nextDouble();

    rad = (angulo * Math.PI) / 180;
    medidaEscada = alturaParede / Math.sin(rad);

    
    System.out.printf("\nA medida da sua escada é %.2f", medidaEscada);
  }
}