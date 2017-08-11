package it.capone.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the utente database table.
 * 
 */
@Entity
@NamedQuery(name="Utente.findAll", query="SELECT u FROM Utente u")
public class Utente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idutente;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataregistrazione;

	private String email;

	private String nome;

	private String password;

	//bi-directional many-to-one association to Commentodomanda
	@OneToMany(mappedBy="utente")
	private List<Commentodomanda> commentodomandas;

	//bi-directional many-to-one association to Commentorisposta
	@OneToMany(mappedBy="utente")
	private List<Commentorisposta> commentorispostas;

	//bi-directional many-to-one association to Domanda
	@OneToMany(mappedBy="utente")
	private List<Domanda> domandas;

	//bi-directional many-to-one association to Risposta
	@OneToMany(mappedBy="utente")
	private List<Risposta> rispostas;

	public Utente() {
	}

	public int getIdutente() {
		return this.idutente;
	}

	public void setIdutente(int idutente) {
		this.idutente = idutente;
	}

	public Date getDataregistrazione() {
		return this.dataregistrazione;
	}

	public void setDataregistrazione(Date dataregistrazione) {
		this.dataregistrazione = dataregistrazione;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Commentodomanda> getCommentodomandas() {
		return this.commentodomandas;
	}

	public void setCommentodomandas(List<Commentodomanda> commentodomandas) {
		this.commentodomandas = commentodomandas;
	}

	public Commentodomanda addCommentodomanda(Commentodomanda commentodomanda) {
		getCommentodomandas().add(commentodomanda);
		commentodomanda.setUtente(this);

		return commentodomanda;
	}

	public Commentodomanda removeCommentodomanda(Commentodomanda commentodomanda) {
		getCommentodomandas().remove(commentodomanda);
		commentodomanda.setUtente(null);

		return commentodomanda;
	}

	public List<Commentorisposta> getCommentorispostas() {
		return this.commentorispostas;
	}

	public void setCommentorispostas(List<Commentorisposta> commentorispostas) {
		this.commentorispostas = commentorispostas;
	}

	public Commentorisposta addCommentorisposta(Commentorisposta commentorisposta) {
		getCommentorispostas().add(commentorisposta);
		commentorisposta.setUtente(this);

		return commentorisposta;
	}

	public Commentorisposta removeCommentorisposta(Commentorisposta commentorisposta) {
		getCommentorispostas().remove(commentorisposta);
		commentorisposta.setUtente(null);

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
		domanda.setUtente(this);

		return domanda;
	}

	public Domanda removeDomanda(Domanda domanda) {
		getDomandas().remove(domanda);
		domanda.setUtente(null);

		return domanda;
	}

	public List<Risposta> getRispostas() {
		return this.rispostas;
	}

	public void setRispostas(List<Risposta> rispostas) {
		this.rispostas = rispostas;
	}

	public Risposta addRisposta(Risposta risposta) {
		getRispostas().add(risposta);
		risposta.setUtente(this);

		return risposta;
	}

	public Risposta removeRisposta(Risposta risposta) {
		getRispostas().remove(risposta);
		risposta.setUtente(null);

		return risposta;
	}

}