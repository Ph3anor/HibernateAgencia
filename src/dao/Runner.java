package dao;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import objects.Agency;
import objects.Contract;
import objects.Person;

public class Runner {
	
	public static void main(String[] args) throws ParseException {
		Person p = new Person();
		DateFormat formatD = new SimpleDateFormat("dd/MM/YYYY");
		p.setName("Leo");
		p.setCpf("666666666666");
		p.setRg("5555555");
		p.setFather("Jose");
		p.setMother("Denise");
		
		
		p.setBirthday((Date) formatD.parse("24/11/2010"));
		
		Person p2 = new Person();
		p2.setName("Leo");
		p2.setCpf("666666666666");
		p2.setRg("5555555");
		p2.setFather("Jose");
		p2.setMother("Denise");
		p2.setBirthday((Date) formatD.parse("11/11/2011"));
		DateFormat formatH = new SimpleDateFormat("HH:mm:ss");
		List<Contract> list  = new ArrayList<Contract>();
		Contract c = new Contract();
		c.setManager(p);
		c.setClauses("Freelance");
		c.setEnd(formatH.parse("17:25:00")); 
		c.setStart(formatH.parse("13:00:00"));
		c.setWorker(p2);
		
		Contract c2 = new Contract();
		c2.setManager(p);
		c2.setClauses("bjvvjf");
		c2.setEnd(formatD.parse("18/09/2010"));
		c2.setStart(formatD.parse("15/04/2012"));
		c2.setWorker(p);
		
		Agency a = new Agency();
		a.setManager("John");
		a.addContract(c);
		a.addContract(c2);
		
//		AgencyJPADAO agencyDAO = (AgencyJPADAO) DAOFactory.getInstanceOf(AgencyDAO.class);
//		PersonJPADAO PersonDAO = (PersonJPADAO) DAOFactory.getInstanceOf(PersonDAO.class);
//		List<Agency> lst = agencyDAO.searchForBoss("John");
//		System.out.println(lst);
		
		
//		ContractJPADAO contractDAO = (ContractJPADAO) DAOFactory.getInstanceOf(ContractDAO.class);
//		List<Contract> lst = contractDAO.searchForManager("Leo");
//		System.out.println(lst.size());
		
		
		
		PersonJPADAO PersonDAO = (PersonJPADAO) DAOFactory.getInstanceOf(PersonDAO.class);
		Date ini = p.getBirthday();
		System.out.println(ini);
		Date end = p2.getBirthday();
		System.out.println(end);
		List<Person> gravado = PersonDAO.searchForBirthday(ini, end);
//		agencyDAO.include(a);
//		Date ini = 10-10-2010;
//		List<Person> persons = PersonDAO.searchForBirthday(ini, end);
		System.out.println(gravado);
//		for (Person person : persons) {
//			System.out.println(person);
//		}
	}
}