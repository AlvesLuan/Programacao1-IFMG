import java.util.*;
class LuanKauan3 {
    public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        int maxNumeros, num1 = 1, num2 = 0;

        /* Recebe o maximo */
        System.out.printf("\nQuantos numeros de fibonacci? ");
        maxNumeros = Entrada.nextInt();

        int vetorFIBO[] = new int[maxNumeros];
        vetorFIBO[0] = 1;

        /*Preencher valores*/
        for (int i = 1; i < vetorFIBO.length; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            vetorFIBO[i] = num1;
        }
    
        /*Printar*/
        System.out.print("\nOs numeros armazenados foram: {");
        for (int i = 0; i < vetorFIBO.length; i++){
            System.out.print(vetorFIBO[i]+" ; ");}
        System.out.printf("}");
    }
}