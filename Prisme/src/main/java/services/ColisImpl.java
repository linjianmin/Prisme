package services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entities.Coli;
import entities.Plantrinom;
import entityManagerFactory.JPAResourceBean;

public class ColisImpl implements ColisService {
	
	
	public ColisImpl(){
		
		super ();
		
	}
	
	protected JPAResourceBean jpaResourceBean;
	
	
	@Override
	public void ColisImpl() {
		
		
	}
	
	public List<Coli> AllColis(){
		
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		try {
			TypedQuery<Coli> query = (TypedQuery<Coli>) em.createNamedQuery("Coli.findAll");
			List<Coli> colis = query.getResultList();
			System.out.println("service impl");
			return colis;
			
		} finally {
			em.close();
		}
						
	}

	public JPAResourceBean getJpaResourceBean() {
		return jpaResourceBean;
	}

	public void setJpaResourceBean(JPAResourceBean jpaResourceBean) {
		this.jpaResourceBean = jpaResourceBean;
	}
	
	
	

}
