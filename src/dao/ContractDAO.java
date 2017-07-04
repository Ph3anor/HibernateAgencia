package dao;

import java.util.List;

import objects.Contract;
import objects.Person;

public interface ContractDAO {
	public void include(Contract contract);
	
	public Contract searchForId(int id);
	public List<Contract> searchForManager(String name);
	
	public void delete(Contract result);
	public void edit(Contract contract);

}
