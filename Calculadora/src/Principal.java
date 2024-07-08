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
        // Criar uma instância da Calculadora
        Calculadora calculadora = new Calculadora();

        // Testar o método somar
        calculadora.somar(5, 3);
        System.out.println("Soma: " + calculadora.getResultado()); // Resultado esperado: 8

        // Testar o método dividir
        calculadora.setNumero1(10);
        calculadora.setNumero2(2);
        calculadora.dividir();
        System.out.println("Divisão: " + calculadora.getResultado()); // Resultado esperado: 5

        // Testar o método multiplicar
        double resultadoMultiplicacao = calculadora.multiplicar(4, 3);
        System.out.println("Multiplicação: " + resultadoMultiplicacao); // Resultado esperado: 12

        // Testar o método subtrair
        calculadora.setNumero1(10);
        calculadora.setNumero2(7);
        calculadora.subtrair();
        System.out.println("Subtração: " + calculadora.getResultado()); // Resultado esperado: 3

    }
}

