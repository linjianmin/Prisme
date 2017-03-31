package managedBeans;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import services.PlansTriService;


@FacesValidator("uniqueNomValidator")
public class UniqueNomValidator implements Validator {

	
	private PlansTriService plantriservice;
	
	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value==null){
			return;
		}
		
		String nom = (String) value;
		
		if(plantriservice.isusedname(nom)){
		     throw new ValidatorException(new FacesMessage(
		                FacesMessage.SEVERITY_ERROR, "ce nom existe déjà", null));
		}
		
	}

}
