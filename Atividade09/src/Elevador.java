/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Flaviana Andrade
 */
public class Elevador {
    
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public Elevador() {
    }
    
    public Elevador(int andarAtual, int totalAndares, int capacidade, int pessoasPresentes) {
        this.andarAtual = 0;//Inicializa no terrio
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoasPresentes = 0; //Inicializa com 0 pessoas
    }
    
    // Método para inicializar o elevador com capacidade e total de andares
    public void inicializar(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }
    
    // Método para entrar uma pessoa no elevador
    public void entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou. Total de pessoas: " + pessoasPresentes);
        } else {
            System.out.println("Elevador cheio. Capacidade máxima: " + capacidade);
        }
    }

    // Método para sair uma pessoa do elevador
    public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu. Total de pessoas: " + pessoasPresentes);
        } else {
            System.out.println("Elevador vazio.");
        }
    }

    // Método para subir um andar
    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subiu para o andar " + andarAtual);
        } else {
            System.out.println("Já está no último andar.");
        }
    }

    // Método para descer um andar
    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu para o andar " + andarAtual);
        } else {
            System.out.println("Já está no térreo.");
        }
    }


    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        if (andarAtual >= 0 && andarAtual <= totalAndares) {
            this.andarAtual = andarAtual;
        } else {
            System.out.println("Andar inválido.");
        }
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        if (totalAndares >= 0) {
            this.totalAndares = totalAndares;
        } else {
            System.out.println("Total de andares inválido.");
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.andarAtual;
        hash = 41 * hash + this.totalAndares;
        hash = 41 * hash + this.capacidade;
        hash = 41 * hash + this.pessoasPresentes;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Elevador other = (Elevador) obj;
        if (this.andarAtual != other.andarAtual) {
            return false;
        }
        if (this.totalAndares != other.totalAndares) {
            return false;
        }
        if (this.capacidade != other.capacidade) {
            return false;
        }
        return this.pessoasPresentes == other.pessoasPresentes;
    }

    @Override
    public String toString() {
        return "Elevador{" + "andarAtual=" + andarAtual + ", totalAndares=" + totalAndares + ", capacidade=" + capacidade + ", pessoasPresentes=" + pessoasPresentes + '}';
    }
    
    
    
}
