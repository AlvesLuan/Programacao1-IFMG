import java.util.*;
class LuanKauanAlves9 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        double anoDeFabricacao, valorCarro, taxa;

        System.out.printf("Informe o valor do seu carro: ");
        valorCarro = Entrada.nextDouble();
        System.out.printf("Informe o ano de fabricação do seu carro: ");
        anoDeFabricacao = Entrada.nextDouble();


        if (anoDeFabricacao < 1930){
            taxa = valorCarro * 0.01;
            System.out.printf("O valor a ser pago é R$%.2f", taxa);
        } else {
            taxa = valorCarro * 0.015;
            System.out.printf("O valor a ser pago é R$%.2f", taxa);
        }
    }
}