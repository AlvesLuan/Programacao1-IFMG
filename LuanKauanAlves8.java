import java.util.*;
class LuanKauanAlves8 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        double salario, SalarioAjuste;

        System.out.printf("Informe seu salario: ");
        salario = Entrada.nextDouble();

        if (salario < 700){
            SalarioAjuste = salario + (salario * 0.30);
            System.out.printf("Seu Salario com ajuste é R$%.2f", SalarioAjuste);
        }
        if (salario >= 700){
            SalarioAjuste = salario + (salario * 0.10);
            System.out.printf("Seu Salario com ajuste é R$%.2f", SalarioAjuste);
        }
    }
}