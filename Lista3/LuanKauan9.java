import java.util.*;
class LuanKauan9 {
	public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        double numero = 0; 
        double soma = 0, max, media;

        System.out.printf("Vai inserir quantos numero? ");
        max = Entrada.nextInt();

        for (int i = 1;i <= max; i++){
            System.out.printf("Insira o numero "+i+": ");
            numero = Entrada.nextDouble();
            soma = soma + numero;
        }
        media = soma / max;
            
        System.out.printf("A media é %.2f !", media);
    }
}