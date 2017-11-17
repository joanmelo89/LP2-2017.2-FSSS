/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

/**
 *
 * @author joan-
 */
import java.util.Scanner;
public class Exre01 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor para fazer o somatório");
        int num = input.nextInt();
        System.out.println(Somatorio.somatorio(8));
    }
}
