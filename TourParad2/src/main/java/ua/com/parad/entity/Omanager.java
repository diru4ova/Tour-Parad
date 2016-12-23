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
public class Omanager {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	private String duty;
	
	public Omanager() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Omanager(String name, String surname, String duty) {
		super();
		this.name = name;
		this.surname = surname;
		this.duty = duty;
	}





	@ManyToOne
	private Filial filial;
	
	@ManyToMany
	@JoinTable(name="oManager_chat",
	joinColumns = @JoinColumn(name="id_chat"),
	inverseJoinColumns = @JoinColumn(name="id_oManager"))
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

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public List<Chat> getChats() {
		return chats;
	}

	public void setChats(List<Chat> chats) {
		this.chats = chats;
	}
	

}
