package objects;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import dao.E;
import objects.Contract;
@Entity
public class Agency implements E{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String description;
	private String manager;
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="agency")
	private List<Contract> contracts = new ArrayList<Contract>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescribe(String description) {
		this.description = description;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	public  void addContract(Contract c) {
		c.setAgency(this);
		this.contracts.add(c);
	}
	
}
