package ua.com.parad.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Filial {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int number;
	private String adress;
	private int phone_number;
	
	
	public Filial() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Filial(int number, String adress, int phone_number) {
		super();
		this.number = number;
		this.adress = adress;
		this.phone_number = phone_number;
	}

	@ManyToOne
	private City city;
	
	@ManyToOne
	private Operator operator;
	
	@OneToMany(mappedBy="filial")
	private List <Omanager> oManagers;



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public List<Omanager> getoManagers() {
		return oManagers;
	}

	public void setoManagers(List<Omanager> oManagers) {
		this.oManagers = oManagers;
	}
	
	
	

}
