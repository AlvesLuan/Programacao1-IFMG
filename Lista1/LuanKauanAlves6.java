import java.util.*;
class LuanKauanAlves6 {
  public static void main(String[] args) 
  {
    double salarioFixo, valorVendas, beneficio, salarioFinal;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.println("Informe seu salario: ");
    salarioFixo = Entrada.nextDouble();
    
    System.out.println("Informe o valor de suas vendas: ");
    valorVendas = Entrada.nextDouble();
    
    beneficio = valorVendas * 0.04; 
    salarioFinal = salarioFixo + beneficio;
          
    System.out.printf("\nSeu salario com a adicao do beneficio de R$%.2f se torna: R$%.2f", beneficio, salarioFinal);
  }
}