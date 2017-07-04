package dao;


import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import dao.JPAAbstract;
import objects.Contract;
import objects.Person;

public class PersonJPADAO  extends JPAAbstract<Person> implements PersonDAO {
	
	@Override
	public String getEntityName() {
		return Person.class.getSimpleName();
	}

	@Override
	public List<Person> searchForBirthday(Date birthday_ini, Date birthday_end) {
		String jpql = "select c from " + getEntityName() + " c where c.birthday between :dini and :dend";
		Query query = super.getQuery(jpql);
		
		query.setParameter("dini", birthday_ini);
		query.setParameter("dend", birthday_end);
		

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Person> list = query.getResultList();
	
		return list;
	}


}
