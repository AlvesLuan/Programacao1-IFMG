import java.util.*;
class LuanKauan6 {
	public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        int soma = 0 , max;

        System.out.printf("insira o numero maximo para o somatorio: ");
        max = Entrada.nextInt();

        for (int i = 1;i <= max; i++){
            soma += i;}
            
        System.out.printf("A soma é "+soma+"!");
    }
}