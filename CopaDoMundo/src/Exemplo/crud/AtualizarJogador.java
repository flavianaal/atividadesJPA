/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo.crud;

import Modelo.Jogador;
import Utilitario.JpaUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author Flaviana Andrade
 */
public class AtualizarJogador {
    
    public static void main(String[] args) {
        
        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
        
        Jogador jogador = em.find(Jogador.class, 4L);
        //System.out.println(jogador);
        //jogador.setPosicao("Zagueiro");
        em.merge(jogador);
        
        em.getTransaction().commit();
        JpaUtil.fecharConexao();
        
        
        
    }
    
}
