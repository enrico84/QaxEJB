package it.capone.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-08-10T15:06:10.746+0200")
@StaticMetamodel(Commentorisposta.class)
public class Commentorisposta_ {
	public static volatile SingularAttribute<Commentorisposta, Integer> idcommentorisposta;
	public static volatile SingularAttribute<Commentorisposta, Date> datacreazione;
	public static volatile SingularAttribute<Commentorisposta, String> descrizione;
	public static volatile SingularAttribute<Commentorisposta, Risposta> risposta;
	public static volatile SingularAttribute<Commentorisposta, Utente> utente;
}
