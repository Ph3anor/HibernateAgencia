package dao;

import java.util.List;

import objects.Agency;

public interface AgencyDAO {
	
	public void include(Agency agency);
	public Agency searchForId(int id);
	public List<Agency> searchForBoss(String manager);
	public void delete(Agency result);
	public void edit(Agency agency);

}
		