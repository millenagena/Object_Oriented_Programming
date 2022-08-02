/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentoexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mille
 */
public class TratamentoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        Double valor=0.0;
        Double[] vet = new Double[10];
        
        while(valor != -1){
            
            try{
                System.out.println("Informe o valor que deseja inserir: ");
                valor = sc.nextDouble();
                sc.nextLine();

                if(valor == -1)
                    break;

                System.out.println("Informe a posicao: ");
                pos = sc.nextInt();
                sc.nextLine();
                vet[pos] = valor;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\n!!!POSICAO INVALIDA!!!");
                break;
            }catch(InputMismatchException e1){
                System.out.println("\n!!!FORMATO INVALIDO!!!");
                break;
            }
            
        }
        System.out.println("\nPROGRAMA ENCERRADO");
        System.out.println("Vetor resultante: ");
        for(Double v: vet) {
            System.out.print(v + " ");
        }
    }
}
