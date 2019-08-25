package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import util.JPAUtil;

public abstract class GenericDao<T> {

	public void save(T t) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}
	
	public void update(T t) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remove(T t) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(t));
		em.getTransaction().commit();
		em.close();
	}
	
	public T findById(Class clazz, Integer id) {
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		T t = (T) em.find(clazz, id);
		em.close();
		return t;
	}
	
	public List<T> findAll(Class clazz) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("FROM "+clazz.getName());
		return query.getResultList();
	}
	
	public List<T> findByDesc(Class clazz, String campo, String desc) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("FROM "+clazz.getName()+ " WHERE "+campo+" like '%"+desc+"%'");
		return query.getResultList();
	}
}
