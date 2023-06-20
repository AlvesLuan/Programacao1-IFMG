import java.util.*;
class LuanKauanAlves16 {
  public static void main(String[] args) 
  {
    int seuMinutos, minuto, hora;
    
    Scanner Entrada = new Scanner(System.in);
    
    System.out.print("Quantos minutos? ");
    seuMinutos = Entrada.nextInt();

    hora = seuMinutos / 60; 
    minuto = seuMinutos % 60;

    System.out.printf("\nEsse tempo são %d horas e %d minutos.", hora, minuto );
  }
}