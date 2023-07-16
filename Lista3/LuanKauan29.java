import java.util.*;
class LuanKauan29 {
    public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        int numeroDendo, numeroSor, contador = 0;

        System.out.printf("Insira seu DIVIDENDO: ");
        numeroDendo = Entrada.nextInt();
        System.out.printf("Insira seu DIVISOR: ");
        numeroSor = Entrada.nextInt();

        do{
            numeroDendo -= numeroSor;
            contador += 1;
        }while (numeroDendo >= numeroSor);
        
        System.out.printf("\nSEU QUOCIENTE É %d \nSEU RESTO É %d ",contador, numeroDendo);
        
        
    }     
}
