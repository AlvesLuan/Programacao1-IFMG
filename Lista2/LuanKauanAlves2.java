import java.util.*;
class LuanKauanAlves2{
	public static void main(String[] args) {

    	Scanner Entrada = new Scanner(System.in);
    	int seuNumero, identificador;

    	System.out.printf("Informe seu numero: ");
    	seuNumero = Entrada.nextInt();

    	identificador = seuNumero%2;
    
    	if (identificador == 0){
      		System.out.printf("Seu numero %d é par!", seuNumero);
    	}
    	else{
    	  	System.out.printf("Seu numero %d é impar!", seuNumero);
    	}
  	}
}