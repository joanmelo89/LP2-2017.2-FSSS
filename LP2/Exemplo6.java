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
public class Exemplo6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorHora;
        double horas;
        double salario;
        System.out.println("Informa o valor recebido por hora:");
        valorHora = input.nextDouble();
        System.out.println("Quantas horas foram trabalhadas no mês?");
        horas = input.nextDouble();
        salario = valorHora * horas;
        
        System.out.printf("O valor do salário no total é: R$ %.2f",salario);
    }
}
