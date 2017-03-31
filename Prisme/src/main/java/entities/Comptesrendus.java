package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the comptesrendus database table.
 * 
 */
@Entity
@NamedQuery(name="Comptesrendus.findAll", query="SELECT c FROM Comptesrendus c")
public class Comptesrendus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String idComptesRendus;

	private String alibi;

	private String codeLieu;

	private String codeLu;

	private String codeTransporteur;

	private String excedent;

	private int fait;

	@Temporal(TemporalType.TIMESTAMP)
	private Date horodatage;

	private String idBalance;

	private String modeFonctionnement;

	private String poids;

	public Comptesrendus() {
	}

	public String getIdComptesRendus() {
		return this.idComptesRendus;
	}

	public void setIdComptesRendus(String idComptesRendus) {
		this.idComptesRendus = idComptesRendus;
	}

	public String getAlibi() {
		return this.alibi;
	}

	public void setAlibi(String alibi) {
		this.alibi = alibi;
	}

	public String getCodeLieu() {
		return this.codeLieu;
	}

	public void setCodeLieu(String codeLieu) {
		this.codeLieu = codeLieu;
	}

	public String getCodeLu() {
		return this.codeLu;
	}

	public void setCodeLu(String codeLu) {
		this.codeLu = codeLu;
	}

	public String getCodeTransporteur() {
		return this.codeTransporteur;
	}

	public void setCodeTransporteur(String codeTransporteur) {
		this.codeTransporteur = codeTransporteur;
	}

	public String getExcedent() {
		return this.excedent;
	}

	public void setExcedent(String excedent) {
		this.excedent = excedent;
	}

	public int getFait() {
		return this.fait;
	}

	public void setFait(int fait) {
		this.fait = fait;
	}

	public Date getHorodatage() {
		return this.horodatage;
	}

	public void setHorodatage(Date horodatage) {
		this.horodatage = horodatage;
	}

	public String getIdBalance() {
		return this.idBalance;
	}

	public void setIdBalance(String idBalance) {
		this.idBalance = idBalance;
	}

	public String getModeFonctionnement() {
		return this.modeFonctionnement;
	}

	public void setModeFonctionnement(String modeFonctionnement) {
		this.modeFonctionnement = modeFonctionnement;
	}

	public String getPoids() {
		return this.poids;
	}

	public void setPoids(String poids) {
		this.poids = poids;
	}

}