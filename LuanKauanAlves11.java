import java.util.*;
class LuanKauanAlves11 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        double seuX, resultado;

        System.out.printf("Informe seu X: ");
        seuX = Entrada.nextDouble();
        
        if (seuX <= 1){
            System.out.printf("f(%.2f) = 1 ",seuX);
        }
        else if (seuX > 1 && seuX <= 2){
            System.out.printf("f(%.2f) = 2 ",seuX);
        }
        else if (seuX > 2 && seuX <= 3){
            resultado = Math.pow(seuX, 2);
            System.out.printf("f(%.2f) = %.2f ",seuX, resultado);
        }
        else if (seuX > 3){
            resultado = Math.pow(seuX, 3);
            System.out.printf("f(%.2f) = %.2f ",seuX, resultado);
        }
    }
}