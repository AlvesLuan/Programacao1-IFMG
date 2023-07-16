import java.util.*;
class LuanKauan32 {
    public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        long num = 1, soma = 0;
        int contador = 0;

        System.out.printf("Esses são os 5 primeiros numeros perfeitos: ");

        do{
            for(int i = 1; 1 < num; i++){
                if(num % i == 0){
                    soma += i;
                }
            }
            if(soma == num){
                System.out.printf("%d, ", num);
                contador ++;}
            num ++;
            soma = 0;
        }while (contador <= 5);
    }
}
   