package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-03-16T12:20:21.514+0100")
@StaticMetamodel(Statistiqueshisto.class)
public class Statistiqueshisto_ {
	public static volatile SingularAttribute<Statistiqueshisto, Integer> idStatistiquesHisto;
	public static volatile SingularAttribute<Statistiqueshisto, Integer> colis;
	public static volatile SingularAttribute<Statistiqueshisto, String> defaut;
	public static volatile SingularAttribute<Statistiqueshisto, Date> horodatage;
	public static volatile SingularAttribute<Statistiqueshisto, String> idStatistiques;
	public static volatile SingularAttribute<Statistiqueshisto, Integer> incoherent;
	public static volatile SingularAttribute<Statistiqueshisto, Integer> indisponibilite;
	public static volatile SingularAttribute<Statistiqueshisto, Integer> indisponibiliteTotale;
	public static volatile SingularAttribute<Statistiqueshisto, String> inhibe;
	public static volatile SingularAttribute<Statistiqueshisto, Integer> modeFonctionnement;
	public static volatile SingularAttribute<Statistiqueshisto, Integer> multiple;
	public static volatile SingularAttribute<Statistiqueshisto, Integer> nbreDefaut;
	public static volatile SingularAttribute<Statistiqueshisto, Integer> nonLu;
	public static volatile SingularAttribute<Statistiqueshisto, Integer> nonRecu;
	public static volatile SingularAttribute<Statistiqueshisto, Integer> requete;
	public static volatile SingularAttribute<Statistiqueshisto, Integer> tempsFonctionnement;
	public static volatile SingularAttribute<Statistiqueshisto, Integer> tempsUtilisation;
}
