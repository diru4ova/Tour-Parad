package ua.com.parad.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class City {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	
	
	
	public City(String name) {
		super();
		this.name = name;
	}

	@Enumerated
	private Region region;
	
	@OneToMany(mappedBy="city")
	private List <Agency> agencies;
	
	@OneToMany(mappedBy="city")
	private List <Operator> operators;
	
	@OneToMany(mappedBy="city")
	private List <Filial> filials;
	
	@OneToMany(mappedBy="city")
	private List <Tourist> tourists;
	
	public City() {
		// TODO Auto-generated constructor stub
	}

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

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public List<Agency> getAgencies() {
		return agencies;
	}

	public void setAgencies(List<Agency> agencies) {
		this.agencies = agencies;
	}

	public List<Operator> getOperators() {
		return operators;
	}

	public void setOperators(List<Operator> operators) {
		this.operators = operators;
	}

	public List<Filial> getFilials() {
		return filials;
	}

	public void setFilials(List<Filial> filials) {
		this.filials = filials;
	}

	public List<Tourist> getTourists() {
		return tourists;
	}

	public void setTourists(List<Tourist> tourists) {
		this.tourists = tourists;
	}
	
	

}
