/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import entidades.Lista;
import java.util.Scanner;

/**
 *
 * @author talis
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
         Lista[] entrada = new Lista[10];

        System.out.print("Quantidades de Quartos a Alugar: ");
        int n = input.nextInt();

       

        for (int i = 0; i < n; i++) {

            System.out.print("Aluguel #" + (i + 1) + "\nName: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Quarto Número: ");
            int numero = input.nextInt();
            entrada[numero] = new Lista(name, email);
        }
        
        System.out.println("Ordem de Quartos: ");
        
        for(int i=0;i<10;i++){
        
            if(entrada[i] != null){
            
                System.out.println( i + ":  " + entrada[i]);
            }
        }
        input.close();

    }

}
