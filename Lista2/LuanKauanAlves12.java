
import java.util.*;
class LuanKauanAlves12 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        double idadeNadador;
        String categoria;

        System.out.printf("Olá nadador, informe sua idade: ");
        idadeNadador = Entrada.nextDouble();

        if (idadeNadador > 5 && idadeNadador <= 7){
            categoria = "Infantil";
            System.out.printf("Com %.0f anos, sua categoria é %s! ", idadeNadador, categoria);
        }
        else if (idadeNadador > 8 && idadeNadador <= 10){
            categoria = "Juvenil";
            System.out.printf("Com %.0f anos, sua categoria é %s! ", idadeNadador, categoria);
        }
        else if (idadeNadador > 11 && idadeNadador <= 15){
            categoria = "Adolescente";
            System.out.printf("Com %.0f anos, sua categoria é %s! ", idadeNadador, categoria);
        }
        else if (idadeNadador > 16 && idadeNadador <= 40){
            categoria = "Adulto";
            System.out.printf("Com %.0f anos, sua categoria é %s! ", idadeNadador, categoria);
        }
        else if (idadeNadador > 40){
            categoria = "Senior";
            System.out.printf("Com %.0f anos, sua categoria é %s! ", idadeNadador, categoria);
        }
        else {
            System.out.printf("Você ainda não possui categoria!");
        }
    }
}