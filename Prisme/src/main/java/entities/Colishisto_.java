package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-03-21T15:34:44.977+0100")
@StaticMetamodel(Colishisto.class)
public class Colishisto_ {
	public static volatile SingularAttribute<Colishisto, Integer> idColisHisto;
	public static volatile SingularAttribute<Colishisto, String> alibi;
	public static volatile SingularAttribute<Colishisto, String> codeEditeur;
	public static volatile SingularAttribute<Colishisto, String> codeEmpPalette;
	public static volatile SingularAttribute<Colishisto, String> codeLieu;
	public static volatile SingularAttribute<Colishisto, Integer> codePicApi;
	public static volatile SingularAttribute<Colishisto, Integer> codePicFsc;
	public static volatile SingularAttribute<Colishisto, String> codeTransporteur;
	public static volatile SingularAttribute<Colishisto, String> codeTri;
	public static volatile SingularAttribute<Colishisto, String> codeZpl;
	public static volatile SingularAttribute<Colishisto, String> erreur;
	public static volatile SingularAttribute<Colishisto, String> excedent;
	public static volatile SingularAttribute<Colishisto, Integer> hauteur;
	public static volatile SingularAttribute<Colishisto, Integer> hauteurPlc;
	public static volatile SingularAttribute<Colishisto, Date> horodatage;
	public static volatile SingularAttribute<Colishisto, Date> horodatage_FSC;
	public static volatile SingularAttribute<Colishisto, Date> horodatage_Imp;
	public static volatile SingularAttribute<Colishisto, Date> horodatage_poids;
	public static volatile SingularAttribute<Colishisto, Date> horodatage_Tri;
	public static volatile SingularAttribute<Colishisto, Integer> idBalance;
	public static volatile SingularAttribute<Colishisto, Integer> idColis;
	public static volatile SingularAttribute<Colishisto, Integer> largeur;
	public static volatile SingularAttribute<Colishisto, Integer> longueur;
	public static volatile SingularAttribute<Colishisto, String> modeFonctionnement;
	public static volatile SingularAttribute<Colishisto, Integer> orientation;
	public static volatile SingularAttribute<Colishisto, Integer> poids;
	public static volatile SingularAttribute<Colishisto, Integer> recirculation;
	public static volatile SingularAttribute<Colishisto, String> source;
	public static volatile SingularAttribute<Colishisto, String> trafic;
	public static volatile SingularAttribute<Colishisto, String> trameBrute;
	public static volatile SingularAttribute<Colishisto, Integer> volume;
}
