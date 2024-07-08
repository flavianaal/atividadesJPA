/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Flaviana Andrade
 */
public class Produto {
    
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeProduto;

    public Produto() {
    }
    
    
    public Produto(String nomeProduto, double precoProduto, int quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }
    
    //Metodo para calcular o valor total
    public double valorTotal() {
        return quantidadeProduto * precoProduto;
    }
    
    // Método para imprimir os detalhes do produto e o valor total
    public void imprimirDetalhesProduto() {
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("A quantidade de podutos comprados é de: " + quantidadeProduto);
        System.out.println("O Preço do Produto é de : " + precoProduto);
        System.out.println("Valor Total a Pagar: R$ " + valorTotal() );
    }
    // Método para calcular o valor total a ser pago com desconto
    public double valorComDesconto() {
        double resultado;
        if (quantidadeProduto <= 10) {
            resultado = valorTotal();
        } else if (quantidadeProduto > 10 && quantidadeProduto <= 20) {
            resultado = valorTotal() - (valorTotal() * 0.10);
        } else if (quantidadeProduto > 20 && quantidadeProduto <= 50) {
            resultado = valorTotal() - (valorTotal() * 0.20);
        } else {
            resultado = valorTotal() - (valorTotal() * 0.25);
        }
        return resultado;
    }
    
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    
    

    
    
}
