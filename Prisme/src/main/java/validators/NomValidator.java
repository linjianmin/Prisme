package validators;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import entities.Plantrinom;
import services.PlansTriService;


//@FacesValidator("com.matrix.nomValidator")
public class NomValidator implements Validator {

	//@ManagedProperty(value = "plansTriService")
	private PlansTriService plansTriService;
	
	
	
	
	@Override
	public void validate(FacesContext facesContext, UIComponent component, Object planNom) throws ValidatorException {
		
		System.out.println("validate");
		
		Plantrinom plan = null;
		
			try{
			//	plan= plansTriService.getPlanByNom(planNom.toString());
				System.out.println("try");
			} catch(Exception ex){
				
				System.out.println(plansTriService.hello());
				
			}
			
		//	plan= plantriservice.getPlanByNom(planNom.toString());
			System.out.println(plan.getNom());
			
			if (plan!=null){
				FacesMessage msg = new FacesMessage("Ce nom de plan est déjà utilisé!");
				msg.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ValidatorException(msg);
				
			}
		
		
	}

	public PlansTriService getPlantriservice() {
		return plansTriService;
	}

	public void setPlantriservice(PlansTriService plantriservice) {
		this.plansTriService= plansTriService;
	}

}
