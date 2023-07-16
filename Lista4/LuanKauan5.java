import java.util.*;
class LuanKauan5 {
    public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        double media = 0, somador = 0;

        double vetorAltura[] = new double[20];
        vetorAltura[0] = 1;
        

        /*Preencher valores*/
        for (int i = 0; i < vetorAltura.length; i++){
            System.out.print("Bem vindo atleta "+(i+1)+", informe sua altura: ");
            vetorAltura[i] = Entrada.nextDouble();
            somador += vetorAltura[i];
        }   
        media = somador/vetorAltura.length;
        System.out.printf("\nA média foi: %.2f \n", media);
        
        /*Printar*/
        System.out.print("\nDentre os inscritos, Os atletas que poderão participar serão: \n");
        for (int i = 0; i < vetorAltura.length; i++){
            if (vetorAltura[i] >= media){
                System.out.print("Atleta "+(i+1)+" de altura "+vetorAltura[i]+"\n");
            }
        }
    }
}