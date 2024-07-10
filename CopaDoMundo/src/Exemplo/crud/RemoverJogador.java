
package Exemplo.crud;

import Modelo.Jogador;
import Utilitario.JpaUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author Flaviana Andrade
 */
public class RemoverJogador {
    
    public static void main(String[] args) {
        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
        
        Jogador jogador = em.find(Jogador.class, 4L);
        //System.out.println(jogador);
        jogador.setPosicao("Zagueiro");
        em.remove(jogador);
        
        em.getTransaction().commit();
        JpaUtil.fecharConexao();
    }
    
}
