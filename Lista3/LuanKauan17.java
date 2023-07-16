import java.util.*;
class LuanKauan17 {
    public static void main(String[] args) 
	{
        int mdc = 0, numeroA, numeroB, nb, na;

        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Programa M.D.C ");
        System.out.printf("Insira seu A: ");
        numeroA = Entrada.nextInt();
        System.out.printf("Insira seu B: ");
        numeroB = Entrada.nextInt();

        na = numeroA;
        nb = numeroB;
        while (nb != 0) {
            int resto = na % nb;
            na = nb;
            nb = resto;
            mdc = na;
        } 

        System.out.printf("O MDC entre %d e %d é: %d", numeroA, numeroB, mdc);
    }     
}


