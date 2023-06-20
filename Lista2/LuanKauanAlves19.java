import java.util.*;
class LuanKauanAlves19 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        int numero4d, digito1, digito2, digito3, digito4, somador;

        System.out.printf("Informe o numero de 4 digitos: ");
        numero4d = Entrada.nextInt();
       
        digito1 = (numero4d / 1000) % 10;  // Pega o primeiro dígito 1 ou 0
        digito2 = (numero4d / 100) % 10;;  // Pega o segundo dígito 1 ou 0
        digito3 = (numero4d / 10) % 10;   // Pega o terceiro dígito 1 ou 0
        digito4 = numero4d % 10;   // Pega o quarto dígito 1 ou 0

        System.out.println(digito1);
        System.out.println(digito2);
        System.out.println(digito3);
        System.out.println(digito4);
        
        if ((digito1 == 0 || digito1 == 1) && (digito2 == 0 || digito2 == 1) && (digito3 == 0 || digito3 == 1) && (digito4 == 0 || digito4 == 1)){
            somador = 0;
            System.out.printf("É um binario!!");
            if (digito1 == 1){
                somador =+ 8;
            }
            if (digito2 == 1){
                somador = somador + 4;
            }
            if (digito3 == 1){
                somador = somador + 2;
            }
            if (digito4 == 1){
                somador = somador + 1;
            }
            System.out.printf("Em decimal este é o: %d!!", somador);
        } else {
            System.out.printf("Não é um binario!!");}
    }
}