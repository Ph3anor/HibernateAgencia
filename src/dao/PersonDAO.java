package dao;

import java.util.Date;
import java.util.List;

import objects.Person;

public interface PersonDAO {
	
	public void include(Person person);
	
	public Person searchForId(int id);
	public List<Person> searchForBirthday(Date birthday_ini, Date birthday_end);
	
	public void edit(Person person);
	public void delete(Person result);
}
