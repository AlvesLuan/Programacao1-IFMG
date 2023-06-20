import java.util.*;
class LuanKauanAlves5 {
  public static void main(String[] args) 
  {
    double salarioBase, gratificacao, imposto, salarioFinal;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.println("Informe seu salario: ");
    salarioBase = Entrada.nextDouble();
    
    gratificacao = (salarioBase * 0.1);
    imposto = (salarioBase + gratificacao) * 0.05;
    salarioFinal = (salarioBase + gratificacao) - imposto;
       
    System.out.printf("\nSeu salario final é R$%.2f", salarioFinal);
  }
}