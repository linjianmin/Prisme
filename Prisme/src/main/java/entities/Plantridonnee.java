package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the plantridonnees database table.
 * 
 */
@Entity
@Table(name="plantridonnees")
@NamedQuery(name="Plantridonnee.findAll", query="SELECT p FROM Plantridonnee p")
public class Plantridonnee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String idplantridonnees;
	

	@Column(name="CodeTriPrisme")
	private String codetriprisme;
	
	private String chute;

	private String codeEmpPalette;

	private int codeTriMaxi;

	private int codeTriMini;

	private String erreur;
	
	
	@ManyToOne
	@JoinColumn(name="idplantrinoms")
	private Plantrinom plantrinom;

	
	
//	private int idplantrinoms;

	private String libChute;

	private String libEmpPalette;

	private String trameBrute;
	

	public Plantridonnee() {
	}

	public String getIdplantridonnees() {
		return this.idplantridonnees;
	}

	public void setIdplantridonnees(String idplantridonnees) {
		this.idplantridonnees = idplantridonnees;
	}

	public String getChute() {
		return this.chute;
	}

	public void setChute(String chute) {
		this.chute = chute;
	}

	public String getCodeEmpPalette() {
		return this.codeEmpPalette;
	}

	public void setCodeEmpPalette(String codeEmpPalette) {
		this.codeEmpPalette = codeEmpPalette;
	}

	

	public String getErreur() {
		return this.erreur;
	}

	public void setErreur(String erreur) {
		this.erreur = erreur;
	}

//	public int getIdplantrinoms() {
//		return this.idplantrinoms;
//	}
//
//	public void setIdplantrinoms(int idplantrinoms) {
//		this.idplantrinoms = idplantrinoms;
//	}

	public String getLibChute() {
		return this.libChute;
	}

	public void setLibChute(String libChute) {
		this.libChute = libChute;
	}

	public String getLibEmpPalette() {
		return this.libEmpPalette;
	}

	public void setLibEmpPalette(String libEmpPalette) {
		this.libEmpPalette = libEmpPalette;
	}

	public String getTrameBrute() {
		return this.trameBrute;
	}

	public void setTrameBrute(String trameBrute) {
		this.trameBrute = trameBrute;
	}

	public Plantrinom getPlantrinom() {
		return plantrinom;
	}

	public void setPlantrinom(Plantrinom plantrinom) {
		this.plantrinom = plantrinom;
	}

	public String getCodetriprisme() {
		return codetriprisme;
	}

	public void setCodetriprisme(String codetriprisme) {
		this.codetriprisme = codetriprisme;
	}

	public int getCodeTriMaxi() {
		return codeTriMaxi;
	}

	public void setCodeTriMaxi(int codeTriMaxi) {
		this.codeTriMaxi = codeTriMaxi;
	}

	public int getCodeTriMini() {
		return codeTriMini;
	}

	public void setCodeTriMini(int codeTriMini) {
		this.codeTriMini = codeTriMini;
	}


}