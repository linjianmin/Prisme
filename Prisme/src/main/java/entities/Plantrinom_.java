package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-03-23T14:42:12.220+0100")
@StaticMetamodel(Plantrinom.class)
public class Plantrinom_ {
	public static volatile SingularAttribute<Plantrinom, Integer> idplantrinoms;
	public static volatile SingularAttribute<Plantrinom, Integer> actif;
	public static volatile SingularAttribute<Plantrinom, String> chuteNA;
	public static volatile SingularAttribute<Plantrinom, String> chuteNL;
	public static volatile SingularAttribute<Plantrinom, String> chuteRE;
	public static volatile SingularAttribute<Plantrinom, Integer> controle;
	public static volatile SingularAttribute<Plantrinom, Date> dateModif;
	public static volatile SingularAttribute<Plantrinom, Integer> edition;
	public static volatile SingularAttribute<Plantrinom, String> nom;
	public static volatile SingularAttribute<Plantrinom, String> trafic;
	public static volatile ListAttribute<Plantrinom, Plantridonnee> plantridonnees;
}
