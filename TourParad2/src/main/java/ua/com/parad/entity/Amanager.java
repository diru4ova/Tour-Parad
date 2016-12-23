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
public class Amanager {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	private int phone_number;
	private String email;
	private String facebook_account;
	
	public Amanager() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Amanager(String name, String surname, int phone_number, String email, String facebook_account) {
		super();
		this.name = name;
		this.surname = surname;
		this.phone_number = phone_number;
		this.email = email;
		this.facebook_account = facebook_account;
	}



	@ManyToOne
	private Agency agency;
	
	@ManyToMany
	@JoinTable(name="aManager_tour",
	joinColumns=@JoinColumn (name="id_tour"),
	inverseJoinColumns = @JoinColumn(name="id_aManager"))
	private List <Tour> tours;
	
	@ManyToMany
	@JoinTable(name="aManager_chat",
	joinColumns = @JoinColumn(name="id_chat"),
	inverseJoinColumns = @JoinColumn(name="id_aManager"))
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

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebook_account() {
		return facebook_account;
	}

	public void setFacebook_account(String facebook_account) {
		this.facebook_account = facebook_account;
	}

	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	public List<Tour> getTours() {
		return tours;
	}

	public void setTours(List<Tour> tours) {
		this.tours = tours;
	}

	public List<Chat> getChats() {
		return chats;
	}

	public void setChats(List<Chat> chats) {
		this.chats = chats;
	}
	

	
	
}

