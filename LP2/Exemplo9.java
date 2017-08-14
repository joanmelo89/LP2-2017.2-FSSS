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
public class Exemplo9 {
    public static void main(String[] args) {
        String n1;
        String n2;
        
        //ENTRADA GRÁFICA DE VALORES
        n1 = JOptionPane.showInputDialog("Entro com o primeiro valor:");
        n2 = JOptionPane.showInputDialog("Entro com o segundo valor:");
        
       //Conversão de variáveis de String para DOUBLE
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        
        double soma;
        soma = num1 + num2;
        
        //Apresentação da mensagem ao usuário
        String msg;
        msg = "O resultado da soma é: "+soma;
        JOptionPane.showMessageDialog(null, msg);
        
        
    }
}
