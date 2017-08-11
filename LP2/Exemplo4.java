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
public class Exemplo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double largura;
        double comprimento;
        double area;
        
        System.out.println("Digite o valor do comprimento do terreno:");
        comprimento = input.nextDouble();
        System.out.println("Digite o valor da largura do terreno:");
        largura = input.nextDouble();
        
        area = comprimento * largura;
        System.out.printf("O valor da área do terreno é: %.2f",area);
        
    }
}
