package dao;

import dao.AgencyJPADAO;
import dao.PersonJPADAO;

public interface DAOFactory {
	
	@SuppressWarnings("rawtypes")
	public static Object getInstanceOf(Class c) {
		if ( c.equals(PersonDAO.class) ) {
			return new PersonJPADAO();
		} else if ( c.equals(ContractDAO.class) ) {
			return new ContractJPADAO();
		} else if ( c.equals(AgencyDAO.class) ) {
			return new AgencyJPADAO();
		}
		return null;
	}
}
