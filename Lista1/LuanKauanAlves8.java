import java.util.*;
class LuanKauanAlves8 {
  public static void main(String[] args) 
  {
    double baseMenor, baseMaior, altura, areaTotal, valorPagoMquadrado, valorMedioVenda;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.println("Informe a base Menor: ");
    baseMenor = Entrada.nextDouble();
    
    System.out.println("Informe a base Maior: ");
    baseMaior = Entrada.nextDouble();
    
    System.out.println("Informe a altura: ");
    altura = Entrada.nextDouble();
    
    System.out.println("Informe o valor pago por metro quadrado: ");
    valorPagoMquadrado = Entrada.nextDouble();
    
    areaTotal = ((baseMaior + baseMenor) * altura) / 2;
    valorMedioVenda = areaTotal * valorPagoMquadrado;
    
          
    System.out.printf("\nA area total do seu terreno é:%.2f\nO valor medio de venda é:%.2f", areaTotal, valorMedioVenda);
  }
}