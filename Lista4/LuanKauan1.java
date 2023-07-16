import java.util.*;
class LuanKauan1 {
    public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        int maxAlunos, menor16 = 0, maior16 = 0, maisnovo = 0, maisvelho = 0;
        double soma = 0, media;

        System.out.printf("\nSão quantos alunos? ");
        maxAlunos = Entrada.nextInt();

        int idades[] = new int[maxAlunos];

        for (int i = 0; i < idades.length; i++){
            System.out.printf("\nInforme a idade do aluno %d: ", i+1);
            idades[i] = Entrada.nextInt();
            if (idades[i] <= 16){
                menor16 += 1;
            } else if (idades[i] > 16){
                maior16 += 1;
            }

            if (i == 0){
                maisnovo = idades[0];
                maisvelho = idades[0];
            } else {
                if (idades[i] >= maisvelho){
                    maisvelho = idades[i];
                } else if(idades[i] <= maisnovo){
                    maisnovo = idades[i];
                }
            }
            soma += idades[i];
        } 

        media = soma/maxAlunos;

        System.out.printf("\nA) A quantidade de alunos com menos de 16 anos é: %d", menor16);
        System.out.printf("\nB) A quantidade de alunos com mais de 16 anos é: %d", maior16);
        System.out.printf("\nC) A media das idades é: %.2f", media);
        System.out.printf("\nD) O aluno mais novo tem %d anos. ", maisnovo);
        System.out.printf("\nE) O aluno mais velho tem %d anos. ", maisvelho);
        


    }
}