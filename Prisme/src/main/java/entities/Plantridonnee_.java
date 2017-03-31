package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-03-28T10:24:46.310+0200")
@StaticMetamodel(Plantridonnee.class)
public class Plantridonnee_ {
	public static volatile SingularAttribute<Plantridonnee, String> idplantridonnees;
	public static volatile SingularAttribute<Plantridonnee, String> codetriprisme;
	public static volatile SingularAttribute<Plantridonnee, String> chute;
	public static volatile SingularAttribute<Plantridonnee, String> codeEmpPalette;
	public static volatile SingularAttribute<Plantridonnee, Integer> codeTriMaxi;
	public static volatile SingularAttribute<Plantridonnee, Integer> codeTriMini;
	public static volatile SingularAttribute<Plantridonnee, String> erreur;
	public static volatile SingularAttribute<Plantridonnee, Plantrinom> plantrinom;
	public static volatile SingularAttribute<Plantridonnee, String> libChute;
	public static volatile SingularAttribute<Plantridonnee, String> libEmpPalette;
	public static volatile SingularAttribute<Plantridonnee, String> trameBrute;
}
