//ESSE CODIGO CONTEM AS SUGESTOES DE 3 QUESTOES SOBRE AGENDA


package io.programe.modelo;


import javax.swing.JOptionPane;


public class Agenda {
    private String nome;
    private Contato contato;
    private String rua;
    private String bairro;
    private String CEP;
    private String cidade;
    
    
     public Agenda() {
    }

    public Agenda(String nome, Contato contato, String rua, String bairro, String CEP, String cidade) {
        this.nome = nome;
        this.contato = contato;
        this.rua = rua;
        this.bairro = bairro;
        this.CEP = CEP;
        this.cidade = cidade;
    }
    
    public void imprimirDados(){
        JOptionPane.showMessageDialog(null, "nome=" + nome + ", contato=" + contato + ", rua=" + rua + ", bairro=" + bairro + ", CEP=" + CEP + ", cidade=" + cidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Agenda{" + "nome=" + nome + ", contato=" + contato + ", rua=" + rua + ", bairro=" + bairro + ", CEP=" + CEP + ", cidade=" + cidade + '}';
    }

   
     
     
    
    


    
    
    
    
    
    
}
