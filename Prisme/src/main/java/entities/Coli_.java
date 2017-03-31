package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-03-21T15:34:44.954+0100")
@StaticMetamodel(Coli.class)
public class Coli_ {
	public static volatile SingularAttribute<Coli, Integer> idColis;
	public static volatile SingularAttribute<Coli, String> alibi;
	public static volatile SingularAttribute<Coli, String> codeEditeur;
	public static volatile SingularAttribute<Coli, String> codeEmpPalette;
	public static volatile SingularAttribute<Coli, String> codeLieu;
	public static volatile SingularAttribute<Coli, Integer> codePicApi;
	public static volatile SingularAttribute<Coli, Integer> codePicFsc;
	public static volatile SingularAttribute<Coli, String> codeTransporteur;
	public static volatile SingularAttribute<Coli, String> codeTri;
	public static volatile SingularAttribute<Coli, String> codeZpl;
	public static volatile SingularAttribute<Coli, String> erreur;
	public static volatile SingularAttribute<Coli, String> excedent;
	public static volatile SingularAttribute<Coli, Integer> hauteur;
	public static volatile SingularAttribute<Coli, Integer> hauteurPlc;
	public static volatile SingularAttribute<Coli, Date> horodatage;
	public static volatile SingularAttribute<Coli, Date> horodatage_FSC;
	public static volatile SingularAttribute<Coli, Date> horodatage_Imp;
	public static volatile SingularAttribute<Coli, Date> horodatage_poids;
	public static volatile SingularAttribute<Coli, Date> horodatage_Tri;
	public static volatile SingularAttribute<Coli, Integer> idBalance;
	public static volatile SingularAttribute<Coli, Integer> largeur;
	public static volatile SingularAttribute<Coli, Integer> longueur;
	public static volatile SingularAttribute<Coli, String> modeFonctionnement;
	public static volatile SingularAttribute<Coli, Integer> orientation;
	public static volatile SingularAttribute<Coli, Integer> poids;
	public static volatile SingularAttribute<Coli, Integer> recirculation;
	public static volatile SingularAttribute<Coli, String> source;
	public static volatile SingularAttribute<Coli, String> trafic;
	public static volatile SingularAttribute<Coli, String> trameBrute;
	public static volatile SingularAttribute<Coli, Integer> volume;
}
