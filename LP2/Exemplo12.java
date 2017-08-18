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
public class Exemplo12 {
    public static void main(String[] args) {
        String salario;
        
        salario = JOptionPane.showInputDialog("Entre com vaor do salário:");
        double salario2 = Double.parseDouble(salario);
        if(salario2 <= 280){
           double novoSalario = salario2 + salario2 * 0.2;
           String msg1;
           msg1 = "O salário antes do reajuste é : "+salario2;
           JOptionPane.showMessageDialog(null, msg1);
           String msg2;
           msg2 = "O salário com reajuste é : "+novoSalario;
           JOptionPane.showMessageDialog(null, msg2);
           double valorAumento = novoSalario - salario2;
           String msg3;
           msg3 = "O salário com reajuste é : "+valorAumento;
           JOptionPane.showMessageDialog(null, msg3);
        }
        if(salario2 > 280 && salario2 <= 700){
           double novoSalario = salario2 + salario2 * 0.15;
            String msg1;
           msg1 = "O salário antes do reajuste é : "+salario2;
           JOptionPane.showMessageDialog(null, msg1);
           String msg2;
           msg2 = "O salário com reajuste é : "+novoSalario;
           JOptionPane.showMessageDialog(null, msg2);
           double valorAumento = novoSalario - salario2;
           String msg3;
           msg3 = "O salário com reajuste é : "+valorAumento;
           JOptionPane.showMessageDialog(null, msg3);
        }
        if(salario2 > 700 && salario2 <= 1500){
           double novoSalario = salario2 + salario2 * 0.1;
           String msg1;
           msg1 = "O salário antes do reajuste é : "+salario2;
           JOptionPane.showMessageDialog(null, msg1);
           String msg2;
           msg2 = "O salário com reajuste é : "+novoSalario;
           JOptionPane.showMessageDialog(null, msg2);
           double valorAumento = novoSalario - salario2;
           String msg3;
           msg3 = "O salário com reajuste é : "+valorAumento;
           JOptionPane.showMessageDialog(null, msg3);
        }
        if(salario2 > 1500){
           double novoSalario = salario2 + salario2 * 0.05;
            String msg1;
           msg1 = "O salário antes do reajuste é : "+salario2;
           JOptionPane.showMessageDialog(null, msg1);
           String msg2;
           msg2 = "O salário com reajuste é : "+novoSalario;
           JOptionPane.showMessageDialog(null, msg2);
           double valorAumento = novoSalario - salario2;
           String msg3;
           msg3 = "O salário com reajuste é : "+valorAumento;
           JOptionPane.showMessageDialog(null, msg3);
        }
    }
    
    
}
