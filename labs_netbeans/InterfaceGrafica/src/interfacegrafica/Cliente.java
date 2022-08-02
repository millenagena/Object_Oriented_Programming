/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica;

/**
 *
 * @author mille
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String dataNascimento;
    private String sexo;
    private Integer numeroConta;
    private String senha;
    private Boolean noticias;

    public Cliente(String nome, String cpf, String email, String dataNascimento, 
                   String sexo, Integer numeroConta, String senha, 
                   Boolean noticias) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.noticias = noticias;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public String getSenha() {
        return senha;
    }

    public Boolean getNoticias() {
        return noticias;
    }
    
    
    
}
