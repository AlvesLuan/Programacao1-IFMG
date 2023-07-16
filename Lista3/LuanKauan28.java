import java.util.*;
class LuanKauan28 {
    public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        int numero, result;

        System.out.printf("Digite o numero: ");
        numero = Entrada.nextInt();
        System.out.printf("\n####################");
        System.out.printf("\nTABUADA DO %d: \n", numero);
        System.out.printf("#################### \n");
        for(int i = 1; i <= 10; i++){
                result = numero * i;
                System.out.printf("%d x %d = %d\n", numero ,i, result);
        }
        System.out.printf("#################### \n");
    }     
}
