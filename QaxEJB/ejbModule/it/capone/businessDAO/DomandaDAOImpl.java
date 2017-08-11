package it.capone.businessDAO;

import java.util.List;

import javax.ejb.Stateless;


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
public class DomandaDAOImpl extends GenericDAOImpl<Domanda, Integer> 
			implements DomandaDAORemote, DomandaDAOLocal {


	public ListaDomandeBean getDomande(ListaDomandeBean listaDomande) {
		List<Domanda> domande = em.createNamedQuery("Domanda.findAllLimitTen").setMaxResults(10).getResultList();
		listaDomande = (ListaDomandeBean) domande;
		return listaDomande;
	}

	public ListaDomandeBean getDomande(ListaDomandeBean listaDomande, String categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	public DomandaBean getDomandaConRisposte(int id, DomandaBean domanda, ListaRisposteBean listaRisposta) {
		// TODO Auto-generated method stub
		return null;
	}

	public ListaDomandeBean getMieDomande(String username, String password, ListaDomandeBean myListaDomande) {
		// TODO Auto-generated method stub
		return null;
	}

	public void creaDomanda(String titolo, String descrizione, String categoria, LoginBean utente) {
		// TODO Auto-generated method stub
		
	}

	public void creaDomanda(DomandaBean domanda, String titolo, String descrizione, String categoria,
			LoginBean utente) {
		// TODO Auto-generated method stub
		
	}

	public void aggiornaDomanda(CategoriaBean categoriaBean, int iddomanda, String titolo, String descrizione,
			String categoria) {
		// TODO Auto-generated method stub
		
	}

	public void eliminaDomanda(int idDomanda) {
		// TODO Auto-generated method stub
		
	}

	public LoginBean prendiUtente(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public DomandaBean prendiDomanda(int iddomanda) {
		// TODO Auto-generated method stub
		return null;
	}

}
