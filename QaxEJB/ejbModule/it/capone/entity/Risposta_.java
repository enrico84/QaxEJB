package it.capone.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-08-10T15:06:11.246+0200")
@StaticMetamodel(Risposta.class)
public class Risposta_ {
	public static volatile SingularAttribute<Risposta, Integer> idrisposta;
	public static volatile SingularAttribute<Risposta, Date> datacreazione;
	public static volatile SingularAttribute<Risposta, String> descrizione;
	public static volatile ListAttribute<Risposta, Commentorisposta> commentorispostas;
	public static volatile ListAttribute<Risposta, Domanda> domandas;
	public static volatile SingularAttribute<Risposta, Utente> utente;
	public static volatile SingularAttribute<Risposta, Domanda> domanda;
}
