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
public class Exemplo7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double F;
        double C;
        
        System.out.println("Digite a temperatura em Farenheit");
        F = input.nextDouble();
        C = (5 * (F-32) / 9);
        
        System.out.printf("A temperatura em Celsius é: %.2f",C);
    }
}
