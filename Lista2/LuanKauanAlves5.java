import java.util.*;
class LuanKauanAlves5 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        double valorCarroFB, porcentDistribuidor, impostos, valorFinalCarro;

        System.out.printf("Informe o valor de fabrica do carro: ");
        valorCarroFB = Entrada.nextDouble();

        if (valorCarroFB <= 28000){
            porcentDistribuidor = valorCarroFB * 0.05;
            valorFinalCarro = valorCarroFB + porcentDistribuidor;
            System.out.printf("O valor final do carro com os impostos e taxas inclusas é: R$%.2f", valorFinalCarro);
        } else if (valorCarroFB >= 28000){
            porcentDistribuidor = valorCarroFB * 0.15;
            impostos = valorCarroFB * 0.20;
            valorFinalCarro = valorCarroFB + porcentDistribuidor + impostos;
            System.out.printf("O valor final do carro com os impostos e taxas inclusas é: R$%.2f", valorFinalCarro);
        } else {
            porcentDistribuidor = valorCarroFB * 0.10;
            impostos = valorCarroFB * 0.15;
            valorFinalCarro = valorCarroFB + porcentDistribuidor + impostos;
            System.out.printf("O valor final do carro com os impostos e taxas inclusas é: R$%.2f", valorFinalCarro);
        }

    }
}