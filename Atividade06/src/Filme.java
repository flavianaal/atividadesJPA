/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Flaviana Andrade
 */
public class Filme {
    
    private String nomefilme;
    private String categoria;
    private double valorInicialFilme;

    public Filme() {
        this.valorInicialFilme = 4.00;
    }

    public Filme(String nomefilme, String categoria) {
        this.valorInicialFilme = 4.00;
        this.nomefilme = nomefilme;
        this.categoria = categoria;
        
    }
    
    public double valorTotalLocacao() {
        double valorLocacao = valorInicialFilme;
        //verifca ingnora a forma como categoria esta escrita se maiscula ou minuscula
        if (categoria.equalsIgnoreCase("infantil")) {
            valorLocacao += 2.00;  // Adiciona 2.00 ao valor inicial se a categoria for "infantil"
        } else if (categoria.equalsIgnoreCase("lancamento")) {
            valorLocacao += 3.00;
        } else if (categoria.equalsIgnoreCase("promocao")) {
            valorLocacao -= 2.00;
        }

        return valorLocacao;
    }
    
    public void imprimirDadosFilmes(){
        System.out.println("O nome do filme é: " + nomefilme);
        System.out.println("A categoria do filme é: " + categoria);
        System.out.println("o preço da Locação é: " + valorTotalLocacao() );
    }

    public String getNomefilme() {
        return nomefilme;
    }

    public void setNomefilme(String nomefilme) {
        this.nomefilme = nomefilme;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getValorInicialFilme() {
        return valorInicialFilme;
    }

    public void setValorInicialFilme(double valorInicialFilme) {
        this.valorInicialFilme = valorInicialFilme;
    }

    
    
    

    
}
