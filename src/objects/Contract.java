package objects;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import dao.E;

@Entity
public class Contract implements E{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ OneToOne(cascade=CascadeType.PERSIST)
	private Person manager;
	@ OneToOne(cascade=CascadeType.PERSIST)
	private Person worker;
	private Date start;
	private Date end;
	private String clauses;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Agency agency;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Person getManager() {
		return manager;
	}
	public void setManager(Person manager) {
		this.manager = manager;
	}
	public Person getWorker() {
		return worker;
	}
	public void setWorker(Person worker) {
		this.worker = worker;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public String getClauses() {
		return clauses;
	}
	public void setClauses(String clauses) {
		this.clauses = clauses;
	}
	public Agency getAgency() {
		return agency;
	}
	public void setAgency(Agency agency) {
		this.agency = agency;
	}
	@Override
	public String toString() {
		return "Contract [id=" + id + ", manager=" + manager + ", worker=" + worker + ", start=" + start + ", end="
				+ end + ", clauses=" + clauses + ", agency=" + agency + "]";
	}
	
	
}


