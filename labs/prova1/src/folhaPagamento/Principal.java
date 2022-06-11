package folhaPagamento;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Operario[] ops = new Operario[15];
		Comissionado[] comis = new Comissionado[15];
		Faxineiro[] faxis = new Faxineiro[15];
		
		Scanner sc = new Scanner(System.in);
		int op, contOp=0, contCom=0, contFax=0, numCarteira, itensVendidos;
		double salario, percentualCom, folhaOp=0, folhaCom=0, folhaFax=0;
		String tipoFunc, nome, rg, cpf, setor;
		
		do {
			System.out.println("\n===== MENU =====");
			System.out.println("1 - Criar um funcionario");
			System.out.println("2 - Listar funcionarios cadastrados");
			System.out.println("3 - Exibir folha salarial");
			System.out.println("4 - Sair");
			op = sc.nextInt();
			
			switch(op) {
				case 1:
					System.out.println("===CADASTRO DE FUNCIONARIOS====");
					System.out.print("\nNome: ");
					nome = sc.next();
					sc.nextLine();
					System.out.print("CPF: ");
					cpf = sc.next();
					sc.nextLine();
					System.out.print("RG: ");
					rg = sc.next();
					sc.nextLine();
					System.out.print("Numero carteira de trabalho: ");
					numCarteira = sc.nextInt();
					sc.nextLine();
					System.out.print("Salario base: ");
					salario = sc.nextDouble();
					sc.nextLine();
					System.out.print("Informe o tipo do funcionario (operario, comissionado, faxineiro): ");
					tipoFunc = sc.next();
					sc.nextLine();
					if(tipoFunc.equalsIgnoreCase("operario")) {
						System.out.print("Setor (A, B ou C): ");
						setor = sc.next();
						sc.nextLine();
						
						Operario operario = new Operario(nome, cpf, rg, numCarteira, salario, setor);
						ops[contOp] = operario;
						folhaOp += operario.getSalarioFinal();
						contOp++;
						
					}else if(tipoFunc.equalsIgnoreCase("comissionado")) {
						System.out.print("Percentual de comissao em %: ");
						percentualCom = sc.nextDouble();
						sc.nextLine();
						System.out.println("Itens vendidos: ");
						itensVendidos = sc.nextInt();
						sc.nextLine();
						
						Comissionado comissio = new Comissionado(nome, cpf, rg, numCarteira, salario,
														         percentualCom, itensVendidos);
						comis[contCom] = comissio;
						folhaCom += comissio.getSalarioFinal();
						contCom++;
						
					}else if(tipoFunc.equalsIgnoreCase("faxineiro")) {
						Faxineiro faxineiro = new Faxineiro(nome, cpf, rg, numCarteira, salario);
						faxis[contFax] = faxineiro;
						folhaFax += faxineiro.getSalarioBase();
						contFax++;
					}else {
						System.out.println("===nao existe esse tipo de funcionario===");
					}
					
					break;
				case 2:
					int tipo;
					String info;
					
					System.out.println("\nInforme o tipo (1,2 ou 3) dos funcionarios cadastrados que deseja: " + 
									   "\n1 - Operarios\n2 - Comissionados\n3 - Faxineiros");
					tipo = sc.nextInt();
					sc.nextLine();
					if(tipo == 1) {
						System.out.println("\n====OPERARIOS CADASTRADOS====");
						for(int i=0; i<contOp; i++) {
							info = ops[i].getDados();
							System.out.println(info);
						}
					}else if(tipo == 2) {
						System.out.println("\n====COMISSIONADOS CADASTRADOS====");
						for(int i=0; i<contCom; i++) {
							info = comis[i].getDados();
							System.out.println(info);
						}
					}else if(tipo == 3) {
						System.out.println("\n====FAXINEIROS CADASTRADOS====");
						for(int i=0; i<contFax; i++) {
							info = faxis[i].getDados();
							System.out.println(info);
						}
					}
					break;
				case 3:
					System.out.println("\n====FOLHA SALARIAL POR TIPO====");
					System.out.print("\nOPERARIOS: " + folhaOp);
					System.out.print("\nCOMISSIONADOS: " + folhaCom);
					System.out.print("\nFAXINEIROS: " + folhaFax);
					System.out.print("\nTOTAL: " + (folhaOp + folhaCom + folhaFax));
					
					System.out.println("\n\n====FOLHA SALARIAL OPERARIOS====");
					for(int i=0; i<contOp; i++) {
						info = ops[i].getFolhaPagamento();
						System.out.println(info);
					}
					System.out.println("\n====FOLHA SALARIAL COMISSIONADOS====");
					for(int i=0; i<contCom; i++) {
						info = comis[i].getFolhaPagamento();
						System.out.println(info);
					}
					System.out.println("\n====FOLHA SALARIAL FAXINEIROS====");
					for(int i=0; i<contFax; i++) {
						info = faxis[i].getFolhaPagamento();
						System.out.println(info);
					}
					break;
			}
			
		}while(op != 4);
		sc.close();
	}

}
