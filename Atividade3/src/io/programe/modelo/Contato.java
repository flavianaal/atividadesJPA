

package io.programe.modelo;

import javax.swing.JOptionPane;


public class Contato {
    
    private String tipo;
    private String telefone;

    public Contato() {
    }

    public Contato(String tipo, String telefone) {
        this.tipo = tipo;
        this.telefone = telefone;
    }
    
    
    public void imprimirDadosContato(){
        
        JOptionPane.showMessageDialog(null, "Tipo de Contato - " + tipo + ", telefone=" + telefone);
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" + "tipo=" + tipo + ", telefone=" + telefone + '}';
    }
    
    
    
    
}
