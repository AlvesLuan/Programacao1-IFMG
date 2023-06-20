import java.util.*;
class LuanKauanAlves7 {
  public static void main(String[] args) 
  {
    double area, perimetro, altura, largura;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.println("Informe a altura do reu retangulo: ");
    altura = Entrada.nextDouble();
    
    System.out.println("Informe a largura do seu retangulo: ");
    largura = Entrada.nextDouble();
    
    perimetro = (altura * 2) + (largura * 2); 
    area = altura * largura;
          
    System.out.printf("\nA area do seu retangulo é:%.2f\nO perimetro do seu retangulo:%.2f", area, perimetro);
  }
}