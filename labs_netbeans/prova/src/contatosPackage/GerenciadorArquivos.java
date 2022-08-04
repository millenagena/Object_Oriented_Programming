/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contatosPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author millenagena
 */
public class GerenciadorArquivos {	
    
    public static ArrayList<Contato> leArquivoTxt(String arq) throws FileNotFoundException{
    String linha;
    BufferedReader arquivo = null; //Objeto leitor
    ArrayList<Contato> ret = new ArrayList<>();
    try{
        arquivo = new BufferedReader(new FileReader(new File(arq)));
        //Instanciação do objeto leitor
        while((linha = arquivo.readLine()) != null) {
            String info[] = linha.split(";");
            if ((info != null)&&(info.length != 0)) {
                Contato c = new Contato(info[0], 
                                        Integer.parseInt(info[1]), 
                                        info[2], info[3],
                                        info[4], info[5]);
                ret.add(c);
            }
        }
       arquivo.close(); //fechamento do arquivo
    }catch (java.io.IOException e) {
        System.out.println("File error: " + e.toString());
    }
    return ret;
}

    public static void escreveArquivoTxt(ArrayList<Contato> c, String arquivo) {

        BufferedWriter escritor = null; //objeto escritor
        try{
            escritor = new BufferedWriter(new FileWriter(new File(arquivo)));
            for (Contato ct : c) {
                escritor.write(ct.getNome()+";" + ct.getIdade()+";" + 
                               ct.getSexo()+";"+ ct.getProfissao() + ";" + 
                               ct.getTelefone() + ";" + ct.getEmail() + "\n");
            }
            escritor.flush(); //descarga do buffer de escrita
            escritor.close(); //fechamento do arquivo
        } catch(IOException e){
            e.getMessage();
        }

    } 
}