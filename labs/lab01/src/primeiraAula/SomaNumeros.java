package primeiraAula;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String a[]){
           
        System.out.println("Entre com dois numeros: ");        
        
        Scanner num = new Scanner(System.in);
        Double x = num.nextDouble();
        Double y = num.nextDouble();
        
        Double soma = x + y;
        System.out.println("Resultado da soma: " + soma);
        num.close();    
    }
}
