package locadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Dvd[] listaDvd = new Dvd[5];
		Cd[] listaCd = new Cd[5];
		FitaVhs[] listaVhs = new FitaVhs[5];
		
		Scanner sc = new Scanner(System.in);
		int op, contDvd=0, contCd=0, contVhs=0, 
			anoProd, tempoDuracao, classiEtaria,
			numAtores, numFaixas, tipoMid;
		float precoLoc;
		Boolean reb;
		String nome, genero, diretor, nomeCantor;
		String[] nomeAtores = new String[10];
		
		do {
			
			System.out.println("\n===== MENU =====");
			System.out.println("1 - Cadastrar um DVD");
			System.out.println("2 - Cadastrar um CD");
			System.out.println("3 - Cadastrar uma Fita VHS");
			System.out.println("4 - Procurar mídia");
			System.out.println("5 - Sair");
			op = sc.nextInt();
			sc.nextLine();
			
			switch(op) {
				case 1:
					if(contDvd < 5) {
						System.out.print("\nNome: ");
						nome = sc.nextLine();
						System.out.print("Gênero: ");
						genero = sc.next();
						System.out.print("Ano produção: ");
						anoProd = sc.nextInt();
						sc.nextLine();
						System.out.print("Preço locação: ");
						precoLoc = sc.nextFloat();
						sc.nextLine();
						System.out.print("Diretor: ");
						diretor = sc.nextLine();;
						System.out.print("Tempo duração: ");
						tempoDuracao = sc.nextInt();
						sc.nextLine();
						System.out.print("Classificação etária: ");
						classiEtaria = sc.nextInt();
						sc.nextLine();
						System.out.print("Informe a quantidade de atores: ");
						numAtores = sc.nextInt();
						sc.nextLine();
						for(int i=0; i<numAtores; i++){
							String nomeAtor;
							System.out.print("Nome do ator " + (i+1) + ": ");
							nomeAtor = sc.nextLine();
							nomeAtores[i] = nomeAtor;
						}
						Dvd dvd = new Dvd(nome, genero, anoProd, precoLoc, 
						nomeAtores, diretor, tempoDuracao, classiEtaria);
						listaDvd[contDvd] = dvd;
					}else {
						System.out.println("-----LISTA DE DVD'S CHEIA-----");
					}
					contDvd++;
					break;
				case 2:
					if(contCd < 5) {
						System.out.print("\nNome: ");
						nome = sc.nextLine();
						System.out.print("Gênero: ");
						genero = sc.nextLine();
						System.out.print("Ano produção: ");
						anoProd = sc.nextInt();
						sc.nextLine();
						System.out.print("Preço locação: ");
						precoLoc = sc.nextFloat();
						sc.nextLine();
						System.out.print("Nome cantor: ");
						nomeCantor = sc.nextLine();
						System.out.print("Número  de faixas: ");
						numFaixas = sc.nextInt();
						sc.nextLine();
						
						Cd cd = new Cd(nome, genero, anoProd, precoLoc, 
									   nomeCantor, numFaixas);
						listaCd[contCd] = cd;
					}else {
						System.out.println("-----LISTA DE CD'S CHEIA-----");
					}
					contCd++;
					break;
				case 3:
					if(contVhs < 5) {
						System.out.print("\nNome: ");
						nome = sc.nextLine();
						System.out.print("Gênero: ");
						genero = sc.nextLine();
						System.out.print("Ano produção: ");
						anoProd = sc.nextInt();
						sc.nextLine();
						System.out.print("Preço locação: ");
						precoLoc = sc.nextFloat();
						sc.nextLine();
						System.out.print("Diretor: ");
						diretor = sc.nextLine();
						System.out.print("Tempo duração: ");
						tempoDuracao = sc.nextInt();
						sc.nextLine();
						System.out.print("Classificação etária: ");
						classiEtaria = sc.nextInt();
						sc.nextLine();
						System.out.print("Informe a quantidade de atores: ");
						numAtores = sc.nextInt();
						sc.nextLine();
						for(int i=0; i<numAtores; i++){
							String nomeAtor;
							System.out.print("Nome do ator " + (i+1) + ": ");
							nomeAtor = sc.nextLine();
							nomeAtores[i] = nomeAtor;
						}
						System.out.print("Rebobinada? Digite:\nTrue - Sim\nFalse - Não\n");
						reb = sc.nextBoolean();
						sc.nextLine();
						
						FitaVhs vhs = new FitaVhs(nome, genero, anoProd, precoLoc, 
									  nomeAtores, diretor, tempoDuracao, classiEtaria,
									  reb);
						listaVhs[contVhs] = vhs;
					}else {
						System.out.println("-----LISTA DE FITAS VHS CHEIA-----");
					}
					contVhs++;
					break;
				case 4:
					System.out.println("Escolha o tipo da mídia\n1 - DVD\n2 - CD\n3 - FitaVHS");
					tipoMid = sc.nextInt();
					sc.nextLine();
					System.out.println("Informe o nome: ");
					nome = sc.nextLine();
					if(tipoMid == 1) {
						for(int i=0; i<contDvd; i++) {
							if(listaDvd[i].getNome().equalsIgnoreCase(nome)) {
								System.out.println(listaDvd[i].getDados());							}
						}
					}else if(tipoMid == 2) {
						for(int i=0; i<contCd; i++) {
							if(listaCd[i].getNome().equalsIgnoreCase(nome)) {
								System.out.println(listaCd[i].getDados());							}
						}
					}else {
						for(int i=0; i<contVhs; i++) {
							if(listaVhs[i].getNome().equalsIgnoreCase(nome)) {
								System.out.println(listaVhs[i].getDados());							}
						}
					}
			}
			
			
		}while(op != 5);
		sc.close();
	}

}
