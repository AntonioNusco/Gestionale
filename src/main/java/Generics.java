import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.topnetwork.gestionale.dao.jpa.JpaDaoFactory;
import org.topnetwork.gestionale.utility.Utils;

public class Generics <E>{

	
	
	public List<E> queryList(E e) {
		List<E> queryList;
		EntityManager em = JpaDaoFactory.getConnection();
		Query q = em.createNativeQuery("Select * from " + Utils.getNomeClasse(e.getClass().toString()));
		queryList = (List<E>) q.getResultList();
		return queryList;
	}
	
}
