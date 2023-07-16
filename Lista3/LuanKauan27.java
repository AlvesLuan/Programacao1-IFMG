import java.util.*;
class LuanKauan27 {
    public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        int altura;

        System.out.printf("Digite a Altura: ");
        altura = Entrada.nextInt();

        for(int i = 1; i <= altura; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }     
}
