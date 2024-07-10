
package Utilitario;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Flaviana Andrade
 */
public class GerarTabela {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CopaDoMundoPU");
        
        emf.close();
    }
    
}
