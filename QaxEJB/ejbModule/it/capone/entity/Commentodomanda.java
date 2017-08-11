package it.capone.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the commentodomanda database table.
 * 
 */
@Entity
@NamedQuery(name="Commentodomanda.findAll", query="SELECT c FROM Commentodomanda c")
public class Commentodomanda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcommentodomanda;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datacreazione;

	@Lob
	private String descrizione;

	//bi-directional many-to-one association to Domanda
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="iddomanda")
	private Domanda domanda;

	//bi-directional many-to-one association to Utente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idutente")
	private Utente utente;

	public Commentodomanda() {
	}

	public int getIdcommentodomanda() {
		return this.idcommentodomanda;
	}

	public void setIdcommentodomanda(int idcommentodomanda) {
		this.idcommentodomanda = idcommentodomanda;
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

	public Domanda getDomanda() {
		return this.domanda;
	}

	public void setDomanda(Domanda domanda) {
		this.domanda = domanda;
	}

	public Utente getUtente() {
		return this.utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

}