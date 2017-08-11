package it.capone.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-08-10T15:06:10.543+0200")
@StaticMetamodel(Commentodomanda.class)
public class Commentodomanda_ {
	public static volatile SingularAttribute<Commentodomanda, Integer> idcommentodomanda;
	public static volatile SingularAttribute<Commentodomanda, Date> datacreazione;
	public static volatile SingularAttribute<Commentodomanda, String> descrizione;
	public static volatile SingularAttribute<Commentodomanda, Domanda> domanda;
	public static volatile SingularAttribute<Commentodomanda, Utente> utente;
}
