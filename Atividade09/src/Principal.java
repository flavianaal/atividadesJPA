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
        
         // Criar um elevador
        Elevador elevador = new Elevador();

        // Inicializar o elevador com capacidade para 5 pessoas e 10 andares
        elevador.inicializar(5, 10);

        // Mostrar o estado inicial do elevador
        System.out.println(elevador);

        // Simular algumas operações
        elevador.entrar();
        elevador.entrar();
        elevador.subir();
        elevador.subir();
        elevador.sair();
        elevador.descer();

        // Mostrar o estado final do elevador
        System.out.println(elevador);
        
    }
    
}
