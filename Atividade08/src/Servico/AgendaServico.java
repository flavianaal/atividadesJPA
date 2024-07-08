package Servico;

import Modelo.Agenda;
import Modelo.Pessoa;
import java.util.ArrayList;

public class AgendaServico {

    private Agenda agenda;

    public AgendaServico() {
        this.agenda = new Agenda(); 
    }

    public AgendaServico(Agenda agenda) {
        this.agenda = agenda;
        if (this.agenda.getPessoas() == null) {
            this.agenda.setPessoas(new ArrayList<>()); 
        }
    }

    public void armazenarPessoas(String nome, int idade, double altura) {
        if (this.agenda == null) {
            this.agenda = new Agenda();
        }
        if (this.agenda.getPessoas() == null) {
            this.agenda.setPessoas(new ArrayList<>());
        }
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        this.agenda.getPessoas().add(pessoa);
    }

    public void imprimirAgenda() {
        if (this.agenda != null && this.agenda.getPessoas() != null) {
            for (Pessoa pessoa : this.agenda.getPessoas()) {
                System.out.println(pessoa.getNome());
            }
        }
    }

    public void removerPessoa(String nome) {
        if (this.agenda != null && this.agenda.getPessoas() != null) {
            for (int i = 0; i < this.agenda.getPessoas().size(); i++) {
                Pessoa pessoa = this.agenda.getPessoas().get(i);
                if (pessoa.getNome().equals(nome)) {
                    this.agenda.getPessoas().remove(pessoa);
                    return; 
                }
            }
            System.out.println("Pessoa não encontrada");
        }
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
        if (this.agenda.getPessoas() == null) {
            this.agenda.setPessoas(new ArrayList<>());
        }
    }
}
