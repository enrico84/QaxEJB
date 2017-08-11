package it.capone.service;


import javax.ejb.EJB;
import javax.ejb.Stateless;

import it.capone.bean.CategoriaBean;
import it.capone.bean.DomandaBean;
import it.capone.bean.ListaDomandeBean;
import it.capone.bean.ListaRisposteBean;
import it.capone.bean.LoginBean;
import it.capone.businessDAO.DomandaDAOImpl;
import it.capone.entity.Domanda;

/**
 * Session Bean implementation class DomandaServiceImpl
 */
@Stateless
public class DomandaServiceImpl extends GenericServiceImpl<Domanda, Integer> 
				implements DomandaServiceRemote, DomandaServiceLocal {

    @EJB
    protected DomandaDAOImpl dao;
    
    
    public ListaDomandeBean getDomande(ListaDomandeBean listaDomande) {
    	return dao.getDomande(listaDomande);

    }
    
	public ListaDomandeBean getDomande(ListaDomandeBean listaDomande, String categoria) {
		//return dao.getDomande(listaDomande, categoria);
		return null;
	}

	public DomandaBean getDomandaConRisposte(int id, DomandaBean domanda, ListaRisposteBean listaRisposta) {
		//return dao.getDomandaConRisposte(id, domanda, listaRisposta);
		return null;
	}

	public ListaDomandeBean getMieDomande(String username, String password, ListaDomandeBean myListaDomande) {
		//return dao.getMieDomande(username, password, myListaDomande);
		return null;
	}

	public void creaDomanda(String titolo, String descrizione, String categoria, LoginBean utente) {
		//dao.creaDomanda(titolo, descrizione, categoria, utente);
		
	}

	public void creaDomanda(DomandaBean domanda, String titolo, String descrizione, String categoria,
			LoginBean utente) {
		//dao.creaDomanda(domanda, titolo, descrizione, categoria, utente);
		
	}

	public void aggiornaDomanda(CategoriaBean categoriaBean, int iddomanda, String titolo, String descrizione,
			String categoria) {
		//dao.aggiornaDomanda(categoriaBean, iddomanda, titolo, descrizione, categoria);
		
		
	}

	public void eliminaDomanda(int idDomanda) {
		//dao.eliminaDomanda(idDomanda);
		
	}

	public LoginBean prendiUtente(int id) {
		//return dao.prendiUtente(id);
		return null;
	}

	public DomandaBean prendiDomanda(int iddomanda) {
		//return dao.prendiDomanda(iddomanda);
		return null;
	}

}
