import java.util.*;
class LuanKauan10 {
	public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        double numero = 0; 
        double soma = 0, max, media, maiornumero = 0, menornumero = 0;

        System.out.printf("Vai inserir quantos numero? ");
        max = Entrada.nextInt();

        for (int i = 1;i <= max; i++){
            System.out.printf("Insira o numero "+i+": ");
            numero = Entrada.nextDouble();
            if (i == 1){ 
                menornumero = numero;} 
            else {
                if (numero < menornumero){
                    menornumero = numero;
                }else{
                    maiornumero = numero;}
            }
        }
        System.out.printf("\nO maior é: %.2f \nO menor é: %.2f ", maiornumero, menornumero);
    }
}