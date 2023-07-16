import java.util.*;
class LuanKauan31 {
    public static void main(String[] args) 
	{
        int voto = 1, votosCandidatoA = 0, votosCandidatoB = 0, votosCandidatoC = 0, votosCandidatoD = 0, votosNulo = 0, votosBranco = 0;
            Scanner Entrada = new Scanner(System.in);

            while (voto != 0) {
                System.out.printf("\nInforme seu voto:\n(1) Cadidato A\n(2) Cadidato B\n(3) Cadidato C\n(4) Cadidato D\n(5) Voto em branco\n");
                System.out.printf("Se quer anular, digite um valor inexistente! Para finalizar o processo de votação, digite 0.\nSeu voto: ");
                voto = Entrada.nextInt();
                System.out.printf("\n################################################\n");

                switch (voto) {
                    case 1: 
                        votosCandidatoA += 1;
                        break;
                    case 2: 
                        votosCandidatoB += 1;
                        break;
                    case 3: 
                        votosCandidatoC += 1;
                        break;
                    case 4: 
                        votosCandidatoD += 1;
                        break;
                    case 5: 
                        votosBranco += 1;
                        break;
                    default: 
                        if (voto != 0) {
                            votosNulo += 1;
                            break;
                        }
                        break;
                }
            }
            
            System.out.printf("Total Candidato A: %d", votosCandidatoA);
            System.out.printf("\nTotal Candidato B: %d", votosCandidatoB);
            System.out.printf("\nTotal Candidato C: %d", votosCandidatoC);
            System.out.printf("\nTotal Candidato D: %d", votosCandidatoD);
            System.out.printf("\nBrancos: %d", votosBranco);
            System.out.printf("\nNulos: %d\n", votosNulo);
    }
}

