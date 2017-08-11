package it.capone.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the commentorisposta database table.
 * 
 */
@Entity
@NamedQuery(name="Commentorisposta.findAll", query="SELECT c FROM Commentorisposta c")
public class Commentorisposta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcommentorisposta;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datacreazione;

	@Lob
	private String descrizione;

	//bi-directional many-to-one association to Risposta
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idrisposta")
	private Risposta risposta;

	//bi-directional many-to-one association to Utente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idutente")
	private Utente utente;

	public Commentorisposta() {
	}

	public int getIdcommentorisposta() {
		return this.idcommentorisposta;
	}

	public void setIdcommentorisposta(int idcommentorisposta) {
		this.idcommentorisposta = idcommentorisposta;
	}

	public Date getDatacreazione() {
		return this.datacreazione;
	}

	public void setDatacreazione(Date datacreazione) {
		this.datacreazione = datacreazione;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Risposta getRisposta() {
		return this.risposta;
	}

	public void setRisposta(Risposta risposta) {
		this.risposta = risposta;
	}

	public Utente getUtente() {
		return this.utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

}