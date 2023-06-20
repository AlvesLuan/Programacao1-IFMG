import java.util.*;
class LuanKauanAlves23 {
  public static void main(String[] args) 
  {
    double quemVeAB, quemVeAC, quemVeBC, espectadoresNovelaA, espectadoresNovelaB, espectadoresNovelaC, espectadoresNovelaAB, espectadoresNovelaAC, espectadoresNovelaBC, quemAssisteTodas,  qntdTotalEspecs, telespectadoresInsatisfeito, TotalEspecNovelaA, TotalEspecNovelaB, TotalEspecNovelaC;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.print("informe a quantidade de espectadores da novela A: ");
    espectadoresNovelaA = Entrada.nextDouble();

    System.out.print("informe a quantidade de espectadores da novela B: ");
    espectadoresNovelaB = Entrada.nextDouble();

    System.out.print("informe a quantidade de espectadores da novela C: ");
    espectadoresNovelaC = Entrada.nextDouble();

    System.out.print("informe o total de espectadores que assistem a novela A e B: ");
    espectadoresNovelaAB = Entrada.nextDouble();

    System.out.print("informe o total de espectadores que assistem a novela A e C: ");
    espectadoresNovelaAC = Entrada.nextDouble();

    System.out.print("informe o total de espectadores que assistem a novela B e C: ");
    espectadoresNovelaBC = Entrada.nextDouble();

    System.out.print("informe o total de espectadores que assistem TODAS as novelas: ");
    quemAssisteTodas = Entrada.nextDouble();

    System.out.print("Informe a quantidade TOTAL de espectadores:");
    qntdTotalEspecs = Entrada.nextDouble();

    quemVeAB = espectadoresNovelaAB - quemAssisteTodas;
    quemVeAC = espectadoresNovelaAC - quemAssisteTodas;
    quemVeBC = espectadoresNovelaBC - quemAssisteTodas;
    
    TotalEspecNovelaA = espectadoresNovelaA - quemAssisteTodas - (espectadoresNovelaAC - quemAssisteTodas) - (espectadoresNovelaAB - quemAssisteTodas);
    TotalEspecNovelaB = espectadoresNovelaB - quemAssisteTodas - (espectadoresNovelaAB - quemAssisteTodas) - (espectadoresNovelaBC - quemAssisteTodas);
    TotalEspecNovelaC = espectadoresNovelaC - quemAssisteTodas - (espectadoresNovelaBC - quemAssisteTodas) - (espectadoresNovelaAC - quemAssisteTodas);

    telespectadoresInsatisfeito = qntdTotalEspecs - (TotalEspecNovelaA + TotalEspecNovelaB + TotalEspecNovelaC + quemVeAB + quemVeAC + quemVeBC + quemAssisteTodas);

    System.out.printf("\nA quantidade de espectadores que nao assitem nenhuma é: %.00f espectadores", telespectadoresInsatisfeito );
  }
}