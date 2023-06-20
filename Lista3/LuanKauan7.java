import java.util.*;
class LuanKauan7 {
	public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        double soma = 0 , max;

        System.out.printf("insira o numero maximo para a divisao: ");
        max = Entrada.nextInt();

        for (double i = 1;i <= max; i++){
            soma += 1/i;
        }
            
        System.out.printf("A div é "+soma+"!");
    }
}