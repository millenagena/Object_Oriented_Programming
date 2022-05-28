package lab03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int hora, minuto, segundo;
		String op;
		
		System.out.print("\nInforme a hora: ");
        hora = sc.nextInt();
        System.out.print("Informe os minutos: ");
        minuto = sc.nextInt();
        System.out.print("Informe os segundos: ");
        segundo = sc.nextInt();
        Tempo temp = new Tempo(hora, minuto, segundo);
        
        System.out.println("\nTempo informado: ");
        temp.mostraTempo();
		temp.mostraTempoAmerican();
		
		System.out.print("\nDigite 'i' para incrementar um minuto ou 'd' para decrementar: ");
        op = sc.next();
        temp.ajustaMinuto(op);
        
        System.out.println("\nTempo resultante: ");
		temp.mostraTempo();
		temp.mostraTempoAmerican();
        
        

	    sc.close();
	}
}
