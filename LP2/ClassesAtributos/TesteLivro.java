/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAtributos;

/**
 *
 * @author joan-
 */
public class TesteLivro {
     public static void main(String[] args){
        
        Livro livro = new Livro();
        
        livro.nome = "Java - FSSS";
        livro.autor = "Joan Melo";
        livro.anoLancamento = 2017;
        
        System.out.println("Nome do livro = " + livro.nome);
    }
}
