package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the fondeti database table.
 * 
 */
@Entity
@NamedQuery(name="Fondeti.findAll", query="SELECT f FROM Fondeti f")
public class Fondeti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String nom;

	private String codeZPL;

	private String designation;

	private String erreur;

	@Temporal(TemporalType.TIMESTAMP)
	private Date horodatage;

	private String trameBrute;

	public Fondeti() {
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeZPL() {
		return this.codeZPL;
	}

	public void setCodeZPL(String codeZPL) {
		this.codeZPL = codeZPL;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getErreur() {
		return this.erreur;
	}

	public void setErreur(String erreur) {
		this.erreur = erreur;
	}

	public Date getHorodatage() {
		return this.horodatage;
	}

	public void setHorodatage(Date horodatage) {
		this.horodatage = horodatage;
	}

	public String getTrameBrute() {
		return this.trameBrute;
	}

	public void setTrameBrute(String trameBrute) {
		this.trameBrute = trameBrute;
	}

}