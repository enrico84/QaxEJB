package it.capone.businessDAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class GenericDAOImpl
 */
@Stateless
public class GenericDAOImpl<E, K> implements GenericDAORemote<E, K>, GenericDAOLocal<E, K> {

	@PersistenceContext(unitName="QaxEJB")
	protected EntityManager em;	

	//@Override
	public void persist(E entity) {
		em.persist(entity);	
	}

	
	//@Override
	public void merge(E entity) {
		em.merge(entity);
	}

	
	//@Override
	public void remove(E entity) {
		em.remove(entity);
	}

	
	//@Override
	public void removeById(Class<E> c, K id) {
		E entity = em.find(c, id);
		em.remove(entity);
	}

	
	//@Override
		public List<E> findAll(Class<E> c) {
			return (List<E>) em.createNamedQuery(c.getSimpleName()+".findAll").getResultList();
//			return (List<E>) em.createNativeQuery(c.getSimpleName()+".findAll", c)
//					 .getResultList();
	}
		
	//@Override
	public E findById(Class<E> eClass, K id) {
		return em.find(eClass, id);
	}


}
