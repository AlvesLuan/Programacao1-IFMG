import java.util.*;
class LuanKauan8 {
	public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        double soma = 0 , max;

        System.out.printf("insira o numero maximo para a divisao: ");
        max = Entrada.nextInt();

        for (double i = 1;i <= max; i++){
            if (i%2 == 0){
                soma -= 1/i;
            } else {
                soma += 1/i;
            }
        }
            
        System.out.printf("A div é "+soma+"!");
    }
}