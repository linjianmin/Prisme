
package entityManagerFactory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAResourceBean {

	  protected EntityManagerFactory emf;

	  
	     public EntityManagerFactory getEMF (){
	        if (emf == null){
	            emf = Persistence.createEntityManagerFactory("Prisme");
	        }
	        return emf;
	    }  
	
}
