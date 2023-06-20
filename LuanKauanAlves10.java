import java.util.*;
class LuanKauanAlves10 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        double suaIdade, seuPeso, dosagem;

        System.out.printf("Informe sua idade: ");
        suaIdade = Entrada.nextDouble();
        System.out.printf("Informe seu peso: ");
        seuPeso = Entrada.nextDouble();

        if (suaIdade >= 12){
            if (seuPeso >= 60){
                System.out.printf("Você deve tomar 1000mg ");
            } else if (seuPeso < 60){
                System.out.printf("Você deve tomar 875mg ");}   
        }
        else if (suaIdade < 12){
            if (seuPeso <= 9){
                System.out.printf("Você deve tomar 125mg ");}
            else if ((9.1 < seuPeso) && (seuPeso < 16)){
                System.out.printf("Você deve tomar 250mg ");}
            else if ((16.1 < seuPeso) && (seuPeso < 24)){
                System.out.printf("Você deve tomar 375mg ");}
            else if ((24.1 < seuPeso) && (seuPeso < 30)){
                System.out.printf("Você deve tomar 500mg ");}
            else {
                System.out.printf("Você deve tomar 750mg ");}
        }
        
    }
}