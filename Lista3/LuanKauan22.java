import java.util.*;
class LuanKauan22 {
    public static void main(String[] args) 
	{
        int anoAtual = 2015;
        double popA = 500000, popB = 700000;

        do{
            popA = popA + (popA * 0.03) ;
            popB = popB + (popB * 0.02) ;

            anoAtual ++;

        }while (popB > popA);

        System.out.printf("Em %d a população da cidade A terá %.2f habitantes e a cidade B terá %.2f ",anoAtual, popA, popB);
    }     
}


