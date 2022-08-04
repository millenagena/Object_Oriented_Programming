/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contatosPackage;

import java.util.ArrayList;

/**
 *
 * @author millena
 */
public class GestaoContatos {
    
    static ArrayList<Contato> familia = new ArrayList<>();
    static ArrayList<Contato> amigos = new ArrayList<>();
    static ArrayList<Contato> profissional = new ArrayList<>();
    
    public void adicionaContato(Contato c, ArrayList<Contato> array){
        array.add(c);
    }
    
    public void eliminaContato(String nomeContato) throws ContatoNaoEncontradoException{
        int aux = 0;        
        for(Contato c: familia){
            if(c.getNome().equalsIgnoreCase(nomeContato)){
                familia.remove(c);
                aux = 1;
                break;
            }
        }
        if(aux == 0){
            for(Contato c: amigos){
                if(c.getNome().equalsIgnoreCase(nomeContato)){
                    amigos.remove(c);
                    aux = 1;
                    break;
                }
            }
        }
        if(aux == 0){
            for(Contato c: profissional){
                if(c.getNome().equalsIgnoreCase(nomeContato)){
                    profissional.remove(c);
                    aux = 1;
                    break;
                }
            }
        }
        if(aux == 0){
            throw new ContatoNaoEncontradoException("Contato nao encontrado!");
        }
    }
    
    public void listaContatos(ArrayList<Contato> lista){
        for(Contato c: lista){
            System.out.println(c + "\n");
        }
    }

    @Override
    public String toString() {
        return "GestaoContatos{" + 
                "\nfamilia=" + familia + 
                "\namigos=" + amigos + 
                "\nprofissional=" + profissional + '}';
    }
    
    public Contato maisVelho(ArrayList<Contato> listaContatos) throws NullPointerException{
        
        if (listaContatos == null){
            throw new NullPointerException("Lista nula!");
        }
        
        Contato maisVelho = listaContatos.get(0);
        for(Contato c: listaContatos){
            if(c.getIdade() > maisVelho.getIdade()){
                maisVelho = c;
            }
        }
        return maisVelho;
    }
    
    public Contato maisNovo(ArrayList<Contato> listaContatos) throws NullPointerException{
        
        if (listaContatos == null){
            throw new NullPointerException("Lista nula!");
        }
        
        Contato maisNovo = listaContatos.get(0);
        for(Contato c: listaContatos){
            if(c.getIdade() < maisNovo.getIdade()){
                maisNovo = c;
            }
        }
        return maisNovo;
    }

    public static void setAmigos(ArrayList<Contato> amigos) {
        GestaoContatos.amigos = amigos;
    }

    public static void setFamilia(ArrayList<Contato> familia) {
        GestaoContatos.familia = familia;
    }

    public static void setProfissional(ArrayList<Contato> profissional) {
        GestaoContatos.profissional = profissional;
    }
   
    
}
