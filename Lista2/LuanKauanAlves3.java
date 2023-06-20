import java.util.*;
class LuanKauanAlves3{
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);

        double seuNumero1, seuNumero2;

        System.out.print("Informe seu primeiro numero: ");
        seuNumero1 = Entrada.nextDouble();
        System.out.print("Informe seu segundo numero: ");
        seuNumero2 = Entrada.nextDouble();

        if (seuNumero1 > seuNumero2){
            if (seuNumero1 < 0){
                seuNumero2 = Math.pow(seuNumero2, 2);
                System.out.printf("O seu primeiro numero ao quadrado é: %.2f \ne seu segundo numero não possui raiz real.", seuNumero2);
            } else {
                seuNumero2 = Math.pow(seuNumero2, 2);
                seuNumero1 = Math.sqrt(seuNumero1);
                System.out.printf("O seu menor numero ao quadrado é: %.2f \nA raiz do maior numero é: %.2f", seuNumero2, seuNumero1);
            }
        }
        else if (seuNumero2 > seuNumero1){
            if (seuNumero2 < 0){
                seuNumero1 = Math.pow(seuNumero2, 2);
                System.out.printf("O seu menor numero ao quadrado é: %.2f \ne o menor não possui raiz real.", seuNumero2);
            } else {
                seuNumero1 = Math.pow(seuNumero2, 2);
                seuNumero2 = Math.sqrt(seuNumero2);
                System.out.printf("O seu menor numero ao quadrado é: %.2f \nA raiz do maior numero é: %.2f", seuNumero2, seuNumero1);
            }
        }
        else if (seuNumero1 == seuNumero2){
            seuNumero2 = Math.sqrt(seuNumero2);
            seuNumero1 = Math.pow(seuNumero1, 2);
            
            System.out.printf("Seus numeros são iguais, então:\nA raiz dele: %.2f\nO quadrado dele: %.2f", seuNumero2, seuNumero1);
        }    
    }
}