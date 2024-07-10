
package Utilitario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Flaviana Andrade
 */
public class JpaUtil {
    
    private static EntityManagerFactory emf;
    
    static{
        emf = Persistence.createEntityManagerFactory("CopaDoMundoPU");
    }
    
    public static EntityManager conexao(){
        return emf.createEntityManager();
    }
    
    public static void fecharConexao(){
        emf.close();
    }
    
}
