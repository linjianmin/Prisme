package services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import entities.Plantridonnee;
import entities.Plantrinom;
import entityManagerFactory.JPAResourceBean;

public class PlansTriImpl implements PlansTriService {
	
	public PlansTriImpl(){
		
		super ();
		
	}
	
	protected JPAResourceBean jpaResourceBean;
	

	
	@Override
	public void PlansTriImpl() {
				
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Plantrinom> AllPlans(){
		
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		try {
			TypedQuery<Plantrinom> query = (TypedQuery<Plantrinom>) em.createNamedQuery("Plantrinom.findAll");
			List<Plantrinom> plantrinoms = query.getResultList();
			System.out.println("service impl");
			return plantrinoms;
			
		} finally {
			em.close();
		}
						
	}
	
	@SuppressWarnings("unchecked")
	public int NbreAllPlans(){
		System.out.println("impl");
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		List<Plantrinom> list = em.createQuery("select p FROM Plantrinom p").getResultList();
		return list.size();
		
		
	}


	public JPAResourceBean getJpaResourceBean() {
		return jpaResourceBean;
	}
	public void setJpaResourceBean(JPAResourceBean jpaResourceBean) {
		this.jpaResourceBean = jpaResourceBean;
	}


	@Override
	public Plantrinom addPlanTri(Plantrinom plan) {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		plan.setDateModif(time);
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		em.getTransaction().begin();
		em.persist(plan);
		
		em.getTransaction().commit();
		
		return plan;
	}
	
	public Plantrinom update (Plantrinom plan){
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		em.getTransaction().begin();
		Timestamp time = new Timestamp(System.currentTimeMillis());
		plan.setDateModif(time);
		plan.setActif(0);
		plan.setControle(0);
		plan = em.merge(plan);
		em.getTransaction().commit();
		return plan;
		
	}


	@Override
	public void delete(Plantrinom plan) {
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		em.getTransaction().begin();
		plan = em.merge(plan);
		em.remove(plan);
		em.getTransaction().commit();
	}


	@Override
	public Plantrinom activatePlan(Plantrinom plan) {
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		em.getTransaction().begin();
		return plan;
		
	}


	@Override
	public void activePlan(Plantrinom plan) {
		if(plan.getActif()==0)
		{
			plan.setActif(1);
			Timestamp time = new Timestamp(System.currentTimeMillis());
			plan.setDateModif(time);
		} else {
			plan.setActif(0);
			Timestamp time = new Timestamp(System.currentTimeMillis());
			plan.setDateModif(time);
		}
		
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		em.getTransaction().begin();
		plan = em.merge(plan);
		em.getTransaction().commit();
	}


	@SuppressWarnings("unchecked")
	@Override
	public Boolean isusedname(String nom) {
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		ArrayList<String> noms = (ArrayList<String>) em.createQuery("select 'nom' from Plantrinom").getResultList();
		
		for (int i = 0; i < noms.size(); i++) {
			if(nom==noms.get(i)){
				return true;
				
			} else return false;
		}
		return null;
		
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Plantridonnee> DetailByPlan(Plantrinom plan) {
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		try {
			
			List<Plantridonnee> query = em.createQuery("select p from Plantridonnee p where p.plantrinom =:x ").setParameter("x", plan).getResultList();
					
			
			System.out.println("find detail by plan");
			return query;
			
		} finally {
			em.close();
		}
	}
	

	
	public List<Plantrinom> getPlanByNom(String nom){
		System.out.println("get plan by nom");
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		Plantrinom found = new Plantrinom();
		List<Plantrinom> founds;
		found =null;
		founds = em.createQuery("select p from Plantrinom p where p.nom LIKE :x ").setParameter("x", nom).getResultList();
		System.out.println(founds.size());
		return founds;
		
		
	}


	@Override
	public String hello() {
		
		return "matrix";
	}


	@SuppressWarnings("null")
	@Override
	public Plantrinom duplicate(Plantrinom plan, String newNom) {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		Plantrinom newPlan = plan;
		List<Plantridonnee> reglesPlanSelect = plan.getPlantridonnees();
		List<Plantridonnee> reglesPlan = newPlan.getPlantridonnees();
		for (int i = 0; i < reglesPlanSelect.size(); i++) {
			System.out.println(i);
			System.out.println(reglesPlanSelect.get(i).getCodeTriMini());
//			reglesPlan.get(i).setChute(reglesPlanSelect.get(i).getChute());
			reglesPlan.get(i).setCodeEmpPalette(reglesPlanSelect.get(i).getCodeEmpPalette());
			reglesPlan.get(i).setCodeTriMaxi(reglesPlanSelect.get(i).getCodeTriMaxi());
			reglesPlan.get(i).setCodeTriMini(reglesPlanSelect.get(i).getCodeTriMini());
//			reglesPlan.get(i).setCodetriprisme(reglesPlanSelect.get(i).getCodetriprisme());
//			reglesPlan.get(i).setErreur(reglesPlanSelect.get(i).getErreur());
//			reglesPlan.get(i).setLibChute(reglesPlanSelect.get(i).getLibChute());
//			reglesPlan.get(i).setLibEmpPalette(reglesPlanSelect.get(i).getLibEmpPalette());
//			reglesPlan.get(i).setTrameBrute(reglesPlanSelect.get(i).getTrameBrute());
			
		}
		newPlan.setDateModif(time);
		newPlan.setNom(newNom);
		newPlan.setActif(0);
		newPlan.setPlantridonnees(reglesPlan);
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		em.getTransaction().begin();
		em.persist(newPlan);
	//	em.persist(reglesPlan);
		
		em.getTransaction().commit();
		
		return plan;
	}


	@Override
	public void deleteDetail(Plantridonnee detail) {
		
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		em.getTransaction().begin();
		detail = em.merge(detail);
		em.remove(detail);
		em.getTransaction().commit();
		
		
	}


	@Override
	public Plantridonnee addDetail(Plantridonnee detail) {
		
		Timestamp time = new Timestamp(System.currentTimeMillis());
		
		detail.getPlantrinom().setDateModif(time);
		
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		em.getTransaction().begin();
		
		em.persist(detail);
		
		em.getTransaction().commit();
		
		return detail;
	}


	@Override
	public Plantridonnee updateDetail(Plantridonnee detail) {
		
		
		System.out.println("service update detail "+ detail.getIdplantridonnees());
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		em.getTransaction().begin();
		Timestamp time = new Timestamp(System.currentTimeMillis());
		Plantrinom plan = new Plantrinom();
		plan = detail.getPlantrinom();
		plan.setDateModif(time);
		plan.setControle(0);
		plan.setActif(0);
		plan = em.merge(plan);
		detail = em.merge(detail);
		em.getTransaction().commit();
		return detail;
		
	}


	
	
	@Override
	public List<Plantridonnee> controlerPlan(Plantrinom plan) {
		
		List<Plantridonnee> plansErrone = null;
		List<Plantridonnee> planDetails = plan.getPlantridonnees(); 
		List<Plantridonnee> containsMax;
		List<Plantridonnee> containMin;
		int codeprisme = 0;
		int codemax = 0;
		int codemin = 0;
	
		Collection<Plantridonnee> plageMax= new ArrayList<Plantridonnee>();
		Collection<Plantridonnee> plageMin= new ArrayList<Plantridonnee>();
		if(plan.getTrafic()=="GEODIS")
		{
			System.out.println("GEODIS");
			
			for(int i = 0; i<planDetails.size();i++){
				
				//for good entry of nbre digits 
				if(planDetails.get(i).getCodeTriMaxi()<100 && planDetails.get(i).getCodeTriMini()<100){
					
					System.out.println("longueur <4");
					Plantridonnee det = planDetails.get(i);
					EntityManager em = jpaResourceBean.getEMF().createEntityManager();
					plageMin = em.createQuery("select * from Plantridonnee where :x between codeTriMini and codeTriMaxi").setParameter("x", det.getCodeTriMini()).getResultList();
					plageMax = em.createQuery("select * from Plantridonnee where :x between codeTriMini and codeTriMaxi").setParameter("x", det.getCodeTriMaxi()).getResultList();
					plansErrone.addAll(plageMax);
					plansErrone.addAll(plageMin);
					
					if(plansErrone.size()==0){
						System.out.println("pas de chauv");
					}else {
						System.out.println("il y a chauv");
					}
				
				}
				
				else {
					
					System.out.println("codes tri erronés ");
					
				}
			}
		}
		else {
			for (int i = 0; i < planDetails.size(); i++) {
				if(planDetails.get(i).getCodetriprisme().length()<=9){
					System.out.println("longueur <10");
					
				}else {
					plansErrone.add(planDetails.get(i));
					
				}
			}
			
		}
		System.out.println(plansErrone.size());
		return plansErrone;
	}


	@Override
	public void controlPlan(Plantrinom plan) {
		if(plan.getControle()==0){
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		em.getTransaction().begin();
		Timestamp time = new Timestamp(System.currentTimeMillis());
		plan.setDateModif(time);
		plan.setControle(1);
		plan = em.merge(plan);
		em.getTransaction().commit();}
		else{
		System.out.println("ce plan est déjà contrôlé!");	
			}
	}


	@Override
	public Plantrinom activePlan() {
		EntityManager em = jpaResourceBean.getEMF().createEntityManager();
		Plantrinom activePlan = new Plantrinom();
		  try{
		activePlan = (Plantrinom) em.createQuery("select p from Plantrinom p where p.actif=1").getSingleResult();
		return activePlan;}catch(NoResultException e){return null;}
	}


	
	
	
	
}
