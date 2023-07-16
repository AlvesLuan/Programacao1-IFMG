import java.util.*;
class LuanKauan13 {
    public static void main(String[] args) 
	{
        int numero;
        boolean primo = true;

        Scanner Entrada = new Scanner(System.in);
        System.out.printf("Insira o numero: ");
        numero = Entrada.nextInt();

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                primo = false;
            }else{
                primo = true;
            }
        }

        if (primo == true){
            System.out.printf("é primo");
        }else{
            System.out.printf("não é primo");}

    }
}
