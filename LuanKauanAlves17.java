import java.util.*;
class LuanKauanAlves17 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        double a, b, c, n;

        System.out.printf("infome o primeiro Lado: ");
        a = Entrada.nextDouble();
        System.out.printf("infome o segundo Lado: ");
        b = Entrada.nextDouble();
        System.out.printf("infome o terceiro Lado: ");
        c = Entrada.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)){
            if (a == b && b == c) {
                System.out.printf("É um triangulo EQUILATERO!!!");
            }
            else if (a == b || a == c || b == c) {
                System.out.printf("É um triangulo ISÓSCELES!!!");
            } else {
                System.out.printf("É um triangulo ESCALENO!!!");
            }
        } else {
            System.out.printf("NÃO É UM TRIANGULO PARCEIRO, ESTUDA MAIS UM POUCO AI PÔ!!!");
        }
    }
}