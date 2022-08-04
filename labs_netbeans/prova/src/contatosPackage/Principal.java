/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contatosPackage;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author millena
 */
public class Principal {
    
    public static GestaoContatos g = new GestaoContatos();
    
    public static void main(String[] args) {
        
        try {
            ArrayList<Contato> familia = GerenciadorArquivos.leArquivoTxt("contatosFamilia.txt");
            ArrayList<Contato> amigos = GerenciadorArquivos.leArquivoTxt("contatosAmigos.txt");
            ArrayList<Contato> profissional = GerenciadorArquivos.leArquivoTxt("contatosProfissional.txt");
            
            GestaoContatos.setFamilia(familia);
            GestaoContatos.setAmigos(amigos);
            GestaoContatos.setProfissional(profissional);
            
        } catch (FileNotFoundException e) {
            System.out.println("!!!Arquivo nao encontrado!!!");
        } 
        
        
        new Menu().setVisible(true);
        
    }
}
