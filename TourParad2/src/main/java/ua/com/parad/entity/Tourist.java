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


@Entity
public class Tourist {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	private String email;
	private int phone;
	private String password;
	
	public Tourist() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Tourist(String name, String surname, String email, int phone, String facebook_account, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
	}



	@ManyToOne
	private City city;
	
	@ManyToMany
	@JoinTable(name="tourist_tour",
	joinColumns = @JoinColumn(name="id_tour"),
	inverseJoinColumns = @JoinColumn(name="id_tourist"))
	private List <Tour> tours;
	
	@ManyToMany
	@JoinTable(name="tourist_chat",
	joinColumns = @JoinColumn(name="id_chat"),
	inverseJoinColumns = @JoinColumn(name="id_tourist"))
	private List <Chat> chats;

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public List<Tour> getTours() {
		return tours;
	}

	public void setTour(List<Tour> tours) {
		this.tours = tours;
	}

	public List<Chat> getChats() {
		return chats;
	}

	public void setChats(List<Chat> chats) {
		this.chats = chats;
	}
	
	

}
