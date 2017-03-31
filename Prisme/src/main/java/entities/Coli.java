package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the colis database table.
 * 
 */
@Entity
@Table(name="colis")
@NamedQuery(name="Coli.findAll", query="SELECT c FROM Coli c")
public class Coli implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idColis;

	private String alibi;

	private String codeEditeur;

	private String codeEmpPalette;

	private String codeLieu;

	private int codePicApi;

	private int codePicFsc;

	private String codeTransporteur;

	private String codeTri;

	private String codeZpl;

	private String erreur;

	private String excedent;

	private int hauteur;

	private int hauteurPlc;

	@Temporal(TemporalType.TIMESTAMP)
	private Date horodatage;

	@Temporal(TemporalType.TIMESTAMP)
	private Date horodatage_FSC;

	@Temporal(TemporalType.TIMESTAMP)
	private Date horodatage_Imp;

	@Temporal(TemporalType.TIMESTAMP)
	private Date horodatage_poids;

	@Temporal(TemporalType.TIMESTAMP)
	private Date horodatage_Tri;

	@Column(name="id_balance")
	private int idBalance;

	private int largeur;

	private int longueur;

	private String modeFonctionnement;

	private int orientation;

	private int poids;

	private int recirculation;

	private String source;

	private String trafic;

	private String trameBrute;

	private int volume;

	public Coli() {
	}

	public int getIdColis() {
		return this.idColis;
	}

	public void setIdColis(int idColis) {
		this.idColis = idColis;
	}

	public String getAlibi() {
		return this.alibi;
	}

	public void setAlibi(String alibi) {
		this.alibi = alibi;
	}

	public String getCodeEditeur() {
		return this.codeEditeur;
	}

	public void setCodeEditeur(String codeEditeur) {
		this.codeEditeur = codeEditeur;
	}

	public String getCodeEmpPalette() {
		return this.codeEmpPalette;
	}

	public void setCodeEmpPalette(String codeEmpPalette) {
		this.codeEmpPalette = codeEmpPalette;
	}

	public String getCodeLieu() {
		return this.codeLieu;
	}

	public void setCodeLieu(String codeLieu) {
		this.codeLieu = codeLieu;
	}

	public int getCodePicApi() {
		return this.codePicApi;
	}

	public void setCodePicApi(int codePicApi) {
		this.codePicApi = codePicApi;
	}

	public int getCodePicFsc() {
		return this.codePicFsc;
	}

	public void setCodePicFsc(int codePicFsc) {
		this.codePicFsc = codePicFsc;
	}

	public String getCodeTransporteur() {
		return this.codeTransporteur;
	}

	public void setCodeTransporteur(String codeTransporteur) {
		this.codeTransporteur = codeTransporteur;
	}

	public String getCodeTri() {
		return this.codeTri;
	}

	public void setCodeTri(String codeTri) {
		this.codeTri = codeTri;
	}

	public String getCodeZpl() {
		return this.codeZpl;
	}

	public void setCodeZpl(String codeZpl) {
		this.codeZpl = codeZpl;
	}

	public String getErreur() {
		return this.erreur;
	}

	public void setErreur(String erreur) {
		this.erreur = erreur;
	}

	public String getExcedent() {
		return this.excedent;
	}

	public void setExcedent(String excedent) {
		this.excedent = excedent;
	}

	public int getHauteur() {
		return this.hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getHauteurPlc() {
		return this.hauteurPlc;
	}

	public void setHauteurPlc(int hauteurPlc) {
		this.hauteurPlc = hauteurPlc;
	}

	public Date getHorodatage() {
		return this.horodatage;
	}

	public void setHorodatage(Date horodatage) {
		this.horodatage = horodatage;
	}

	public Date getHorodatage_FSC() {
		return this.horodatage_FSC;
	}

	public void setHorodatage_FSC(Date horodatage_FSC) {
		this.horodatage_FSC = horodatage_FSC;
	}

	public Date getHorodatage_Imp() {
		return this.horodatage_Imp;
	}

	public void setHorodatage_Imp(Date horodatage_Imp) {
		this.horodatage_Imp = horodatage_Imp;
	}

	public Date getHorodatage_poids() {
		return this.horodatage_poids;
	}

	public void setHorodatage_poids(Date horodatage_poids) {
		this.horodatage_poids = horodatage_poids;
	}

	public Date getHorodatage_Tri() {
		return this.horodatage_Tri;
	}

	public void setHorodatage_Tri(Date horodatage_Tri) {
		this.horodatage_Tri = horodatage_Tri;
	}

	public int getIdBalance() {
		return this.idBalance;
	}

	public void setIdBalance(int idBalance) {
		this.idBalance = idBalance;
	}

	public int getLargeur() {
		return this.largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getLongueur() {
		return this.longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public String getModeFonctionnement() {
		return this.modeFonctionnement;
	}

	public void setModeFonctionnement(String modeFonctionnement) {
		this.modeFonctionnement = modeFonctionnement;
	}

	public int getOrientation() {
		return this.orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}

	public int getPoids() {
		return this.poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public int getRecirculation() {
		return this.recirculation;
	}

	public void setRecirculation(int recirculation) {
		this.recirculation = recirculation;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTrafic() {
		return this.trafic;
	}

	public void setTrafic(String trafic) {
		this.trafic = trafic;
	}

	public String getTrameBrute() {
		return this.trameBrute;
	}

	public void setTrameBrute(String trameBrute) {
		this.trameBrute = trameBrute;
	}

	public int getVolume() {
		return this.volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}