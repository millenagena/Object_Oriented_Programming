package primeiraAula;

import java.util.Scanner;

public class Principal {
        public static void main(String[] args){
                
        System.out.println("Informe os dados do cliente: \n");
        Scanner scan = new Scanner(System.in);
        String nome = scan.next();
        String cpf = scan.next();
        Integer idade = scan.nextInt();
        String telefone = scan.next();
        
        Cliente cliente1 = new Cliente();
        cliente1.CadastroCliente(nome, cpf, idade, telefone);
        cliente1.MostrarDadosCliente();
        scan.close();
        
    }
}

