/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaodecontatos;

import java.util.ArrayList;

/**
 *
 * @author millena
 */
public class GestaoContatos {
    
    ArrayList<Contato> familia = new ArrayList<>();
    ArrayList<Contato> amigos = new ArrayList<>();
    ArrayList<Contato> profissional = new ArrayList<>();
    
    public void adicionaContato(Contato c, ArrayList<Contato> array){
        array.add(c);
    }

    
}
