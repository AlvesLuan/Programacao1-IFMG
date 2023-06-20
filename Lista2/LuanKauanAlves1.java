import java.util.*;
class LuanKauanAlves1 {
	public static void main(String[] args) 
	{
		Scanner Entrada = new Scanner(System.in);
    	double numeroDigitado;
    
   		System.out.printf("Informe seu numero: ");
    	numeroDigitado = Entrada.nextDouble();
    
    	if (numeroDigitado == 0){
    		System.out.printf("Seu numero é ZERO!");
    	}
    	else if (numeroDigitado > 0){
    		System.out.printf("Seu numero é POSITIVO!");
    	}
    	else if (numeroDigitado < 0){
    		System.out.printf("Seu numero é NEGATIVO!");
    	}
	}
}