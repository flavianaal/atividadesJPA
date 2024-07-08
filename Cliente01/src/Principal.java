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
        Cliente cliente = new Cliente("Jose", "Masculino", "111.111.111-11", "(99)99999-9999", 1994);
        cliente.imprimirDadosClientes();
        System.out.println("A idade do Cliente é: " + cliente.calcularIdade());
        cliente.verificarMaiorMenorIdade();
        
        Cliente cliente1 = new Cliente("Maria", "Feminino", "111.111.111-11", "(99)99999-9999", 2014);
        cliente1.imprimirDadosClientes();
        System.out.println("A idade do Cliente é: " + cliente1.calcularIdade());
        cliente1.verificarMaiorMenorIdade();
    }
    
}
