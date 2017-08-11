package it.capone.businessDAO;

import java.util.List;

import javax.ejb.Local;

@Local
public interface GenericDAOLocal<E, K> {
	
	 void persist(E entity);
	 
	 void merge(E entity);
	 
	 void remove(E entity);
	 
	 void removeById(Class<E> c, K id);
	 
	 List<E> findAll(Class<E> c);
	 
	 E findById(Class<E> c, K id);

}
