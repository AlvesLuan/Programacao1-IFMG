import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
class LuanKauanAlves15 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        String data1, data2;
        Date date1, date2;

        System.out.printf("Informe a data1 (DD/MM/AAAA): ");
        data1 = Entrada.nextLine();
        System.out.printf("Informe a data2 (DD/MM/AAAA): ");
        data2 = Entrada.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            date1 = sdf.parse(data1);
            date2 = sdf.parse(data2);

            if (date1.compareTo(date2) > 0) {
                System.out.println("A data "+data1 + " é maior que " + data2);} 

            else if (date1.compareTo(date2) < 0) {
                System.out.println("A data "+data2 + " é maior que " + data1);} 
                
            else {
                System.out.println("As datas são iguais.");
            }
        }
        catch(ParseException e){
            System.out.println("Formato errado.");
        }
    }
}