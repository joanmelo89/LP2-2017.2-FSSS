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
import javax.swing.JOptionPane;
public class Exemplo13 {
    public static void main(String[] args) {
        String vh;
        String qtd;
        
        vh = JOptionPane.showInputDialog("Digite o valor por hora:");
        qtd = JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:");
        
        double valorHora = Double.parseDouble(vh);
        double quantidadeHoras = Double.parseDouble(qtd);
        
        double salarioBruto = valorHora * quantidadeHoras;
        
        if(salarioBruto <= 900){
                double inss = salarioBruto * 0.1;
                double fgts = salarioBruto * 0.11;
                double sindicato = salarioBruto * 0.03;
                double desconto = inss + sindicato;
                double salarioLiquido = salarioBruto - desconto;
                String msg;
                msg = "O valor do IR é isento.\n O valor do salario bruto é: R$ "+salarioBruto+".\n O desconto do INSS é: R$ "+inss+".\n O valor do FGTS depositado é: R$ "+fgts+".\n O total de descontos é: R$ "+desconto+".\n O valor do salário líquedo é: R$ "+salarioLiquido;
                JOptionPane.showMessageDialog(null, msg);
                
        }
        if(salarioBruto > 900 && salarioBruto <= 1500){
                double ir = salarioBruto * 0.05;
                double inss = salarioBruto * 0.1;
                double fgts = salarioBruto * 0.11;
                double sindicato = salarioBruto * 0.03;
                double desconto = inss + sindicato;
                double salarioLiquido = salarioBruto - desconto;
                String msg;
                msg = "O valor do IR é: R$ "+ir+".\n O valor do salario bruto é: R$ "+salarioBruto+".\n O desconto do INSS é: R$ "+inss+".\n O valor do FGTS depositado é: R$ "+fgts+".\n O total de descontos é: R$ "+desconto+".\n O valor do salário líquedo é: R$ "+salarioLiquido;
                JOptionPane.showMessageDialog(null, msg);
                
        }
        if(salarioBruto > 1500 && salarioBruto <= 2500){
                double ir = salarioBruto * 0.1;
                double inss = salarioBruto * 0.1;
                double fgts = salarioBruto * 0.11;
                double sindicato = salarioBruto * 0.03;
                double desconto = inss + sindicato;
                double salarioLiquido = salarioBruto - desconto;
                String msg;
                msg = "O valor do IR é: R$ "+ir+".\n O valor do salario bruto é: R$ "+salarioBruto+".\n O desconto do INSS é: R$ "+inss+".\n O valor do FGTS depositado é: R$ "+fgts+".\n O total de descontos é: R$ "+desconto+".\n O valor do salário líquedo é: R$ "+salarioLiquido;
                JOptionPane.showMessageDialog(null, msg);
                
        }
        if(salarioBruto > 2500){
                double ir = salarioBruto * 0.2;
                double inss = salarioBruto * 0.1;
                double fgts = salarioBruto * 0.11;
                double sindicato = salarioBruto * 0.03;
                double desconto = inss + sindicato;
                double salarioLiquido = salarioBruto - desconto;
                String msg;
                msg = "O valor do IR é: R$ "+ir+".\n O valor do salario bruto é: R$ "+salarioBruto+".\n O desconto do INSS é: R$ "+inss+".\n O valor do FGTS depositado é: R$ "+fgts+".\n O total de descontos é: R$ "+desconto+".\n O valor do salário líquedo é: R$ "+salarioLiquido;
                JOptionPane.showMessageDialog(null, msg);
                
        }
    }
}
