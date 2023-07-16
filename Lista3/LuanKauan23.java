import java.util.*;
class LuanKauan23 {
    public static void main(String[] args) 
	{
        double locA = 0, locB = 400000, encontro = 0;
        int tempo = 0;

        do{
            tempo++;
            locA = locA + 30;
            locB = locB - 40;
            System.out.println("ANDANDO &");
            
         
        }while (locB >= locA);
        encontro = locA;

        tempo = tempo/60;

        System.out.printf("A locomotiva A andará %.3f \ne a locomotiva B andará %.3f",locA, locB );
        System.out.printf("\nNo minuto %d", tempo);
        
        
    }     
}
