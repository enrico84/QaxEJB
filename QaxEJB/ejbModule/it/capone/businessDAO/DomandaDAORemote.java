package it.capone.businessDAO;

import javax.ejb.Remote;

import it.capone.bean.CategoriaBean;
import it.capone.bean.DomandaBean;
import it.capone.bean.ListaDomandeBean;
import it.capone.bean.ListaRisposteBean;
import it.capone.bean.LoginBean;


@Remote
public interface DomandaDAORemote {
	
	ListaDomandeBean getDomande(ListaDomandeBean listaDomande);
	
	
	ListaDomandeBean getDomande(ListaDomandeBean listaDomande, String categoria);
	
	
	DomandaBean getDomandaConRisposte(int id, DomandaBean domanda, ListaRisposteBean listaRisposta);
	
	
	ListaDomandeBean getMieDomande(String username, String password, ListaDomandeBean myListaDomande);
	
	
	void creaDomanda(String titolo, String descrizione, String categoria, LoginBean utente);
	
	void creaDomanda(DomandaBean domanda, String titolo, String descrizione, String categoria, LoginBean utente);
	
	
	void aggiornaDomanda(CategoriaBean categoriaBean, int iddomanda, String titolo, String descrizione, 
			                       String categoria);
	
	
	void eliminaDomanda(int idDomanda);
	
	
	LoginBean prendiUtente(int id);	
	
	
	DomandaBean prendiDomanda(int iddomanda);

}
