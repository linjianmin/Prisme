package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-03-16T12:20:21.508+0100")
@StaticMetamodel(Statistique.class)
public class Statistique_ {
	public static volatile SingularAttribute<Statistique, String> idStatistiques;
	public static volatile SingularAttribute<Statistique, Integer> colis;
	public static volatile SingularAttribute<Statistique, String> defaut;
	public static volatile SingularAttribute<Statistique, Integer> incoherent;
	public static volatile SingularAttribute<Statistique, Integer> indisponibilite;
	public static volatile SingularAttribute<Statistique, Integer> indisponibiliteTotale;
	public static volatile SingularAttribute<Statistique, String> inhibe;
	public static volatile SingularAttribute<Statistique, Integer> modeFonctionnement;
	public static volatile SingularAttribute<Statistique, Integer> multiple;
	public static volatile SingularAttribute<Statistique, Integer> nbreDefaut;
	public static volatile SingularAttribute<Statistique, Integer> nonLu;
	public static volatile SingularAttribute<Statistique, Integer> nonRecu;
	public static volatile SingularAttribute<Statistique, Integer> requete;
	public static volatile SingularAttribute<Statistique, Integer> tempsFonctionnement;
	public static volatile SingularAttribute<Statistique, Integer> tempsUtilisation;
}
