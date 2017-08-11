package it.capone.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import it.capone.businessDAO.GenericDAORemote;

/**
 * Session Bean implementation class GenericServiceImpl
 */
@Stateless
public class GenericServiceImpl<E, K> implements 
						GenericServiceRemote<E, K>, GenericServiceLocal<E, K> {

	@EJB
    protected GenericDAORemote<E, K> dao;

    
  //@Override
	public void persist(E entity) {
		dao.persist(entity);
		
	}

	
	//@Override
	public void merge(E entity) {
		dao.merge(entity);
		
	}

	
	//@Override
	public void remove(E entity) {
		dao.remove(entity);	
		
	}

	
	//@Override
	public void removeById(Class<E> c, K id) {
		dao.removeById(c, id);
		
	}

	
	//@Override
	public List<E> findAll(Class<E> c) {
		return dao.findAll(c);
	}

	
	//@Override
	public E findById(Class<E> c, K id) {
		return dao.findById(c, id);
	}

}
