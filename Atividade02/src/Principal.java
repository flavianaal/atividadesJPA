/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Flaviana Andrade
 */
public class Principal {
    
    public static void main(String[] args) {
        Produto produto = new Produto("Canetas Bic", 10, 50);
        produto.imprimirDetalhesProduto();
        System.out.println("O valor do desconto é de: " + produto.valorComDesconto());
        
    }
    
}
