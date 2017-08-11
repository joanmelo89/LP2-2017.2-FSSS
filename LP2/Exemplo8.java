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
public class Exemplo8 {
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
        double pagouINSS;
        pagouINSS = salario * 0.08;
        double pagouSind;
        pagouSind = salario * 0.05;
        double impostoRenda = salario * 0.11;
        double salarioLiquido;
        salarioLiquido = salario - pagouINSS - impostoRenda - pagouSind;
        System.out.printf("Salario bruto: R$ %.2f \n", salario);
        System.out.printf("Pagamento INSS: R$ %.2f \n", pagouINSS);
        System.out.printf("Pagamento Sindicato: R$ %.2f \n", pagouSind);
        System.out.printf("Salário Líquido: R$ %.2f \n", salarioLiquido);
        
    }
    
}
