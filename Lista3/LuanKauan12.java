import java.util.*;
class LuanKauan12 {
    public static void main(String[] args) 
	{
        Scanner Entrada = new Scanner(System.in);
        String nomeCidade = "", nomeMenorA = "", nomeMaiorA = "";
        int numeroVeiculos = 0, numeroAcidentes = 0; 
        double somaVeiculos = 0, somaAcidentesEspecial = 0, somaAcidentes = 0,razaoAciVei = 0, mediaVeiculos, maiorNumeroAcidente = 0, menorNumeroAcidente = 0, mediaEspecial = 0;

        for (int i = 1;i <= 5; i++){
            System.out.printf("\nInsira o nome da cidade "+i+": ");
            nomeCidade = Entrada.nextLine();
            System.out.printf("Insira o numero de veiculos presentes em "+nomeCidade+": ");
            numeroVeiculos = Entrada.nextInt();
            System.out.printf("Insira o numero acidentes que ocorreram em "+nomeCidade+": ");
            numeroAcidentes = Entrada.nextInt();
            Entrada.nextLine();

            
            if(numeroVeiculos < 200){
                somaAcidentesEspecial += somaAcidentes;
            }

            if (i == 1){ 
                maiorNumeroAcidente = numeroAcidentes;
                nomeMaiorA = nomeCidade;
                menorNumeroAcidente = numeroAcidentes;
                nomeMenorA = nomeCidade;} 
            else {
                if (numeroAcidentes < menorNumeroAcidente){
                    menorNumeroAcidente = numeroAcidentes;
                    nomeMenorA = nomeCidade;

                } else if (numeroAcidentes > maiorNumeroAcidente){
                    maiorNumeroAcidente = numeroAcidentes;
                    nomeMaiorA = nomeCidade;}
            }
            somaAcidentes += numeroAcidentes;
            somaVeiculos += numeroVeiculos;
        }
        razaoAciVei = somaAcidentes/somaVeiculos;
        mediaVeiculos = somaVeiculos/5;
        mediaEspecial = somaAcidentesEspecial/5;
        
        System.out.printf("\nA cidade que mais ocorreram acidente é a cidade de %s, que ocorreram %.2f acidentes\n",nomeMaiorA, maiorNumeroAcidente);
        System.out.printf("A cidade que menos ocorreram acidente é a cidade de %s, que ocorreram %.2f acidentes\n",nomeMenorA, menorNumeroAcidente);

        System.out.printf("\nA razão entre quantidade de acidentes pela quantidade de veículos é %.2f\n",mediaVeiculos);

        System.out.printf("\nA media dos veiculos de todas as cidades são %.2f\n",mediaVeiculos);
        System.out.printf("\nA media de acidentes nas cidades com menos de 200 veiculos é: %.2f\n",mediaEspecial);


    }
}