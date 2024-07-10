package Modelo;

import java.util.List;

public class Agenda {

    private String nome;
    private String descricao;
    private List<Pessoa> pessoas;

    public Agenda() {

    }

    public Agenda(String nome, String descricao, List<Pessoa> pessoas) {
        this.nome = nome;
        this.descricao = descricao;
        this.pessoas = pessoas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}
