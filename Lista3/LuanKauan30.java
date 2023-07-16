import java.util.*;
class LuanKauan30 {
    public static void main(String[] args) {
        double preco = 5, lucroParcial = 0, despesaFixa = 200, lucroMAXIMO ;
        int ingressos = 120;

        lucroMAXIMO = ingressos * preco;
        System.out.printf("Preço dos ingressos: R$ %.2f\n", preco);        

        do{
            preco -= 0.5;
            ingressos += 26;
            lucroParcial = 26.0 * preco;
            System.out.printf("O Valor do ingresso é R$%.2f\n", preco);
        }while (preco > 1.0);
        
        lucroMAXIMO += lucroParcial - despesaFixa;

        System.out.printf("O lucro esperado é R$%.2f\n", lucroMAXIMO);
        System.out.printf("\nO Total de ingressos vendidos é %d\n", ingressos);
        
    }
}
   