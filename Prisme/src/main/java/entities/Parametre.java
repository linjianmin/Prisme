package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the parametres database table.
 * 
 */
@Entity
@Table(name="parametres")
@NamedQuery(name="Parametre.findAll", query="SELECT p FROM Parametre p")
public class Parametre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idparametres;

	private String alias;

	private String categorie;

	private String description;

	private String valeur;

	public Parametre() {
	}

	public int getIdparametres() {
		return this.idparametres;
	}

	public void setIdparametres(int idparametres) {
		this.idparametres = idparametres;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getCategorie() {
		return this.categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValeur() {
		return this.valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

}