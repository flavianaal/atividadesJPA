package Exemplo.crud;

import Modelo.Jogador;
import Modelo.Selecao;
import Utilitario.JpaUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;


public class CadastarJogador {

    public static void main(String[] args) {
        // Criando as seleções
        Selecao selecao = new Selecao();
        selecao.setNomeSelecao("Brasil");

        Selecao selecao1 = new Selecao();
        selecao1.setNomeSelecao("Argentina");

        Selecao selecao2 = new Selecao();
        selecao2.setNomeSelecao("Alemanha");

        Selecao selecao3 = new Selecao();
        selecao3.setNomeSelecao("França");
        // Criando os jogadores
        Jogador jogador = new Jogador();
        jogador.setNome("Endrick");
        jogador.setNumeroCamisa("10");
        jogador.setPosicao("Atacante");
        jogador.setSelecao(selecao);

        Jogador jogador1 = new Jogador();
        jogador1.setNome("Messi");
        jogador1.setNumeroCamisa("10");
        jogador1.setPosicao("Atacante");
        jogador1.setSelecao(selecao1);

        Jogador jogador2 = new Jogador();
        jogador2.setNome("Tony Cross");
        jogador2.setNumeroCamisa("35");
        jogador2.setPosicao("Meia");
        jogador2.setSelecao(selecao2);
        
        
        Jogador jogador3 = new Jogador();
        jogador3.setNome("Mbappé");
        jogador3.setNumeroCamisa("11");
        jogador3.setPosicao("Atacante");
        jogador3.setSelecao(selecao3);

        // Adicionando jogadores às suas respectivas seleções
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(jogador);
        jogadores.add(jogador1);
        jogadores.add(jogador2);
        jogadores.add(jogador3);

        // Imprimindo as informações dos jogadores
//        jogador.imprimirInformaçoesJagador();
//        jogador1.imprimirInformaçoesJagador();
//        jogador2.imprimirInformaçoesJagador();

        // Persistindo dados no banco de dados
        
        EntityManager em = JpaUtil.conexao();

        em.getTransaction().begin();

        em.persist(selecao);
        em.persist(selecao1);
        em.persist(selecao2);
        em.persist(selecao3);
        
        
        for (Jogador j : jogadores) {
            em.persist(j);
            
        }
        

        em.getTransaction().commit();
        JpaUtil.fecharConexao();
    }
}
