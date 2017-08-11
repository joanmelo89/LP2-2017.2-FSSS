/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.pkg2017.pkg2;

/**
 *
 * @author joan-
 */
import java.util.Scanner;
public class Exemplo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double media;
        System.out.println("Digite a primeira nota:");
        nota1 = input.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = input.nextDouble();
        System.out.println("Digite a terceira nota:");
        nota3 = input.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.printf("O valor da média é: %.2f",media);
    }
}
