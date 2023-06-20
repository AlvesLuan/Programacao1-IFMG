import java.util.*;
class LuanKauanAlves14 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        double diametroD, cargaQ, tensao, n;

        System.out.printf("Informe o diametro da sua barra cilindrica: ");
        diametroD = Entrada.nextDouble();
        System.out.printf("Informe a carga: ");
        cargaQ = Entrada.nextDouble();

        if (diametroD > 100){
            n = 2;
        }
        else if (diametroD < 50){
            n = 6;
        }
        else{
            n = 4;
        }

        tensao = ((4*cargaQ)/(Math.PI * Math.pow(diametroD, 2))) * n;

        System.out.printf("A tensão é %.2f ", tensao);


        
    }
}