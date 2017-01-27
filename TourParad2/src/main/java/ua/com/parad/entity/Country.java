package ua.com.parad.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Country {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Country(String name) {
		super();
		this.name = name;
	}



	@OneToMany(mappedBy = "country")
	private List<Tour> tours;
	
	@OneToMany(mappedBy = "country")
	private List<Chat> chats;
	
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

