package ua.com.parad.entity;

import java.sql.Date;
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
public class Chat {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String theme;
	private String text;
	private String shortText;
	private Date date;
	
	public Chat() {
		// TODO Auto-generated constructor stub
	}

	public Chat(String theme, String text, String shortText, Date date) {
		super();
		this.theme = theme;
		this.text = text;
		this.shortText = shortText;
		this.date = date;
	}
	
	
	

	@ManyToOne
	private Country country;
	
	@ManyToMany
	@JoinTable(name="tourist_chat",
	joinColumns = @JoinColumn(name="id_tourist"),
	inverseJoinColumns = @JoinColumn(name="id_chat"))
	private List <Tourist> tourists;
	
	@ManyToMany
	@JoinTable(name="aManager_chat",
	joinColumns = @JoinColumn(name="id_aManager"),
	inverseJoinColumns = @JoinColumn(name="id_chat"))
	private List <Amanager> aManagers;
	
	
	@ManyToMany
	@JoinTable(name="oManager_chat",
	joinColumns = @JoinColumn(name="id_oManager"),
	inverseJoinColumns = @JoinColumn(name="id_chat"))
	private List <Omanager> oManagers;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	public String getShortText() {
		return shortText;
	}

	public void setShortText(String shortText) {
		this.shortText = shortText;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<Tourist> getTourists() {
		return tourists;
	}

	public void setTourists(List<Tourist> tourists) {
		this.tourists = tourists;
	}

	public List<Amanager> getaManagers() {
		return aManagers;
	}

	public void setaManagers(List<Amanager> aManagers) {
		this.aManagers = aManagers;
	}

	public List<Omanager> getoManagers() {
		return oManagers;
	}

	public void setoManagers(List<Omanager> oManagers) {
		this.oManagers = oManagers;
	}
	
	
	
	
	
	

}
