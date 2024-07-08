package io.programe.visao;


import io.programe.modelo.Agenda;
import io.programe.modelo.Contato;


public class Principal {
    
    public static void main(String[] args) {
        
        Agenda a = new Agenda();
        a.setNome("Flaviana");
        
        a.setBairro("Manoel Alves Mota");
        a.setRua("João vilar de Sousa");
        a.setCidade("Tauá");
        a.imprimirDados();
        
       
        Contato c = new Contato();
        c.setTipo("Celular");
        c.setTelefone("(88) 981539220");
        c.imprimirDadosContato();
        
        
    }
    
}
