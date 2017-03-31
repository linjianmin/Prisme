package services;

import java.util.List;

import entities.Plantridonnee;
import entities.Plantrinom;

public interface PlansTriService {
	
	public void PlansTriImpl();
	
	public List<Plantrinom> AllPlans(); 
	public int NbreAllPlans();
	public Plantrinom addPlanTri(Plantrinom plan);
	public Plantrinom duplicate(Plantrinom plan, String newNom);
	public Plantrinom update(Plantrinom plan);
	public void delete(Plantrinom plan);
	public void deleteDetail (Plantridonnee detail);
	public Plantridonnee addDetail(Plantridonnee detail);
	public Plantridonnee updateDetail(Plantridonnee detail);
	public Plantrinom activatePlan(Plantrinom plan);
	public Plantrinom activePlan();
	public void activePlan(Plantrinom plan);
	public Boolean isusedname(String nom);
	public List <Plantridonnee> DetailByPlan(Plantrinom plan);
	public List<Plantrinom> getPlanByNom(String nom);
	public String hello();
//	public String controler(Plantrinom plan);
	public List<Plantridonnee> controlerPlan(Plantrinom plan);
	public void controlPlan(Plantrinom plan);
	

}
