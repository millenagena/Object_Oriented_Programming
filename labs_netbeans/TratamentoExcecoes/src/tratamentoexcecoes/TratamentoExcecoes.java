/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamentoexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author millena
 */
public class TratamentoExcecoes {

    public static void main(String[] args) {
        
        int cont=0;
        Float valor=null;
        while(cont < 3){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("Entre com um valor Float: ");
                valor = sc.nextFloat();
                sc.nextLine();
                break;
            }catch(InputMismatchException e){
                System.out.println("\nFormato invalido");
                System.out.println("Entre com um valor valido!");
                cont++;
            } 
            
        }
        if(cont == 3){
            System.out.println("NUMERO MAXIMO DE TENTATIVAS EXCEDIDO");
        }else{
            System.out.println("Numero informado: " + valor);
        }
        
    }
    
}
