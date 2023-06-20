import java.util.*;
class LuanKauanAlves12 {
  public static void main(String[] args) 
  {
    double qntdCaminhada, ruaA, ruaB, ruaC, resultadoVoltas, quarteiraoTamanho;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.print("Informe a medida da rua A em metros: ");
    ruaA = Entrada.nextDouble();

    System.out.print("Informe a medida da rua B em metros: ");
    ruaB = Entrada.nextDouble();

    System.out.print("Quanto você deve caminhar? (em km): ");
    qntdCaminhada = Entrada.nextDouble();

    ruaC = Math.sqrt((Math.pow(ruaA, 2) + Math.pow(ruaB, 2)));
    quarteiraoTamanho = (ruaA + ruaB + ruaC) / 1000;
    resultadoVoltas = qntdCaminhada / quarteiraoTamanho;
          
    System.out.printf("\nVocê precisará dar %.2f voltas no quarteirão para atingir sua meta.", resultadoVoltas);
  } 
}