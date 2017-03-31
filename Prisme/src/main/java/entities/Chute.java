package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chutes database table.
 * 
 */
@Entity
@Table(name="chutes")
@NamedQuery(name="Chute.findAll", query="SELECT c FROM Chute c")
public class Chute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_Chutes;

	private int cmptProd;

	private int cmptSat;

	private String codeLieu;

	private String libChute;

	private String libEmpPalette;

	private int tpsOuverture;

	private String type;

	public Chute() {
	}

	public int getId_Chutes() {
		return this.id_Chutes;
	}

	public void setId_Chutes(int id_Chutes) {
		this.id_Chutes = id_Chutes;
	}

	public int getCmptProd() {
		return this.cmptProd;
	}

	public void setCmptProd(int cmptProd) {
		this.cmptProd = cmptProd;
	}

	public int getCmptSat() {
		return this.cmptSat;
	}

	public void setCmptSat(int cmptSat) {
		this.cmptSat = cmptSat;
	}

	public String getCodeLieu() {
		return this.codeLieu;
	}

	public void setCodeLieu(String codeLieu) {
		this.codeLieu = codeLieu;
	}

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

	public int getTpsOuverture() {
		return this.tpsOuverture;
	}

	public void setTpsOuverture(int tpsOuverture) {
		this.tpsOuverture = tpsOuverture;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}