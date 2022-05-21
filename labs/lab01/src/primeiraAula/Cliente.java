package primeiraAula;

public class Cliente {
    
    public String nome;
    public String cpf;
    public int idade;
    public String telefone;

    public void CadastroCliente(String nome, String cpf, int idade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
    }
    
    public void MostrarDadosCliente(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Telefone: " + this.telefone);
    }
}
