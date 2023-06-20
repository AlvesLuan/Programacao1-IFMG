import java.util.*;
class LuanKauanAlves13 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        double seuPeso, suaAltura, imc;
    
        System.out.printf("Informe seu peso atual: ");
        seuPeso = Entrada.nextDouble();
        System.out.printf("Informe sua altura: ");
        suaAltura = Entrada.nextDouble();

        /*imc = peso/(altura²) */
        imc = seuPeso/(Math.pow(suaAltura, 2));


        if (imc < 18.5){
            System.out.printf("Seu imc é: %.0f \nVocê esta abaixo do peso! ", imc);
        }
        else if (imc >= 18.5 && imc < 25){
            System.out.printf("Seu imc é: %.0f \nVocê esta no peso normal! ", imc);
        }
        else if (imc >= 25 && imc < 30){
            System.out.printf("Seu imc é: %.0f \nVocê esta acima do peso! ", imc);
        }
        else if (imc >= 30){
            System.out.printf("Seu imc é: %.0f \nVocê esta obeso! ", imc);
        }
    }
}