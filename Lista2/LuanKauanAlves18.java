import java.util.*;
class LuanKauanAlves18 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        int numero3d, digito1, digito3;

        System.out.printf("Informe o numero de 3 digitos: ");
        numero3d = Entrada.nextInt();
       
        digito1 = numero3d / 100;  // Pega o primeiro dígito
        digito3 = numero3d % 10;   // Pega o terceiro dígito

        
        if (digito1 == digito3){
            System.out.printf("É um palindromo!!");
        } else {
            System.out.printf("Não é um palindramo!!");}
    }
}