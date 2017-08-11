package it.capone.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the categoria database table.
 * 
 */
@Entity
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcategoria;

	private String nome;

	//bi-directional many-to-one association to Domanda
	@OneToMany(mappedBy="categoriaBean")
	private List<Domanda> domandas;

	public Categoria() {
	}

	public int getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Domanda> getDomandas() {
		return this.domandas;
	}

	public void setDomandas(List<Domanda> domandas) {
		this.domandas = domandas;
	}

	public Domanda addDomanda(Domanda domanda) {
		getDomandas().add(domanda);
		domanda.setCategoriaBean(this);

		return domanda;
	}

	public Domanda removeDomanda(Domanda domanda) {
		getDomandas().remove(domanda);
		domanda.setCategoriaBean(null);

		return domanda;
	}

}