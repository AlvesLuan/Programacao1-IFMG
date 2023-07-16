import java.util.*;
class LuanKauan14 {
    public static void main(String[] args) 
	{
        int numero, fatorial = 1;

        Scanner Entrada = new Scanner(System.in);
        System.out.printf("Insira o numero: ");
        numero = Entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de "+numero+" é "+fatorial);
    }

}

