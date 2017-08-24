package it.capone.service;

import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.management.RuntimeErrorException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


import it.capone.bean.CategoriaBean;
import it.capone.bean.DomandaBean;
import it.capone.bean.ListaDomandeBean;
import it.capone.bean.ListaRisposteBean;
import it.capone.bean.LoginBean;
import it.capone.businessDAO.DomandaDAOImpl;
import it.capone.businessDAO.DomandaDAORemote;
//import it.capone.dao.DomandaDAO;
import it.capone.entity.Domanda;

public class CGestioneDomande {
	
	//static DomandaDAO domandaDAO = new DomandaDAO();
	//private DomandaDAORemote domandaDAO;
	
	//@EJB
	private DomandaDAORemote domandaService;
	
	
	public CGestioneDomande() throws RuntimeException {
		try {
			if(new InitialContext().lookup("java:global/QaxEJB/DomandaDAOImpl!it.capone.businessDAO.DomandaDAORemote") instanceof DomandaDAORemote)
				domandaService = (DomandaDAORemote) new InitialContext().lookup("java:global/QaxEJB/DomandaDAOImpl!it.capone.businessDAO.DomandaDAORemote");
			
			else {
				System.out.println("Instanceof non ha funzionato");
			}
			
		}
		catch(NamingException ex) {
			throw new RuntimeException(ex);
		}
	}
	 
	
	
	public List<Domanda> getDomande() {
		List<Domanda> domande = domandaService.getDomande();
		return domande;
	}
	
	public ListaDomandeBean getDomande(ListaDomandeBean listaDomande){
		//DomandaDAO domandaDAO = new DomandaDAO();
		domandaService.getDomande(listaDomande);
		return listaDomande;
	}
	
	
	public ListaDomandeBean getDomande(ListaDomandeBean listaDomande, String categoria) {
		//DomandaDAO domandaDAO = new DomandaDAO();
		domandaService.getDomande(listaDomande, categoria);
		return listaDomande;
	}
	
	
	public DomandaBean getDomandaConRisposte(int id, DomandaBean domanda, ListaRisposteBean listaRisposta) {
		//DomandaDAO domandaDAO = new DomandaDAO();
		domandaService.getDomandaConRisposte(id, domanda, listaRisposta);
		return domanda;
	}
	
	
	public ListaDomandeBean getMieDomande(String username, String password, ListaDomandeBean myListaDomande) {
		//DomandaDAO domandaDAO = new DomandaDAO();
		domandaService.getMieDomande(username, password, myListaDomande);
		return myListaDomande;
		
	}
	
	
	public void creaDomanda(String titolo, String descrizione, String categoria, LoginBean utente) {
		domandaService.creaDomanda(titolo, descrizione, categoria, utente);	
	}
	
	
	public void creaDomanda(DomandaBean domanda, String titolo, String descrizione, String categoria, LoginBean utente) {
		domandaService.creaDomanda(domanda, titolo, descrizione, categoria, utente);
	}
	
	
	public void aggiornaDomanda(CategoriaBean categoriaBean, int iddomanda, String titolo, String descrizione, 
			                       String categoria) {
		domandaService.aggiornaDomanda(categoriaBean, iddomanda, titolo, descrizione, categoria);
		
	}
	
	
	public void eliminaDomanda(int idDomanda) {
		domandaService.eliminaDomanda(idDomanda);
	}
	
	
	public LoginBean prendiUtente(int id) {
		LoginBean utente = domandaService.prendiUtente(id);
		
		return utente;
	}
	
	
	public DomandaBean prendiDomanda(int iddomanda) {
		DomandaBean domanda = domandaService.prendiDomanda(iddomanda);
	
		return domanda;	
	}
	
	

}
