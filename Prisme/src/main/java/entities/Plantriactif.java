package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the plantriactif database table.
 * 
 */
@Entity
@NamedQuery(name="Plantriactif.findAll", query="SELECT p FROM Plantriactif p")
public class Plantriactif implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String idplantriactif;

	private String chute;

	private String codeEmpPalette;

	private String codeTriMaxi;

	private String codeTriMini;

	private String libChute;

	private String libEmpPalette;

	public Plantriactif() {
	}

	public String getIdplantriactif() {
		return this.idplantriactif;
	}

	public void setIdplantriactif(String idplantriactif) {
		this.idplantriactif = idplantriactif;
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

	public String getCodeTriMaxi() {
		return this.codeTriMaxi;
	}

	public void setCodeTriMaxi(String codeTriMaxi) {
		this.codeTriMaxi = codeTriMaxi;
	}

	public String getCodeTriMini() {
		return this.codeTriMini;
	}

	public void setCodeTriMini(String codeTriMini) {
		this.codeTriMini = codeTriMini;
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

}