import java.util.*;
class LuanKauan6 {
    public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        int maxNumber, contador1 = 0, contador2 = 0;

        /* Define o maximo */
        System.out.printf("\nVai inserir quantos numeros? ");
        maxNumber = Entrada.nextInt();
        int numbers[] = new int[maxNumber];
        int conjunto1[] = new int[maxNumber];
        int conjunto2[] = new int[maxNumber];
        
        /*Preencher valores*/
        for (int i = 0; i < numbers.length; i++){
            System.out.print("Informe seu numero de posicao "+i+": ");
            numbers[i] = Entrada.nextInt();

            if((numbers[i] % 2 == 0) && (numbers[i] >= 0)){
                conjunto1[contador1] = numbers[i];
                contador1++;
            } else {
                conjunto2[contador2] = numbers[i];
                contador2++;
            }
            
        }   

        /*Printar*/
        System.out.print("\nPARES OU POSITIVOS:\n");
        for (int i = 0; i < contador1; i++){
                System.out.print(conjunto1[i]+", ");
        }
        System.out.print("\nIMPARES OU NEGATIVOS:\n");
        for (int i = 0; i < contador2; i++){
            System.out.print(conjunto2[i]+", ");
        }
    }
}