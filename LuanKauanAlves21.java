import java.util.*;
class LuanKauanAlves21 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        int ano;

        System.out.printf("Informe o ano: ");
        ano = Entrada.nextInt();
        
        /*(ano % 4 = 0 e (ano % 100 != 0 ou ano % 400 == 0)). */
        
        if ((ano % 4 == 0)&&((ano % 100 != 0) || ano % 400 == 0)){
            System.out.printf("é um ano Bissexto!");
        } else {
            System.out.printf("NÃO é um ano Bissexto!");}
    }
}