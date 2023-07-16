import java.util.*;
class LuanKauan20 {
    public static void main(String[] args) 
	{
        double numeroDigitado, numero, contadorPAR = 0,contadorIMPAR = 0, mediaPAR = 0, somadorPAR = 0, mediaIMPAR = 0, somadorIMPAR = 0;
        double maiornumeroIMPAR = 0, menornumeroIMPAR = 0, maiornumeroPAR = 0, menornumeroPAR = 0;
        Scanner Entrada = new Scanner(System.in);
        
        do{
            System.out.printf("Insira um numero: ");
            numeroDigitado = Entrada.nextDouble();
            if (numeroDigitado < 0){
                break;
            }else if (numeroDigitado % 2 == 0){
            contadorPAR += 1;
            somadorPAR += numeroDigitado;
            mediaPAR = somadorPAR / contadorPAR ;
            }else if (numeroDigitado % 2 == 1){
                contadorIMPAR += 1;
                somadorIMPAR += numeroDigitado;
                mediaIMPAR = somadorIMPAR / contadorIMPAR ;
            }
            double contadorGERAL = 0;
            contadorGERAL ++;
            for (int i = 1;i <= contadorGERAL; i++){
                System.out.printf("Insira o numero "+i+": ");
                numero = Entrada.nextDouble();
                if (i == 1){ 
                    if (numero % 2 == 0){
                        maiornumeroPAR = numero;
                        menornumeroPAR = numero;}
                    else if (numero % 2 == 1){
                        maiornumeroIMPAR = numero;
                        menornumeroIMPAR = numero;} 
                }
                else {
                    if (numero % 2 == 0){
                        if (numero < menornumeroPAR){
                            menornumeroPAR = numero;
                        }else if (numero > maiornumeroPAR){
                            maiornumeroPAR = numero;}
                    } else {
                        if (numero % 2 == 1){
                            if (numero < menornumeroIMPAR){
                                menornumeroIMPAR = numero;
                            }else if (numero > maiornumeroIMPAR){
                                maiornumeroIMPAR = numero;}
                        }
                    }
                }
            }
        } while (numeroDigitado != -1);


        System.out.printf("A media de todos os pares é %.2f \nA media de todos os impares é %.2f", mediaPAR, mediaIMPAR);
        System.out.printf("\nO maior par é %.2f \nO menor par é %.2f", maiornumeroPAR, menornumeroPAR);
        System.out.printf("\nO maior impar é %.2f \nO menor impar é %.2f", maiornumeroIMPAR, menornumeroIMPAR);
    }     
}


