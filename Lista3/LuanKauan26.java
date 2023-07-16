import java.util.*;
class LuanKauan26 {
    public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        double senx = 0, x , contador = 0, fatorial = 1, valid = 0;

        System.out.printf("Digite seu X: ");
        x = Entrada.nextDouble();
        x = (x * Math.PI) / 180;

        for(int i = 1; i<=15;i++){
            for(int j = 1; j <= contador; j++){
                fatorial = fatorial * j;
            }
            if(valid == 0){
                senx += Math.pow(x, contador) / fatorial;
                valid = 1;}
            else if(valid == 1){
                senx -= Math.pow(x, contador) / fatorial;
                valid = 0;}

            fatorial = 1;
            contador++; 
            contador++;
        }
        System.out.printf("Seu seno é: %.2f", senx);   
    }     
}
