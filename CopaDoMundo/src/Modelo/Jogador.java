
package Modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author Flaviana Andrade
 */
@Entity //mapeando tabela para o banco de dados
@Table
public class Jogador implements Serializable{
    
    @Id
    @SequenceGenerator(name="seq_jogador", sequenceName = "seq_jogador", initialValue = 1)
    @GeneratedValue(generator = "seq_jogador", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 200, nullable = true)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "selecao_id")
    private Selecao selecao;
    @Column(length = 200, nullable = true)
    private String numeroCamisa;
    @Column(length = 200, nullable = true)
    private String posicao;

    public Jogador() {
    }

    public Jogador(Long id, String nome, Selecao selecao, String numeroCamisa, String posicao) {
        this.id = id;
        this.nome = nome;
        this.selecao = selecao;
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
    }
    
    //Metodo para imprimir as informações dos jogadores
    public void imprimirInformaçoesJagador(){
        System.out.println("Nome: " + nome);
         // Usando if-else para imprimir a seleção
        if (selecao != null) {
            System.out.println("Seleção: " + selecao.getNomeSelecao());
        } else {
            System.out.println("Seleção: Não foi adicionado nenhuma seleção");
        }
        System.out.println("Numero da Camisa: " + numeroCamisa);
        System.out.println("Posição: " + posicao);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Selecao getSelecao() {
        return selecao;
    }

    public void setSelecao(Selecao selecao) {
        this.selecao = selecao;
    }

    public String getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(String numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id);
        hash = 43 * hash + Objects.hashCode(this.nome);
        hash = 43 * hash + Objects.hashCode(this.selecao);
        hash = 43 * hash + Objects.hashCode(this.numeroCamisa);
        hash = 43 * hash + Objects.hashCode(this.posicao);
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
        final Jogador other = (Jogador) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.numeroCamisa, other.numeroCamisa)) {
            return false;
        }
        if (!Objects.equals(this.posicao, other.posicao)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.selecao, other.selecao);
    }

    @Override
    public String toString() {
        return "Jogador{" + "id=" + id + ", nome=" + nome + ", selecao=" + selecao + ", numeroCamisa=" + numeroCamisa + ", posicao=" + posicao + '}';
    }

    public void setSelecao(String brasil) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    
    
}
