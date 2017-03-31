package managedBeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.*;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import entities.Coli;
import entities.Plantrinom;
import services.ColisService;

public class ColisManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private DataModel colis;
	private List<Coli> colisList;
	private List<Coli> filtredColis;


	
	private ColisService colisService;

	private Coli selectedColi;


	
	@PostConstruct
	public void init(){
		colisList = colisService.AllColis();
	}
	
	
	public DataModel getColis() {
		if (colis==null){
			colis = new ListDataModel<>();
			colis.setWrappedData(colisService.AllColis());
			
		}
		
		
		
		
		return colis;
	}


	public void setColis(DataModel colis) {
		this.colis = colis;
	}


	public ColisService getColisService() {
		return colisService;
	}


	public void setColisService(ColisService colisService) {
		this.colisService = colisService;
	}


	public Coli getSelectedColi() {
		return selectedColi;
	}


	public void setSelectedColi(Coli selectedColi) {
		this.selectedColi = selectedColi;
	}
	
	 public void onRowSelect(SelectEvent event) {
	        FacesMessage msg = new FacesMessage("Car Selected", ((Coli) event.getObject()).toString());
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	    }
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	 
	 
	    public void onRowUnselect(UnselectEvent event) {
	        FacesMessage msg = new FacesMessage("Car Unselected", ((Coli) event.getObject()).toString());
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	    }


		public List<Coli> getFiltredColis() {
			return filtredColis;
		}


		public void setFiltredColis(List<Coli> filtredColis) {
			this.filtredColis = filtredColis;
		}
 

		public List<Coli> getColisList() {
			if (colisList==null){
	
				colisList = colisService.AllColis();
				
			}
			
			return colisList;
		}


	

		
	
	
}
