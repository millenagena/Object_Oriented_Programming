package salario;

import java.io.*;
import java.util.ArrayList;

public class RegistroSalario {
    
    public static ArrayList<Funcionario> leArquivoBin(String arquivo) {
        ObjectInputStream leitorObj = null;
        FileInputStream leitorArquivo = null;
        ArrayList<Funcionario> ret = new ArrayList<>();
        try {
            leitorArquivo = new FileInputStream(arquivo);
            leitorObj = new ObjectInputStream(leitorArquivo);
            boolean haRegistros = true;
            while (haRegistros) {
                try {
                	Funcionario c = (Funcionario)leitorObj.readObject();
                    ret.add(c);
                } catch(EOFException e) {
                    haRegistros = false;
                }
            }
        } catch (Exception ex) {
                System.out.println(ex.getMessage());
        } finally {
                try {
                        if (leitorArquivo != null) leitorArquivo.close();
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
        }
        return ret;
    }
    
    public static void escreveArquivoBin(String arquivo, ArrayList<Funcionario> c) {
        FileOutputStream escritorArquivo = null;
        ObjectOutputStream escritorObj = null;
        try {
            escritorArquivo = new FileOutputStream(arquivo);
            escritorObj = new ObjectOutputStream(escritorArquivo);
            //escritorObj.writeObject(c); // SALVA O ARRAYLIST INTEIRO
            for (Funcionario ct : c) //SALVA OS ELEMENTOS DO ARRAYLIST SEPARADAMENTE
                escritorObj.writeObject((Funcionario)ct); //Tem que implementar a interface Serializable!
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (escritorArquivo != null) escritorArquivo.close();
            } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
        }

    }
    
    public static void main(String[] args) {
        ArrayList<Funcionario> funBruto = new ArrayList<>();
        funBruto.add(new Funcionario("111111",2500.00));
        funBruto.add(new Funcionario("222222",6600.00));
        funBruto.add(new Funcionario("333333",3250.90));
                
        ArrayList<Funcionario> funDesc = new ArrayList<>();
        funDesc.add(new Funcionario("111111", 500.00));
        funDesc.add(new Funcionario("333333", 600.00));
        funDesc.add(new Funcionario("222222", 250.90));
        
        // criando os arquivos com as informações acima
        escreveArquivoBin("salbruto.dat",funBruto);
        escreveArquivoBin("desc.dat",funDesc);
        
        // UTILIZANDO ARQUIVOS BINARIOS
        ArrayList<Funcionario> salBruto = leArquivoBin("salbruto.dat");
        ArrayList<Funcionario> desc = leArquivoBin("desc.dat");
        ArrayList<Funcionario> salLiquido = null;
        
        
        for(Funcionario funcSalario: salBruto) {
        	for(Funcionario funcDesconto: desc) {
        		if(funcSalario.getCpf().equals(funcDesconto.getCpf()) ) {
        			salLiquido.add(new Funcionario(funcSalario.getCpf(), (funcSalario.getValor()-funcDesconto.getValor())) );
        		}
        	}
        }
        
        //UTILIZANDO ARQUIVOS TEXTO
        //escreveArquivoTxt("contas.txt",cs);        
        //ArrayList<Conta> cs2 = leArquivoTxt("contas.txt");
        //System.out.println(cs2);
	}
}
