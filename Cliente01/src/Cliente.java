
import java.util.Calendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Flaviana Andrade
 */
public class Cliente {
    
    private String nome;
    private String sexo;
    private String cpf;
    private String telefone;
    private int anoNascimento;

    public Cliente() {
    }

    public Cliente(String nome, String sexo, String cpf, String telefone, int anoNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.telefone = telefone;
        this.anoNascimento = anoNascimento;
    }

    //Metodo para imprimir as informações do cliente
    public void imprimirDadosClientes(){
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        
    }
    
    //Metodo para calcular a idade do cliente
    public int calcularIdade(){
        Calendar dataAtual = Calendar.getInstance();
        int anoAtual = dataAtual.get(Calendar.YEAR);
        return anoAtual - anoNascimento;
        
    }
    
    //Metodo para verificar a idade do clientee dizer se ele e maior ou menor de idade
    public void verificarMaiorMenorIdade(){
        int idade = calcularIdade();
        if ( idade >= 18) {
            System.out.println("O cliente é maior de idade.");
        } else {
            System.out.println("O cliente é menor de idade.");
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    
    
    
}
