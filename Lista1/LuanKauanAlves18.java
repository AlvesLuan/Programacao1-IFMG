import java.util.*;
class LuanKauanAlves18 {
  public static void main(String[] args) 
  {
    double salarioMinimo, gastoQuilowatts, valorAserPago, valorComDesconto, valorUnidadeQuilowatt;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.print("Insira o valor do Salario Minimo: ");
    salarioMinimo = Entrada.nextDouble();
    
    System.out.print("Qual a quantidade de quilowatts gasta pela sua residencia? ");
    gastoQuilowatts = Entrada.nextDouble();

    valorUnidadeQuilowatt = salarioMinimo * 0.20;
    valorAserPago = gastoQuilowatts * valorUnidadeQuilowatt;
    valorComDesconto = valorAserPago - (valorAserPago * 0.15);
    
    System.out.printf("\nO valor pela unidade de Quilowatt é R$%.2f. \nVocê deveria pagar R$%.2f mas com desconto pode pagar R$%.2f", valorUnidadeQuilowatt, valorAserPago, valorComDesconto);
  }
}