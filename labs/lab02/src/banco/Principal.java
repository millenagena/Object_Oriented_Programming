package banco;

import java.util.Scanner;

public class Principal {
    
    static Cliente[] clientes = new Cliente[10];
    
    static Cliente logar(Scanner sc) {
        System.out.print("Usuario: ");
        String usr = sc.nextLine();
        System.out.print("Senha: ");
        String sen = sc.nextLine();
        for (int i=0;i<Cliente.getCt();i++)
            if ((clientes[i].getUsr().equals(usr))&&(clientes[i].getSen().equals(sen)))
                return clientes[i];
        return null;
    }
    
    static Conta buscaConta(int num) {
        for (int i=0;i<Cliente.getCt();i++)
            if (clientes[i].getConta().getNum() == num)
                return clientes[i].getConta();
        return null;
    }
    
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int op = -1;
        int contClientes = 0;
        
        while (op != 9) {
            System.out.println("=== MENU ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Saldo");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Transferir");
            System.out.println("6 - Relatorio");
            System.out.println("7 - Clientes negativados");
            System.out.println("8 - Idade clientes");
            System.out.println("9 - Sair");
            op = sc.nextInt();
            sc.nextLine();
            String tipo;
            float saldo;
            String nome, CPF, telefone;
            int idade;
            String usr,sen;
            Cliente c;
            
            switch(op) {
                case 1:
                    System.out.print("Tipo da Conta: ");
                    tipo = sc.nextLine();
                    System.out.print("Saldo inicial: ");
                    saldo = sc.nextFloat();
                    sc.nextLine();                    
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("CPF: ");
                    CPF = sc.nextLine();
                    System.out.print("Telefone: ");
                    telefone = sc.nextLine();
                    System.out.print("Idade: ");
                    idade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Usuario: ");
                    usr = sc.nextLine();
                    System.out.print("Senha: ");
                    sen = sc.nextLine();
                    Conta c1 = new Conta();
                    c1.cadastraConta(tipo, saldo);
                    Cliente cli1 = new Cliente();
                    cli1.cadastraCliente(nome, CPF, telefone, idade, usr, sen, c1);
                    clientes[contClientes] = cli1;
                    contClientes++;
                    break;
                case 2:
                    c = logar(sc);
                    if (c != null) {
                        System.out.println(c.getConta().mostraSaldo());
                    }else
                        System.out.println("Acesso negado.");
                    break;
                case 3:
                    c = logar(sc);
                    if (c != null) {
                        System.out.print("Valor: ");
                        Float valor = sc.nextFloat();
                        if (c.getConta().sacar(valor))
                            System.out.println("Saque realizado com sucesso.");
                        else
                            System.out.println("Erro ao realizar o saque.");
                    }
                    break;
                case 4:
                    c = logar(sc);
                    if (c != null) {
                        System.out.print("Valor: ");
                        Float valor = sc.nextFloat();
                        if (c.getConta().depositar(valor))
                            System.out.println("Deposito realizado com sucesso.");
                        else
                            System.out.println("Erro ao realizar o saque.");
                    }
                    break;
                case 5:
                    c = logar(sc);
                    if (c != null) {
                        System.out.print("Num conta destino: ");
                        int n = sc.nextInt();
                        System.out.print("Valor: ");
                        Float valor = sc.nextFloat();
                        Conta temp = buscaConta(n);
                        if (temp != null)
                            c.getConta().transferir(valor,temp);
                        else
                            System.out.println("Conta destino inexistente!");
                    }
                    break;
                case 6:
                    for (int i=0;i<Cliente.getCt();i++) {
                        System.out.println(clientes[i].getDadosConta());
                    }
                case 7:
                    System.out.println("\n=== Clientes Negativados: ===");
                    for(int i=0; i < Cliente.getCt(); i++){
                        if(clientes[i].getConta().ehNegativo()){
                            System.out.println(clientes[i].getDadosConta());
                        }
                    }
                    break;
                    
                case 8:
                    System.out.println("\nEntre com a faixa etaria: ");
                    System.out.println("De: ");
                    int idade1 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ate: ");
                    int idade2 = sc.nextInt();
                    sc.nextLine();
                    for(int i=0; i < Cliente.getCt(); i++){
                        if(clientes[i].getIdade() >= idade1 && clientes[i].getIdade() <= idade2){
                            System.out.println(clientes[i].getDadosConta());
                        }
                    }
                    break;
            }
        }
    }
}