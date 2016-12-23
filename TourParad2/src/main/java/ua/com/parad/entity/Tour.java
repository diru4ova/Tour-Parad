package ua.com.parad.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Tour {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String type;
	private String date;
	private int duration;
	private int price;
	private String route;
	private String description;
	
	public Tour() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Tour(String name, String type, String date, int duration, int price, String route, String description) {
		super();
		this.name = name;
		this.type = type;
		this.date = date;
		this.duration = duration;
		this.price = price;
		this.route = route;
		this.description = description;
	}



	@ManyToOne
	private Agency agency;
	
	@OneToMany(mappedBy="tour")
	private List <Country> countries;
	
	@ManyToMany
	@JoinTable(name="aManager_tour",
	joinColumns = @JoinColumn(name="id_aManager"),
	inverseJoinColumns = @JoinColumn(name="id_tour"))
	private List <Amanager> aManagers;
	
	@ManyToMany
	@JoinTable(name="tourist_tour",
	joinColumns = @JoinColumn(name="id_tourist"),
	inverseJoinColumns = @JoinColumn(name="id_tour"))
	private List <Tourist> tourists;

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



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	public List<Amanager> getaManagers() {
		return aManagers;
	}

	public void setaManagers(List<Amanager> aManagers) {
		this.aManagers = aManagers;
	}

	public List<Tourist> getTourists() {
		return tourists;
	}

	public void setTourists(List<Tourist> tourists) {
		this.tourists = tourists;
	}
	
	
	
	
	
}

