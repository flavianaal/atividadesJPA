/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visao;

import Servico.AgendaServico;



/**
 *
 * @author Flaviana Andrade
 */
public class Principal {
    
    public static void main(String[] args) {
        
       AgendaServico agendaServico = new AgendaServico();
       agendaServico.armazenarPessoas("Ana", 15, 1);
       agendaServico.armazenarPessoas("Pedro", 30, 2);
       agendaServico.armazenarPessoas("Maria", 20, 1);
       
       agendaServico.removerPessoa("Pedro");
       agendaServico.imprimirAgenda();
       
       
        
        
    }
    
}