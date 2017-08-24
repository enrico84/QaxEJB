package it.capone.test;

import java.util.List;

import it.capone.bean.DomandaBean;
import it.capone.bean.ListaDomandeBean;
import it.capone.entity.Domanda;
import it.capone.service.CGestioneDomande;

public class MainGestioneDomande {

	public static void main(String[] args) {
		CGestioneDomande cgd = new CGestioneDomande();
		
//		ListaDomandeBean listaDomande = new ListaDomandeBean();
//		ListaDomandeBean listaDomandeNew = cgd.getDomande(listaDomande);
//		DomandaBean[] domande = (DomandaBean[]) listaDomandeNew.getListaDomande().
//				toArray(new DomandaBean[listaDomandeNew.getDimensione()]);
//		
//		stampaDomande(domande);
		
		List<Domanda> lista = cgd.getDomande();
		for(Domanda d : lista) {
			System.out.println("Titolo domanda: " +d.getTitolo());
		}
	}



	public static void stampaDomande(DomandaBean[] listaDomande) {
		for(int i=0; i<listaDomande.length; i++) {
			System.out.println("Titolo domanda: " +listaDomande[i].getTitolo()
			+"\nDescrizione: " +listaDomande[i].getDescrizione()+""
			+ "\nUtente " +listaDomande[i].getUtente());
		}
	}
}
