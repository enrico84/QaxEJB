package it.capone.businessDAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import it.capone.bean.CategoriaBean;
import it.capone.bean.DomandaBean;
import it.capone.bean.ListaDomandeBean;
import it.capone.bean.ListaRisposteBean;
import it.capone.bean.LoginBean;
import it.capone.entity.Domanda;

/**
 * Session Bean implementation class DomandaDAOImpl
 */
@Stateless
public class DomandaDAOImpl implements DomandaDAORemote, DomandaDAOLocal {
	
	@PersistenceContext(unitName="QaxEJB-PU")
	protected EntityManager em;	
	
	@Override
	public List<Domanda> getDomande() {
		List<Domanda> domande = em.createNamedQuery("Domanda.findAll").setMaxResults(10).getResultList();
		return domande;
	}

	@Override
	public ListaDomandeBean getDomande(ListaDomandeBean listaDomande) {
		return null;
	}

	@Override
	public ListaDomandeBean getDomande(ListaDomandeBean listaDomande, String categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DomandaBean getDomandaConRisposte(int id, DomandaBean domanda, ListaRisposteBean listaRisposta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListaDomandeBean getMieDomande(String username, String password, ListaDomandeBean myListaDomande) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creaDomanda(String titolo, String descrizione, String categoria, LoginBean utente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creaDomanda(DomandaBean domanda, String titolo, String descrizione, String categoria,
			LoginBean utente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aggiornaDomanda(CategoriaBean categoriaBean, int iddomanda, String titolo, String descrizione,
			String categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminaDomanda(int idDomanda) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LoginBean prendiUtente(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DomandaBean prendiDomanda(int iddomanda) {
		// TODO Auto-generated method stub
		return null;
	}


}
