package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the statistiqueshisto database table.
 * 
 */
@Entity
@NamedQuery(name="Statistiqueshisto.findAll", query="SELECT s FROM Statistiqueshisto s")
public class Statistiqueshisto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idStatistiquesHisto;

	private int colis;

	private String defaut;

	@Temporal(TemporalType.TIMESTAMP)
	private Date horodatage;

	private String idStatistiques;

	private int incoherent;

	private int indisponibilite;

	private int indisponibiliteTotale;

	private String inhibe;

	private int modeFonctionnement;

	private int multiple;

	private int nbreDefaut;

	private int nonLu;

	private int nonRecu;

	private int requete;

	private int tempsFonctionnement;

	private int tempsUtilisation;

	public Statistiqueshisto() {
	}

	public int getIdStatistiquesHisto() {
		return this.idStatistiquesHisto;
	}

	public void setIdStatistiquesHisto(int idStatistiquesHisto) {
		this.idStatistiquesHisto = idStatistiquesHisto;
	}

	public int getColis() {
		return this.colis;
	}

	public void setColis(int colis) {
		this.colis = colis;
	}

	public String getDefaut() {
		return this.defaut;
	}

	public void setDefaut(String defaut) {
		this.defaut = defaut;
	}

	public Date getHorodatage() {
		return this.horodatage;
	}

	public void setHorodatage(Date horodatage) {
		this.horodatage = horodatage;
	}

	public String getIdStatistiques() {
		return this.idStatistiques;
	}

	public void setIdStatistiques(String idStatistiques) {
		this.idStatistiques = idStatistiques;
	}

	public int getIncoherent() {
		return this.incoherent;
	}

	public void setIncoherent(int incoherent) {
		this.incoherent = incoherent;
	}

	public int getIndisponibilite() {
		return this.indisponibilite;
	}

	public void setIndisponibilite(int indisponibilite) {
		this.indisponibilite = indisponibilite;
	}

	public int getIndisponibiliteTotale() {
		return this.indisponibiliteTotale;
	}

	public void setIndisponibiliteTotale(int indisponibiliteTotale) {
		this.indisponibiliteTotale = indisponibiliteTotale;
	}

	public String getInhibe() {
		return this.inhibe;
	}

	public void setInhibe(String inhibe) {
		this.inhibe = inhibe;
	}

	public int getModeFonctionnement() {
		return this.modeFonctionnement;
	}

	public void setModeFonctionnement(int modeFonctionnement) {
		this.modeFonctionnement = modeFonctionnement;
	}

	public int getMultiple() {
		return this.multiple;
	}

	public void setMultiple(int multiple) {
		this.multiple = multiple;
	}

	public int getNbreDefaut() {
		return this.nbreDefaut;
	}

	public void setNbreDefaut(int nbreDefaut) {
		this.nbreDefaut = nbreDefaut;
	}

	public int getNonLu() {
		return this.nonLu;
	}

	public void setNonLu(int nonLu) {
		this.nonLu = nonLu;
	}

	public int getNonRecu() {
		return this.nonRecu;
	}

	public void setNonRecu(int nonRecu) {
		this.nonRecu = nonRecu;
	}

	public int getRequete() {
		return this.requete;
	}

	public void setRequete(int requete) {
		this.requete = requete;
	}

	public int getTempsFonctionnement() {
		return this.tempsFonctionnement;
	}

	public void setTempsFonctionnement(int tempsFonctionnement) {
		this.tempsFonctionnement = tempsFonctionnement;
	}

	public int getTempsUtilisation() {
		return this.tempsUtilisation;
	}

	public void setTempsUtilisation(int tempsUtilisation) {
		this.tempsUtilisation = tempsUtilisation;
	}

}