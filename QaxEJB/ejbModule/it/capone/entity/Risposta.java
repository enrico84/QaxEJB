package it.capone.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the risposta database table.
 * 
 */
@Entity
@NamedQuery(name="Risposta.findAll", query="SELECT r FROM Risposta r")
public class Risposta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idrisposta;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datacreazione;

	@Lob
	private String descrizione;

	//bi-directional many-to-one association to Commentorisposta
	@OneToMany(mappedBy="risposta")
	private List<Commentorisposta> commentorispostas;

	//bi-directional many-to-one association to Domanda
	@OneToMany(mappedBy="risposta")
	private List<Domanda> domandas;

	//bi-directional many-to-one association to Utente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idutente")
	private Utente utente;

	//bi-directional many-to-one association to Domanda
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="iddomanda")
	private Domanda domanda;

	public Risposta() {
	}

	public int getIdrisposta() {
		return this.idrisposta;
	}

	public void setIdrisposta(int idrisposta) {
		this.idrisposta = idrisposta;
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

	public List<Commentorisposta> getCommentorispostas() {
		return this.commentorispostas;
	}

	public void setCommentorispostas(List<Commentorisposta> commentorispostas) {
		this.commentorispostas = commentorispostas;
	}

	public Commentorisposta addCommentorisposta(Commentorisposta commentorisposta) {
		getCommentorispostas().add(commentorisposta);
		commentorisposta.setRisposta(this);

		return commentorisposta;
	}

	public Commentorisposta removeCommentorisposta(Commentorisposta commentorisposta) {
		getCommentorispostas().remove(commentorisposta);
		commentorisposta.setRisposta(null);

		return commentorisposta;
	}

	public List<Domanda> getDomandas() {
		return this.domandas;
	}

	public void setDomandas(List<Domanda> domandas) {
		this.domandas = domandas;
	}

	public Domanda addDomanda(Domanda domanda) {
		getDomandas().add(domanda);
		domanda.setRisposta(this);

		return domanda;
	}

	public Domanda removeDomanda(Domanda domanda) {
		getDomandas().remove(domanda);
		domanda.setRisposta(null);

		return domanda;
	}

	public Utente getUtente() {
		return this.utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Domanda getDomanda() {
		return this.domanda;
	}

	public void setDomanda(Domanda domanda) {
		this.domanda = domanda;
	}

}