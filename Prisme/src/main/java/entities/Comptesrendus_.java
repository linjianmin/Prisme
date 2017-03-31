package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-03-16T12:20:21.475+0100")
@StaticMetamodel(Comptesrendus.class)
public class Comptesrendus_ {
	public static volatile SingularAttribute<Comptesrendus, String> idComptesRendus;
	public static volatile SingularAttribute<Comptesrendus, String> alibi;
	public static volatile SingularAttribute<Comptesrendus, String> codeLieu;
	public static volatile SingularAttribute<Comptesrendus, String> codeLu;
	public static volatile SingularAttribute<Comptesrendus, String> codeTransporteur;
	public static volatile SingularAttribute<Comptesrendus, String> excedent;
	public static volatile SingularAttribute<Comptesrendus, Integer> fait;
	public static volatile SingularAttribute<Comptesrendus, Date> horodatage;
	public static volatile SingularAttribute<Comptesrendus, String> idBalance;
	public static volatile SingularAttribute<Comptesrendus, String> modeFonctionnement;
	public static volatile SingularAttribute<Comptesrendus, String> poids;
}
