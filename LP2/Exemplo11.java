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
public class Exemplo11 {
    public static void main(String[] args) {
        String n1;
        String n2;
        String n3;
        
        n1 = JOptionPane.showInputDialog("Entre com a primeira nota:");
        n2 = JOptionPane.showInputDialog("Entre com a segunda nota:");
        n3 = JOptionPane.showInputDialog("Entre com a terceira nota:");
        
        double nota1 = Double.parseDouble(n1);
        double nota2 = Double.parseDouble(n2);
        double nota3 = Double.parseDouble(n3);
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        if(media > 7){
            String msg;
            msg = "Aluno aprovado com média: "+media;
            JOptionPane.showMessageDialog(null, msg);
        }
        if(media < 7){
            String msg;
            msg = "Aluno reprovado com média: "+media;
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
