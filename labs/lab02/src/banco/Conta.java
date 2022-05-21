package banco;

public class Conta {    
    private static int ct = 0;
    private String tipo;
    private float saldo;
    private int num;
    
    void cadastraConta(String t, float s) {
        this.tipo = t;
        if (s >= 100)
            this.saldo = s;
        else
            this.saldo = s;
        this.num = ct;
        ct++;
    }
    
    String mostraSaldo() {
        return "O saldo da conta num "+num+", do tipo ("+tipo+") eh "+saldo+" reais.";
    }
    
    public boolean sacar(float valor) {
        saldo -= valor;
        return true;
    }
    
    public boolean depositar(float valor) {
        saldo += valor;
        return true;
    }
    
    public boolean ehNegativo() {
        return (saldo < 0);
    }
    
    public void transferir(float valor, Conta c) {
        if (sacar(valor)) {
            c.depositar(valor);
            System.out.println("Transferencia concluida.");
        } else
            System.out.println("Erro na operacao. Transferencia cancelada.");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static int getCt() {
        return ct;
    }

}