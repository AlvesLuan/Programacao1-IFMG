import java.util.*;

public class LuanKauan24 {
    public static void main(String[] args)
    {
        Scanner Entrada = new Scanner(System.in);

        int ConsumidorNUM, kwhDoMes, somaKwhResd = 0, somaKwhComerc = 0, codigo;
        double  mediaResComerc,
                custoComerc = 0, custoResd = 0, custoInd = 0, 
                somaComerc = 0, somaResd = 0, somaInd = 0, res = 0;

        ConsumidorNUM = 1;

        while (ConsumidorNUM != 0){
            System.out.print("Informe a quantidade de kWh usador no mês: ");
            kwhDoMes = Entrada.nextInt();
            System.out.print("Informe o seu numero de consumidor: ");
            ConsumidorNUM = Entrada.nextInt();

            if (ConsumidorNUM == 0) {
                System.out.print("Inválido!!!!!!!!!!!!: ");
                break;}

            System.out.println("Informe o tipo de consumidor: ");
            System.out.printf("(1) - Residencial\n(2) - Comercial\n(3) - Industrial\n\n");
            codigo = Entrada.nextInt();

            switch (codigo) {
                case 1:
                    custoResd = kwhDoMes*0.3;
                    somaResd += custoResd;
                    somaKwhResd += kwhDoMes;
                    System.out.printf("Cliente n° %d: R$ %.2f\n\n", ConsumidorNUM, custoResd);
                    break;

                case 2:
                    custoComerc = kwhDoMes*0.5;
                    somaComerc += custoComerc;
                    somaKwhComerc += kwhDoMes;
                    System.out.printf("Cliente n° %d: R$ %.2f\n\n", ConsumidorNUM, custoComerc);
                    break;

                case 3:
                    custoInd = kwhDoMes*0.7;
                    somaInd += custoInd;
                    System.out.printf("Cliente n° %d: R$ %.2f\n\n", ConsumidorNUM, custoInd);
                    break;

                default:
                    break;
            }
        } 
        mediaResComerc = (somaKwhResd + somaKwhComerc) / 2;
        res = somaResd + somaComerc + somaInd;

        System.out.printf("A média de kWh entre Comercial e Residencial é: %.2f\n", mediaResComerc);
        System.out.printf("O total de consumo foi: %.2f\n", res);
    }
}