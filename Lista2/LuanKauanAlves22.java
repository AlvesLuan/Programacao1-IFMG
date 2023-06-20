import java.util.*;
class LuanKauanAlves22 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        int n1, n2, n3;

        System.out.printf("Informe o 1º numero:");
        n1 = Entrada.nextInt();
        System.out.printf("Informe o 2º numero:");
        n2 = Entrada.nextInt();
        System.out.printf("Informe o 3º numero:");
        n3 = Entrada.nextInt();
        
        if (n1 > n2 && n2 > n3){
            System.out.printf("Crescente: %d, %d, %d.\n", n3, n2, n1);
            System.out.printf("decrescente: %d, %d, %d.", n1, n2, n3);
        } 
        else if (n1 > n3 && n3 > n2){
            System.out.printf("Crescente: %d, %d, %d.\n", n2, n3, n1);
            System.out.printf("decrescente: %d, %d, %d.", n1, n3, n2);
        }
        else if (n3 > n2 && n2 > n1){
            System.out.printf("Crescente: %d, %d, %d.\n", n1, n2, n3);
            System.out.printf("decrescente: %d, %d, %d.", n3, n2, n1);
        }
        else if (n2 > n1 && n1 > n3){
            System.out.printf("Crescente: %d, %d, %d.\n", n3, n1, n2);
            System.out.printf("decrescente: %d, %d, %d.", n2, n1, n3);
        }
        else if (n2 > n3 && n3 > n1){
            System.out.printf("Crescente: %d, %d, %d.\n", n1, n3, n2);
            System.out.printf("decrescente: %d, %d, %d.", n2, n3, n1);
        }
        else if (n3 > n1 && n1 > n2){
            System.out.printf("Crescente: %d, %d, %d.\n", n2, n1, n3);
            System.out.printf("decrescente: %d, %d, %d.", n3, n1, n2);
        }
    }
}