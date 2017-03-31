package managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import entities.Plantridonnee;
import entities.Plantrinom;
import services.PlansTriService;


//@ManagedBean(name="plansTriMB", eager= true)
//@RequestScoped
public class PlansTriManagedBean implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Plantrinom plantrinom;
	private Plantrinom newPlan = new Plantrinom(); 
	private Plantridonnee newDetail = new Plantridonnee();
	protected PlansTriService plansTriService; 
	private DataModel plans;
	private DataModel details;
	private String message;
	public String newNom;
	public Plantrinom selectPlan;
	
	protected List<Plantridonnee> detailByplan =null;
	
	protected List<Plantrinom> allPlansTri ;
	protected List<Plantrinom> toutPlanTri;
	protected int nbrePlans;
	private Plantrinom editPlan;
	private Plantridonnee editDetail;
	private Plantrinom selectedPlan;
	private Plantridonnee selectedDetail;
	private UIComponent nomInput;

//	@PostConstruct
//	public void init(){
//		List<Plantrinom> loadPlans = plansTriService.AllPlans();
//		toutPlanTri = loadPlans;
//		
//	}
	
	
	public int getNbrePlans() {
		this.nbrePlans = plansTriService.NbreAllPlans();
		System.out.println(nbrePlans);
		return nbrePlans;
	}

	public void setNbrePlans(int nbrePlans) {
		this.nbrePlans = nbrePlans;
	}

	public PlansTriService getPlansTriService() {
		return plansTriService;
	}

	public void setPlansTriService(PlansTriService plansTriService) {
		this.plansTriService = plansTriService;
	}

	
	
	public List<Plantrinom> getToutPlanTri() {
	
		if(toutPlanTri==null){
			System.out.println("managedbean");
			this.toutPlanTri=plansTriService.AllPlans();
		}

	
		return toutPlanTri;
	}

	public void setToutPlanTri(List<Plantrinom> toutPlanTri) {
		this.toutPlanTri = toutPlanTri;
	}

	public Plantrinom getPlantrinom() {
		return plantrinom;
	}

	public void setPlantrinom(Plantrinom plantrinom) {
		this.plantrinom = plantrinom;
	}

	
	
	public List<Plantrinom> getAllPlanstri() {
		if (allPlansTri==null){
			this.allPlansTri=plansTriService.AllPlans();
		}
		return allPlansTri;
	}

	public void setAllPlansTri(List<Plantrinom> allPlansTri) {
		this.allPlansTri = allPlansTri;
	}
	
	public String createPlan(){
		if(plansTriService.getPlanByNom(newPlan.getNom()).size()==0){
			System.out.println("existe pas");
			plansTriService.addPlanTri(newPlan);
			message = "";
			
		} else {
			System.out.println("existe");
			message = "Ce nom de plan existe déjà";
		}
		
		
		newPlan = new Plantrinom();
		plans.setWrappedData(plansTriService.AllPlans());
		
		return null;
	}

	public String createDetail(){
		
		newDetail.setPlantrinom(selectedPlan);
		selectedPlan.setControle(0);
		plansTriService.update(selectedPlan);
		plansTriService.addDetail(newDetail);
		
//		plans.setWrappedData(plansTriService.AllPlans());

		message ="";
		
		newDetail = new Plantridonnee();
		plans.setWrappedData(plansTriService.AllPlans());
//		details.setWrappedData(selectPlan.getPlantridonnees());
		details.setWrappedData(plansTriService.DetailByPlan(selectedPlan));
		
		
		return null;
	}
	
	
	public Plantrinom getNewPlan() {
		return newPlan;
	}

	public void setNewPlan(Plantrinom newPlan) {
		this.newPlan = newPlan;
	}

	public Plantrinom getEditPlan() {
		return editPlan;
	}

	public void setEditPlan(Plantrinom editPlan) {
		this.editPlan = editPlan;
	}
	
	public String editPlan(){
		editPlan = (Plantrinom) plans.getRowData();
		System.out.println(editPlan.getNom());
		return "edit";
	}
	
	public String editDetail(){
		editDetail =  (Plantridonnee) details.getRowData();
		System.out.println(editDetail.getIdplantridonnees());
		
		return "editDetail";
	}
	
	public String displaydetails (){
		
	//	details.setWrappedData(plansTriService.DetailByPlan(selectPlan));	
		selectedPlan = null;
		plans.setWrappedData(plansTriService.AllPlans());
		return "plantri";
	}
	
	public String selectedPlans(){
		selectedPlan = (Plantrinom) plans.getRowData();
	//	details.setWrappedData(plansTriService.DetailByPlan(selectPlan));	
		
	//	details = (DataModel) plansTriService.DetailByPlan(selectPlan);
		System.out.println(selectedPlan.getNom());
		return "detailsPlan";
	}
	
	public String updatePlan(){
		plansTriService.update(editPlan);
		plans.setWrappedData(plansTriService.AllPlans());
		return "plantri";
	}
	
	public String updateDetail(){
		System.out.println("Mbean");
		plansTriService.updateDetail(editDetail);
		System.out.println(editDetail.getIdplantridonnees()+" updated");
	//	plans.setWrappedData(plansTriService.AllPlans());
		details.setWrappedData(editDetail.getPlantrinom().getPlantridonnees());
		plans.setWrappedData(plansTriService.AllPlans());
		return "detailsPlan";
	}
	 

	public DataModel getPlans() {
		if (plans==null){
			plans = new ListDataModel<>();
			plans.setWrappedData(plansTriService.AllPlans());
			
		}
		
		return plans;
	}

	@SuppressWarnings("rawtypes")
	public void setPlans(DataModel plans) {
		this.plans = plans;
	}
	
	public String deletePlan(){
		Plantrinom plan = (Plantrinom) plans.getRowData();
		if(plan.getActif()==0){
			plansTriService.delete(plan);
			plans.setWrappedData(plansTriService.AllPlans());
			message="";
					}
		else{
			message = "Ce plan de tri est en cours d'utilisation ou actif, donc impossible à supprimer";
		}
		
		return null;
	}
	
	
	public String deleteDetail(){
	
		Plantridonnee detail = (Plantridonnee) details.getRowData();
		System.out.println(detail.getIdplantridonnees());
	//		plansTriService.delete(plan);
			plansTriService.deleteDetail(detail);
			plans.setWrappedData(plansTriService.AllPlans());
			details.setWrappedData(selectedPlan.getPlantridonnees());
			message="";
		
	
		
		return null;
	}
	
	
	public String duplicate(){
		
		Plantrinom plan = selectedPlan;
		if(plansTriService.getPlanByNom(newNom).size()==0){
			plansTriService.duplicate(plan, newNom);
			selectedPlan = new Plantrinom();
		
			plans.setWrappedData(plansTriService.AllPlans());
			message="";
		}else{
			message="Ce nom de plan existe déjà!";
		}
			
			
		
		return null;
		
		
	}
	
	
	public String select(){
		selectedPlan = (Plantrinom) plans.getRowData();
		return null;
	}
	
	
	
	public String activePlan(){
		
		Plantrinom plan = (Plantrinom) plans.getRowData();
		Plantrinom activePlan = plansTriService.activePlan(); 
	
		if(plan.getControle()==1){
			if (plan.getActif()==0) {
				if (activePlan==null) {
					plansTriService.activePlan(plan);
					plans.setWrappedData(plansTriService.AllPlans());
					message="";
					System.out.println(plan.getNom());
				}else{
					message="Veuillez désactiver le plan de tri "+activePlan.getNom(); 
				}
			}else if(plan.getActif()==1){
				plansTriService.activePlan(plan);
				plans.setWrappedData(plansTriService.AllPlans());
				message="";
				System.out.println(plan.getNom());
			}
			
		}
	
		else{
			message="Ce plan de tri n'est pas contrôlé, donc impossible de l'activer";
		}
		
	
		plans.setWrappedData(plansTriService.AllPlans());
		return null;
		
	}
	
	
	

	@SuppressWarnings("null")
	public String controlPlan(){
		
		
		Plantrinom plan = (Plantrinom) plans.getRowData();
		if(plan.getControle()==1){
			message="Ce plan de tri a été déjà contrôlé!";
			return null;
		}
		
		ArrayList<Integer> plage = new ArrayList<Integer>(5);
		

		List<Plantridonnee> dtls = plan.getPlantridonnees();
		System.out.println(plan.getIdplantrinoms());
		
		if( plan.getTrafic().substring(0, 1)!="G"  ){
		
			System.out.println("geodis");
		
		for (int i = 0; i < dtls.size(); i++) {
			int min = dtls.get(i).getCodeTriMini();
			System.out.println(min);
			int max = dtls.get(i).getCodeTriMaxi();
			System.out.println(max);
			
			if(max <1000 && min <1000){
			
			if(plage.contains(max) || plage.contains(min) ){
				
				System.out.println("chuv");
				message="la règle n°"+dtls.get(i).getIdplantridonnees()+" cause un chevauchement";
				return null;
				
			}else{
				System.out.println("else");
					for (int j = min; j < max+1; j++) {
						
			
						plage.add(j);
						System.out.println(j);
						
		
					
					} 
				
			} System.out.println(i); 
						if(i==dtls.size()-1){
							System.out.println("plan controlé");
							message = "Plan de tri contrôlé avec succés.";
							plansTriService.controlPlan(plan);
							return null;
						}
			
			}
			
				else{
				message="la règle n°"+dtls.get(i).getIdplantridonnees()+" ne respecte pas le nombre de digits attendus = 3";
			} 
		} }
		
		else{
			for (int i = 0; i < dtls.size(); i++) {
				String codetri = dtls.get(i).getCodetriprisme();
				System.out.println(codetri);
				
				
				if(codetri.length()>10){
					message="la règle n°"+dtls.get(i).getIdplantridonnees()+" ne respecte pas le nombre de digits attendus = 9";
				}else{
					System.out.println("plan de tri"+plan.getNom()+ " contrôlé");
					plansTriService.controlPlan(plan);
					return null;
				}
				
			}
		}
		
		System.out.println(plage.size());
		
		
		
		
//		plansTriService.controlPlan(plan);
		return null;
//		Plantrinom plan = (Plantrinom) plans.getRowData();
//		plansTriService.controlPlan(plan);
//		System.out.println(plan.getIdplantrinoms());
//	//	Collection<Plantridonnee> errors= new ArrayList<Plantridonnee>();
//		List<Plantridonnee> errors = plansTriService.controlerPlan(plan);
//		if(errors==null){System.out.println("still null");};
//		if(errors.size()==0){
//			System.out.println("size 0 pad d erreur");
//		}
//		
//		
//		else{
//			for (int i = 0; i< errors.size(); i++) {
//				System.out.println(errors.get(i).getCodeTriMini());
//				System.out.println(errors.get(i).getCodeTriMaxi());
//			}
//			
//		}
//		return null;
	}
	
	
	public String detail(){
		Plantrinom plan = (Plantrinom) plans.getRowData();
		
		return "detailsPlan";
	}

	
	public String detailsPlan(){
	//	details.setWrappedData(selectedPlan.getPlantridonnees());
		details.setWrappedData(plansTriService.DetailByPlan(selectedPlan));
		return "";
	}
	
	
	public List<Plantridonnee> getDetailByplan() {
	//	details.setWrappedData(plansTriService.DetailByPlan(selectedPlan));
		if(detailByplan==null){
			detailByplan= plansTriService.DetailByPlan(selectedPlan);
				}
		return detailByplan;
	}

	public void setDetailByplan(List<Plantridonnee> detailByplan) {
		this.detailByplan = detailByplan;
	}

	public Plantrinom getSelectedPlan() {
		return selectedPlan;
	}

	public void setSelectedPlan(Plantrinom selectedPlan) {
		this.selectedPlan = selectedPlan;
	}
	
	public void checkUniqueNom(){
		List<Plantrinom> founds = plansTriService.getPlanByNom(newPlan.getNom());
		System.out.println("is checking");
		if (founds.size()>0){
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(nomInput.getClientId(), new FacesMessage(FacesMessage.SEVERITY_ERROR,"Ce nom de plan existe déjà",null));
			System.out.println("non unique");
		} else {
			System.out.println("unique");
		}
		
	}

	public UIComponent getNomInput() {
		return nomInput;
	}

	public void setNomInput(UIComponent nomInput) {
		this.nomInput = nomInput;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getNewNom() {
		return newNom;
	}

	public void setNewNom(String newNom) {
		this.newNom = newNom;
	}

	public Plantrinom getSelectPlan() {
		return selectPlan;
	}

	public void setSelectPlan(Plantrinom selectPlan) {
		this.selectPlan = selectPlan;
	}

	@SuppressWarnings("unchecked")
	public DataModel<Plantridonnee> getDetails() {
	//	details.setWrappedData(plansTriService.DetailByPlan(selectPlan));
		
		if(details==null){
			details = new ListDataModel<>();
			System.out.println("is null");
	//		details.setWrappedData(selectedPlan.getPlantridonnees());
			details.setWrappedData(plansTriService.DetailByPlan(selectedPlan));
		}else {
			details = new ListDataModel<>();
			details.setWrappedData(plansTriService.DetailByPlan(selectedPlan));
		}
		
		return details;
	}

	public void setDetails(DataModel details) {
		this.details = details;
	}

	public Plantridonnee getNewDetail() {
		return newDetail;
	}

	public void setNewDetail(Plantridonnee newDetail) {
		this.newDetail = newDetail;
	}

	public Plantridonnee getEditDetail() {
		return editDetail;
	}

	public void setEditDetail(Plantridonnee editDetail) {
		this.editDetail = editDetail;
	}

	public Plantridonnee getSelectedDetail() {
		return selectedDetail;
	}

	public void setSelectedDetail(Plantridonnee selectedDetail) {
		this.selectedDetail = selectedDetail;
	}
	
	

	

}
