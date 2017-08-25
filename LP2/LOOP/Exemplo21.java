/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author joan-
 */
public class Exemplo21 {
     public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double num;
        double media;
        double soma = 0;
        
        for (int i=0; i<5; i++){
            
            System.out.println("Digite um número");
            num = scan.nextInt();
            
            soma += num;
        }
        
        media = soma / 5;
        
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %f",media);
    }
}
