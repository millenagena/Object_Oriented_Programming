package banco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		Scanner sc = new Scanner(System.in);
		int op, numConta, cont=0;
		double valor;
		String nome;
		
		
		do {
			
			System.out.println("\n===== MENU =====");
			System.out.println("1 - Criar uma conta");
			System.out.println("2 - Verificar saldo");
			System.out.println("3 - Depositar");
			System.out.println("4 - Sacar");
			System.out.println("5 - Sair");
			op = sc.nextInt();
			sc.nextLine();
			
			switch(op) {
				case 1:
					try {
						System.out.println("Nome do titular: ");
						nome = sc.next();
						System.out.println("Saldo da conta: ");
						valor = sc.nextDouble();					
						System.out.println("Numero da conta: ");
						numConta = sc.nextInt();
						sc.nextLine();
						Conta conta = new Conta(nome, valor, numConta);
						contas[cont] = conta;
					}
					catch(NullPointerException ex){
						System.out.println(ex.getMessage());
					}
					catch(SaldoException ex) {
						System.out.println(ex.getMessage());
					}
					catch(InputMismatchException ex) {
						System.out.println("Formato invalido!");
					}
					break;
				case 2:
					System.out.println("Informe o numero da conta: ");
					numConta = sc.nextInt();
					sc.nextLine();
					for(int i=0; i<cont; i++){
						if(contas[i].getNumero() == numConta) {
							System.out.println("Saldo da conta " + contas[i].getNumero() + ": " + contas[i].getSaldo());
							break;
						}
					}
					break;
				case 3:
					try {
						System.out.println("Informe o numero da conta: ");
						numConta = sc.nextInt();
						System.out.println("Informe o valor do deposito: R$");
						valor = sc.nextInt();
						sc.nextLine();
						for(int i=0; i<cont; i++){
							if(contas[i].getNumero() == numConta) {
								contas[i].deposita(valor);
								break;
							}
						}
					}
					catch(SaldoException ex) {
						System.out.println(ex.getMessage());
					}
					catch(InputMismatchException ex) {
						System.out.println("Formato invalido!");
					}
					break;
				case 4:
					try {
						System.out.println("Informe o numero da conta: ");
						numConta = sc.nextInt();
						System.out.println("Informe o valor do saque: R$");
						valor = sc.nextInt();
						sc.nextLine();
						for(int i=0; i<cont; i++){
							if(contas[i].getNumero() == numConta) {
								contas[i].saca(valor);
								break;
							}
						}
					}
					catch(SaldoException ex) {
						System.out.println(ex.getMessage());
					}
					catch(InputMismatchException ex) {
						System.out.println("Formato invalido!");
					}
					break;
			}
			
		}while(op != 6);
		sc.close();
	}

}
