import java.util.*;
class LuanKauan19 {
    public static void main(String[] args) 
	{
        double numeroDigitado, numero, contador = 0, media = 0, somador = 0;

        Scanner Entrada = new Scanner(System.in);
        
        do{
            System.out.printf("Insira um numero: ");
            numeroDigitado = Entrada.nextDouble();
            if (numeroDigitado == -1){
                break;
            }else{
            contador += 1;
            somador += numeroDigitado;
            media = somador / contador ;
            }
        } while (numeroDigitado != -1);

        System.out.printf("A media de todos esses numeros é %.2f ", media);
    }     
}


