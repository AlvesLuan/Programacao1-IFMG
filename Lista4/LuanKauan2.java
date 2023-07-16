import java.util.*;
class LuanKauan2 {
    public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        int vetorOriginal[] = new int[10];
        int vetorInvertido[] = new int[10];

        /*Receber valores*/
        for (int i = 0; i < vetorOriginal.length; i++){
            System.out.printf("\nPreencha a posição %d do vetor original: ", i+1);
            vetorOriginal[i] = Entrada.nextInt();
        }

        /*Inverter*/
        for (int i = 0; i < vetorInvertido.length ; i++){
            vetorInvertido[i] = vetorOriginal[9-i];
        }

        /*Printar*/
        System.out.printf("\nA) O VETOR ORIGINAL é: {");
        for (int i = 0; i < vetorOriginal.length; i++){
            System.out.print(vetorOriginal[i]+" ; ");}
        System.out.printf("}");

        System.out.print("\nB) O VETOR INVERTIDO é: {");
        for (int i = 0; i < vetorInvertido.length; i++){
            System.out.print(vetorInvertido[i]+" ; ");}
        System.out.printf("}");
    }
}