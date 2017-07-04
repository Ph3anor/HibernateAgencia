package dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import objects.Agency;
import objects.Contract;
import objects.Person;

	public class AgencyJPADAO  extends JPAAbstract<Agency> implements AgencyDAO {

		@Override
		public String getEntityName() {
			return Agency.class.getSimpleName();
		}

		
		@Override
		public List<Agency> searchForBoss (String manager) {

			
			String jpql = "select c from " + getEntityName() + " c where c.manager like :n";
			Query query = super.getQuery(jpql);
			
			query.setParameter("n", "%" + manager + "%");
			

			@SuppressWarnings({ "rawtypes", "unchecked" })
			List<Agency> list = query.getResultList();
		
			return list;
		}
		
	}