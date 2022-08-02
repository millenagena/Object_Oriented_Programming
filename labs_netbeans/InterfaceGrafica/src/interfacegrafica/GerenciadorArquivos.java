/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author millenagena
 */
public class GerenciadorArquivos {	
    
    public static ArrayList<Cliente> leArquivoTxt(String arq) {
    String linha;
    BufferedReader arquivo = null; //Objeto leitor
    ArrayList<Cliente> ret = new ArrayList<>();
    try{
        arquivo = new BufferedReader(new FileReader(new File(arq)));
        //Instanciação do objeto leitor
        while((linha = arquivo.readLine()) != null) {
            String info[] = linha.split(";");
            if ((info != null)&&(info.length != 0)) {
                Boolean noticias = info[7].equals("true");
                Cliente c = new Cliente(info[0], info[1], info[2],
                                        info[3], info[4],
                                        Integer.parseInt(info[5]),
                                        info[6], noticias);
                ret.add(c);
            }
        }
       arquivo.close(); //fechamento do arquivo
       }catch (java.io.IOException e) {
               System.out.println("File error: " + e.toString());
       }
    return ret;
}

    public static void escreveArquivoTxt(ArrayList<Cliente> c, String arquivo) {

        BufferedWriter escritor = null; //objeto escritor
        try{
            escritor = new BufferedWriter(new FileWriter(new File(arquivo)));
            for (Cliente ct : c) {
                escritor.write(ct.getNome()+";" + ct.getCpf()+";" + 
                               ct.getEmail()+";"+ ct.getDataNascimento() + ";" + 
                               ct.getSexo() + ";" + ct.getNumeroConta() + ";" + 
                               ct.getSenha() + ";" + ct.getNoticias() + "\n");
            }
            escritor.flush(); //descarga do buffer de escrita
            escritor.close(); //fechamento do arquivo
        } catch(IOException e){
            e.getMessage();
        }

    } 
}