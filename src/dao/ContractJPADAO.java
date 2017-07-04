package dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.ContractDAO;
import objects.Contract;
import objects.Person;

	public class ContractJPADAO  extends JPAAbstract<Contract> implements ContractDAO {
		@Override
		public String getEntityName() {
			return Contract.class.getSimpleName();
		}
		
		@Override
		public List<Contract> searchForManager(String name) {

			
			String jpql = "select c from " + getEntityName() + " c where c.manager.name like :n";
			Query query = super.getQuery(jpql);
			
			query.setParameter("n", "%" + name + "%");
			

			@SuppressWarnings({ "rawtypes", "unchecked" })
			List<Contract> list = query.getResultList();
		
			return list;
		}


	}
