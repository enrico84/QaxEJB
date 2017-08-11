package it.capone.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the domanda database table.
 * 
 */
@Entity
@NamedQuery(name="Domanda.findAll", query="SELECT d FROM Domanda d")
public class Domanda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iddomanda;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datacreazione;

	@Lob
	private String descrizione;

	private String titolo;

	//bi-directional many-to-one association to Commentodomanda
	@OneToMany(mappedBy="domanda")
	private List<Commentodomanda> commentodomandas;

	//bi-directional many-to-one association to Categoria
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="categoria")
	private Categoria categoriaBean;

	//bi-directional many-to-one association to Risposta
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idrispostascelta")
	private Risposta risposta;

	//bi-directional many-to-one association to Utente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idutente")
	private Utente utente;

	//bi-directional many-to-one association to Risposta
	@OneToMany(mappedBy="domanda")
	private List<Risposta> rispostas;

	public Domanda() {
	}

	public int getIddomanda() {
		return this.iddomanda;
	}

	public void setIddomanda(int iddomanda) {
		this.iddomanda = iddomanda;
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

	public String getTitolo() {
		return this.titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public List<Commentodomanda> getCommentodomandas() {
		return this.commentodomandas;
	}

	public void setCommentodomandas(List<Commentodomanda> commentodomandas) {
		this.commentodomandas = commentodomandas;
	}

	public Commentodomanda addCommentodomanda(Commentodomanda commentodomanda) {
		getCommentodomandas().add(commentodomanda);
		commentodomanda.setDomanda(this);

		return commentodomanda;
	}

	public Commentodomanda removeCommentodomanda(Commentodomanda commentodomanda) {
		getCommentodomandas().remove(commentodomanda);
		commentodomanda.setDomanda(null);

		return commentodomanda;
	}

	public Categoria getCategoriaBean() {
		return this.categoriaBean;
	}

	public void setCategoriaBean(Categoria categoriaBean) {
		this.categoriaBean = categoriaBean;
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

	public List<Risposta> getRispostas() {
		return this.rispostas;
	}

	public void setRispostas(List<Risposta> rispostas) {
		this.rispostas = rispostas;
	}

	public Risposta addRisposta(Risposta risposta) {
		getRispostas().add(risposta);
		risposta.setDomanda(this);

		return risposta;
	}

	public Risposta removeRisposta(Risposta risposta) {
		getRispostas().remove(risposta);
		risposta.setDomanda(null);

		return risposta;
	}

}