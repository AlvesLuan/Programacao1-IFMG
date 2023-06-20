import java.util.*;
class LuanKauan4 {
	public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        double userNumber, triple;
        do{
            System.out.printf("insira seu numero: ");
            userNumber = Entrada.nextDouble();
            
            triple = userNumber * 3;

            System.out.println("O triplo é: "+ triple);

        }while (userNumber != -999);

        System.out.println("BREAKS!");
    }
}