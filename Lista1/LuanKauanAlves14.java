import java.util.*;
class LuanKauanAlves14 {
  public static void main(String[] args) 
  {
    double larguraComodoEmMetros, comprimentoComodoEmMetros, areaComodoMetro, potenciaParaIluminar;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.print("informe a largura do comodo em Metros: ");
    larguraComodoEmMetros = Entrada.nextDouble();

    System.out.print("informe o comprimento do comodo em Metros: ");
    comprimentoComodoEmMetros = Entrada.nextDouble();

    areaComodoMetro = larguraComodoEmMetros * comprimentoComodoEmMetros;
	potenciaParaIluminar = areaComodoMetro * 18; 
          
    System.out.printf("\nA area do comodo é %.2fm², para iluminar você precisará de %.2fW", areaComodoMetro, potenciaParaIluminar);
  }
}