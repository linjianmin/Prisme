package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the lieux database table.
 * 
 */
@Entity
@NamedQuery(name="Lieux.findAll", query="SELECT l FROM Lieux l")
public class Lieux implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idlieux;

	private String adresseTcpIp;

	private String code_subsidiaire;

	private String code_VI;

	private String codeLieu;

	private String materiel;

	@Column(name="point_cardinal")
	private String pointCardinal;

	private String secours;

	private String zone;

	public Lieux() {
	}

	public int getIdlieux() {
		return this.idlieux;
	}

	public void setIdlieux(int idlieux) {
		this.idlieux = idlieux;
	}

	public String getAdresseTcpIp() {
		return this.adresseTcpIp;
	}

	public void setAdresseTcpIp(String adresseTcpIp) {
		this.adresseTcpIp = adresseTcpIp;
	}

	public String getCode_subsidiaire() {
		return this.code_subsidiaire;
	}

	public void setCode_subsidiaire(String code_subsidiaire) {
		this.code_subsidiaire = code_subsidiaire;
	}

	public String getCode_VI() {
		return this.code_VI;
	}

	public void setCode_VI(String code_VI) {
		this.code_VI = code_VI;
	}

	public String getCodeLieu() {
		return this.codeLieu;
	}

	public void setCodeLieu(String codeLieu) {
		this.codeLieu = codeLieu;
	}

	public String getMateriel() {
		return this.materiel;
	}

	public void setMateriel(String materiel) {
		this.materiel = materiel;
	}

	public String getPointCardinal() {
		return this.pointCardinal;
	}

	public void setPointCardinal(String pointCardinal) {
		this.pointCardinal = pointCardinal;
	}

	public String getSecours() {
		return this.secours;
	}

	public void setSecours(String secours) {
		this.secours = secours;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}