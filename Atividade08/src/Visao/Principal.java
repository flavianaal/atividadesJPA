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
       agendaServico.armazenaPessoa("Ana", 15, 1);
       agendaServico.armazenaPessoa("Pedro", 30, 2);
       agendaServico.armazenaPessoa("Maria", 20, 1);
       
       agendaServico.removePessoa("Karla");
       agendaServico.imprimePessoa(0);
       agendaServico.buscaPessoa("Joâo");
       agendaServico.imprimeAgenda();
       
       
       
        
        
    }
    
}
