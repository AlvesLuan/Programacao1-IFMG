import java.util.*;
class LuanKauanAlves7 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        String caractereUsuario;

        System.out.printf("insira seu caractere: ");
        caractereUsuario = Entrada.nextLine();
        caractereUsuario.toLowerCase();

        switch(caractereUsuario){
            case"a":
            case"e":
            case"i":
            case"o":
            case"u":
                System.out.printf("Seu caractere \"%s\" é uma vogal!", caractereUsuario);
                break;

            default:
                System.out.printf("Seu caractere \"%s\" é uma consoante!", caractereUsuario);
                break;
        }       
    }
}