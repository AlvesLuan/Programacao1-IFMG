import java.util.*;
class LuanKauanAlves11 {
  public static void main(String[] args) 
  {
    double salarioJoao, valorConta1, valorConta2, restoSalario, multa1, multa2;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.print("Informe seu salario: ");
    salarioJoao = Entrada.nextDouble();

    System.out.print("Informe o valor da primeira conta: ");
    valorConta1 = Entrada.nextDouble();

    System.out.print("Informe o valor da segunda conta: ");
    valorConta2 = Entrada.nextDouble();

    multa1 =  valorConta1 * 0.02;
	multa2 =  valorConta1 * 0.02;
	restoSalario = salarioJoao - ((valorConta1 + multa1) + (valorConta2 + multa2)); 
          
    System.out.printf("\nPagando as duas contas sobrará: R$%.2f", restoSalario);
  }
}