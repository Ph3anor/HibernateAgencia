package dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import objects.Contract;
import objects.Person;

public abstract class JPAAbstract<T extends E> extends JPAConnection implements DAOFactory {
	
	
	public void include(T o) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
		em.close();
	}
	
	public void add(T c) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
	}

	public T searchForId(int id) {
		
		String jpql = "select c from " + getEntityName() + " c where c.id = " +id;
		Query query = super.getQuery(jpql);
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<T> list = query.getResultList();
		
		for (T object : list) {
			return object;
		}
		
		return null;
	}
	
	public T searchForManager(Person manager) {
		
		String jpql = "select c from " + getEntityName() + " c where c.manager_id = " +manager;
		Query query = super.getQuery(jpql);
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<T> list = query.getResultList();
		
		for (T object : list) {
			return object;
		}
		
		return null;
	}
	
	public void delete(T c) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		c = (T) em.find(c.getClass(), c.getId());
		em.remove(c);
		em.getTransaction().commit();
		em.close();
	}
	
	public void edit(T o) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.merge(o);
		em.getTransaction().commit();
		em.close();
	}
	
	public abstract String getEntityName();
	

}
