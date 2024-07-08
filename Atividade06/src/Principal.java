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
        
       
        Filme filme = new Filme("Filme Infantil", "infantil");
        Filme filme1 = new Filme("Filme de Lançamento", "lancamento");
        Filme filme2 = new Filme("Filme em Promoção", "promocao");
        Filme filme3 = new Filme("Filme Normal", "normal");
        
        
        filme.imprimirDadosFilmes();
        filme1.imprimirDadosFilmes();
        filme2.imprimirDadosFilmes();
        filme3.imprimirDadosFilmes();
        
        
    }
    
}
