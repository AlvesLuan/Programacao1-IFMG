import java.util.*;
class LuanKauan11 {
    public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        String nomeAluno = "", menorAluno = "", maiorAluno = "";
        double numero = 0; 
        double soma = 0, max, media, maiornumero = 0, menornumero = 0;

        System.out.printf("Vai inserir quantas notas? ");
        max = Entrada.nextInt();

        for (int i = 1;i <= max; i++){
            System.out.printf("\nInsira seu nome: ");
            Entrada.nextLine();
            nomeAluno = Entrada.nextLine();
            System.out.printf("Insira sua nota: ");
            numero = Entrada.nextDouble();

            soma += numero;

            if (i == 1){ 
                maiornumero = numero;
                menorAluno = nomeAluno;
                menornumero = numero;
                maiorAluno = nomeAluno;} 
            else {
                if (numero < menornumero){
                    menornumero = numero;
                    menorAluno = nomeAluno;
                }else if (numero > maiornumero){
                    maiornumero = numero;
                    maiorAluno = nomeAluno;}
            }
        }
        media = soma/max;
        
        if (maiornumero == menornumero){
            System.out.printf("\nA soma de todas as notas é %.2f\nA média da turma é %.2f\n", soma, media);
            System.out.printf("\nA maior nota é igual a menor nota, ela é: %.2f", maiornumero);
        }else{
        System.out.printf("\nA soma de todas as notas é %.2f\nA média da turma é %.2f\n", soma, media);
        System.out.printf("\nA maior nota é: %.2f do aluno: %s\nA menor nota é: %.2f do aluno: %s", maiornumero, maiorAluno, menornumero, menorAluno);
        }
    }
}