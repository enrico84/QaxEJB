package it.capone.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-08-10T15:06:11.277+0200")
@StaticMetamodel(Utente.class)
public class Utente_ {
	public static volatile SingularAttribute<Utente, Integer> idutente;
	public static volatile SingularAttribute<Utente, Date> dataregistrazione;
	public static volatile SingularAttribute<Utente, String> email;
	public static volatile SingularAttribute<Utente, String> nome;
	public static volatile SingularAttribute<Utente, String> password;
	public static volatile ListAttribute<Utente, Commentodomanda> commentodomandas;
	public static volatile ListAttribute<Utente, Commentorisposta> commentorispostas;
	public static volatile ListAttribute<Utente, Domanda> domandas;
	public static volatile ListAttribute<Utente, Risposta> rispostas;
}
