import java.util.*;
class LuanKauan21 {
    public static void main(String[] args) 
	{
        int numeroDigitado;
        String numINVERTIDO = "";

        Scanner Entrada = new Scanner(System.in);
        
        System.out.printf("Insira um numero: ");
        numeroDigitado = Entrada.nextInt();

        String strNUM = String.valueOf(numeroDigitado);


        for (int i = 0; i < strNUM.length();i++){
            char posicao = strNUM.charAt(i);
            numINVERTIDO = posicao + numINVERTIDO;
        }

        if (numINVERTIDO.equals(strNUM)){
            System.out.printf("É PALINDROMO"); 
        }else{
            System.out.printf("NÃO É PALINDROMO");
        }
    }     
}


