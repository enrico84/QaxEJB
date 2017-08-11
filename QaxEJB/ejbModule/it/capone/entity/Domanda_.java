package it.capone.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-08-10T15:06:10.761+0200")
@StaticMetamodel(Domanda.class)
public class Domanda_ {
	public static volatile SingularAttribute<Domanda, Integer> iddomanda;
	public static volatile SingularAttribute<Domanda, Date> datacreazione;
	public static volatile SingularAttribute<Domanda, String> descrizione;
	public static volatile SingularAttribute<Domanda, String> titolo;
	public static volatile ListAttribute<Domanda, Commentodomanda> commentodomandas;
	public static volatile SingularAttribute<Domanda, Categoria> categoriaBean;
	public static volatile SingularAttribute<Domanda, Risposta> risposta;
	public static volatile SingularAttribute<Domanda, Utente> utente;
	public static volatile ListAttribute<Domanda, Risposta> rispostas;
}
