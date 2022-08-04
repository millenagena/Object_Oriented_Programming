/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaodecontatos;

/**
 *
 * @author millena
 */
public class Contato {
    private String nome;
    private int idade;
    private String sexo;
    private String profissao;
    private String telefone;
    private String email;

    public Contato(String nome, int idade, String sexo, String profissao, String telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.profissao = profissao;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", profissao=" + profissao + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
    
}
