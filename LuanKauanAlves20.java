import java.util.*;
class LuanKauanAlves20 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        double n1, n2, resto;

        System.out.printf("Informe numero 1: ");
        n1 = Entrada.nextDouble();
        System.out.printf("Informe numero 2: ");
        n2 = Entrada.nextDouble();
       
        resto = n1 % n2;
        
        if (resto == 0){
            System.out.printf("n1 é multiplo de n2!");
        } else {
            System.out.printf("n1 não é multiplo de n2!");}
    }
}