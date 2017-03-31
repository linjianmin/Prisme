package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the plantrinoms database table.
 * 
 */
@Entity
@Table(name="plantrinoms")
@NamedQuery(name="Plantrinom.findAll", query="SELECT p FROM Plantrinom p")
public class Plantrinom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idplantrinoms;

	private int actif;

	private String chuteNA;

	private String chuteNL;

	private String chuteRE;

	private int controle;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateModif;

	private int edition;

	@Column(unique=true)
	private String nom;

	private String trafic;
	
	@OneToMany(mappedBy="plantrinom", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Plantridonnee> plantridonnees;
	
	
	

	

	public Plantrinom() {
	}

	public int getIdplantrinoms() {
		return this.idplantrinoms;
	}

	public void setIdplantrinoms(int idplantrinoms) {
		this.idplantrinoms = idplantrinoms;
	}

	public int getActif() {
		return this.actif;
	}

	public void setActif(int actif) {
		this.actif = actif;
	}

	public String getChuteNA() {
		return this.chuteNA;
	}

	public void setChuteNA(String chuteNA) {
		this.chuteNA = chuteNA;
	}

	public String getChuteNL() {
		return this.chuteNL;
	}

	public void setChuteNL(String chuteNL) {
		this.chuteNL = chuteNL;
	}

	public String getChuteRE() {
		return this.chuteRE;
	}

	public void setChuteRE(String chuteRE) {
		this.chuteRE = chuteRE;
	}

	public int getControle() {
		return this.controle;
	}

	public void setControle(int controle) {
		this.controle = controle;
	}

	public Date getDateModif() {
		return this.dateModif;
	}

	public void setDateModif(Date dateModif) {
		this.dateModif = dateModif;
	}

	public int getEdition() {
		return this.edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTrafic() {
		return this.trafic;
	}

	public void setTrafic(String trafic) {
		this.trafic = trafic;
	}



	public List<Plantridonnee> getPlantridonnees() {
		return plantridonnees;
	}

	public void setPlantridonnees(List<Plantridonnee> plantridonnees) {
		this.plantridonnees = plantridonnees;
	}


}