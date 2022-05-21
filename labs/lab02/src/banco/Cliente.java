package banco;

public class Cliente {
    private static int ct = 0;
    private String nome, CPF, telefone;
    private int idade;
    private Conta conta;
    private String usr,sen;
    
    void cadastraCliente(String n, String cpf, String t, int i, String u, String s, Conta c) {
        this.nome = n;
        this.CPF = cpf;
        this.telefone = t;
        this.idade = i;
        this.usr = u;
        this.sen = s;
        this.conta = c;
        ct++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getSen() {
        return sen;
    }

    public void setSen(String sen) {
        this.sen = sen;
    }
    
    public String getDadosConta(){
        String r = "";
        r += nome + " ";
        r += conta.getNum() + " ";
        r += conta.getSaldo() + " ";
        r += idade + " anos";
        return r;
    }

    public static int getCt() {
        return ct;
    }    
}