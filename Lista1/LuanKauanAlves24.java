import java.util.*;
class LuanKauanAlves24 {
  public static void main(String[] args) 
  {
    Double a, b, c, delta, formulaRaiz1, formulaRaiz2;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.print("informe sua variavel A: ");
    a = Entrada.nextDouble();

    System.out.print("informe sua variavel b: ");
    b = Entrada.nextDouble();

    System.out.print("informe sua variavel c: ");
    c = Entrada.nextDouble();

    /* b² -4ac */
    delta = (Math.pow(b, 2)) - 4 * a * c;  

    if (delta >= 0) {
        formulaRaiz1 = ((-(b) + Math.sqrt(delta)) / (2 * a) );
        formulaRaiz2 = ((-(b) - Math.sqrt(delta)) / (2 * a) );

        System.out.println("\n"+(-(b))+" + "+Math.sqrt(delta)+" / "+2 * a+" = "+ formulaRaiz1);
        System.out.printf("X¹ = %.2f\n",formulaRaiz1);
        System.out.println("\n"+(-(b))+" - "+Math.sqrt(delta)+" / "+2 * a+" = "+ formulaRaiz2);
        System.out.printf("X² = %.2f",formulaRaiz2);

        
    } else {
        System.out.println("SEU DELTA NAO TEM RAIZ!!!");
    }

    
  }
}
