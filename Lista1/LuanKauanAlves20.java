import java.util.*;
class LuanKauanAlves20 {
  public static void main(String[] args) 
  {
    double numeroHorasTrabalhadas, salarioMinimo, horasExtrasTrabalhada, valorHrTrabalhada,
    valorHorasExtras, salarioBruto, extrasAReceber, salarioCompleto;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.print("Insira o valor do salario minimo: ");
    salarioMinimo = Entrada.nextDouble();

    System.out.print("Insira suas horas trabalhadas: ");
    numeroHorasTrabalhadas = Entrada.nextDouble();

    System.out.print("Insira suas horas EXTRAS trabalhadas: ");
    horasExtrasTrabalhada = Entrada.nextDouble();

    valorHrTrabalhada = salarioMinimo * 0.125;
    valorHorasExtras = (salarioMinimo * 0.25) * horasExtrasTrabalhada;
    salarioBruto = numeroHorasTrabalhadas * valorHrTrabalhada;
    extrasAReceber = horasExtrasTrabalhada * valorHorasExtras;
    salarioCompleto = salarioBruto + extrasAReceber;
    
    System.out.printf("\nVocê deverá receber o salário de R$%.2f", salarioCompleto);
  }
}