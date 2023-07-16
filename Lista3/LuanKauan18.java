import java.util.*;
class LuanKauan18 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        double numeroUsuario1, numeroUsuario2, resultado;
        int escolhaUsuario;

        do{
            System.out.printf("Insira o primeiro numero: ");
            numeroUsuario1 = Entrada.nextDouble();
            System.out.printf("Insira o segundo numero: ");
            numeroUsuario2 = Entrada.nextDouble();
            
            System.out.println("O que você quer fazer com esse numero? ");
            System.out.println("[1] = SOMAR(+)\n[2] = SUBTRAIR(-)\n[3] = MULTIPLICR(*)\n[4] = DIVIDIR(/)\n[5] SAIR");
            escolhaUsuario = Entrada.nextInt();

            switch (escolhaUsuario) {
                case 1:
                    resultado = numeroUsuario1 + numeroUsuario2;
                    System.out.printf("%.2f + %.2f = %.2f", numeroUsuario1, numeroUsuario2, resultado);
                    break;
                case 2:
                    resultado = numeroUsuario1 - numeroUsuario2;
                    System.out.printf("%.2f - %.2f = %.2f", numeroUsuario1, numeroUsuario2, resultado);
                    break;
                case 3:
                    resultado = numeroUsuario1 * numeroUsuario2;
                    System.out.printf("%.2f * %.2f = %.2f", numeroUsuario1, numeroUsuario2, resultado);
                    break;
                case 4:
                    resultado = numeroUsuario1 / numeroUsuario2;
                    System.out.printf("%.2f / %.2f = %.2f", numeroUsuario1, numeroUsuario2, resultado);
                    break;      
            }
        }while (escolhaUsuario != 5);
    }
}