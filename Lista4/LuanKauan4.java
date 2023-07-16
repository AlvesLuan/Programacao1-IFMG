import java.util.*;

import java.util.*;;
class LuanKauan4 {
    public static void main(String[] args) 
	{
        int vetorQuadrado[] = new int[10];
    
        /*Preencher valores*/
        for (int i = 0; i < vetorQuadrado.length; i++){
            vetorQuadrado[i] = i*i;
        }
    
        /*Printar*/
        System.out.print("\nOs numeros armazenados foram: {");
        for (int i = 0; i < vetorQuadrado.length; i++){
            System.out.print(vetorQuadrado[i]+" ; ");}
        System.out.printf("}");
    }
}