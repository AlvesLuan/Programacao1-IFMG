import java.util.*;
class LuanKauan15 {
    public static void main(String[] args) 
	{
        int numero,
        fibonacci = 1,
        fibonacciAntes = 0,
        fibonacciGuardador;

        Scanner Entrada = new Scanner(System.in);
        System.out.printf("Insira o numero: ");
        numero = Entrada.nextInt();

        System.out.println("Os "+numero+" primeiros numeros de fibonacci são: ");
        for (int i = 1; i <= numero; i++) {
            System.out.printf(fibonacci+", ");
            fibonacciGuardador = fibonacci;
            fibonacci = fibonacci + fibonacciAntes;
            fibonacciAntes = fibonacciGuardador;
        }
        
    }
}

