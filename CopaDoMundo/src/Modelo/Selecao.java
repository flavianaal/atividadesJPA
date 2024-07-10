

package Modelo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

/**
 *
 * @author Flaviana Andrade
 */
@Entity
@Table
public class Selecao implements Serializable {
    
    @Id
    @SequenceGenerator(name="seq_selecao", sequenceName = "seq_selecao", initialValue = 1)
    @GeneratedValue(generator = "seq_selecao", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String nomeSelecao;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Jogador> jogadores;

    public Selecao() {
    }

    public Selecao(Long id, String nomeSelecao, List<Jogador> jogadores) {
        this.id = id;
        this.nomeSelecao = nomeSelecao;
        this.jogadores = jogadores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeSelecao() {
        return nomeSelecao;
    }

    public void setNomeSelecao(String nomeSelecao) {
        this.nomeSelecao = nomeSelecao;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.nomeSelecao);
        hash = 71 * hash + Objects.hashCode(this.jogadores);
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
        final Selecao other = (Selecao) obj;
        if (!Objects.equals(this.nomeSelecao, other.nomeSelecao)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.jogadores, other.jogadores);
    }

    @Override
    public String toString() {
        return "Selecao{" + "id=" + id + ", nomeSelecao=" + nomeSelecao + ", jogadores=" + jogadores + '}';
    }

    public void setJogadores(String endrick) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
    
}
