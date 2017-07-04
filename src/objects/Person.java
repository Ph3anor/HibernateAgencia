package objects;

import java.util.Date;
import java.text.DateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import dao.E;
@Entity
public class Person implements E {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String rg;
	private String cpf;
	@Column(name="mother_name")
	private String mother;
	@Column(name="father_name")
	private String father;
	private String name;
	@Temporal(TemporalType.DATE)
	private Date birthday;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	
	@Override
	public String toString() {
		return "Person [rg=" + rg + ", cpf=" + cpf + ", mother=" + mother + ", father=" + father + ", id=" + id
				+ ", name=" + name + ", birthday=" + birthday + "]";
	}
	public void setBirthday(DateFormat formatD, String string) {
		// TODO Auto-generated method stub
		
	}

}
