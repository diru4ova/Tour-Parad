package ua.com.parad.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


@Entity
public class Tourist implements UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	private String email;
	private int phone;
	private String password;
	
	@Enumerated
	private Role role;
	
	
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
	
	
	public Role getRole() {
		return role;
	}



	public void setRole(Role role) {
		this.role = role;
	}



	public void setTours(List<Tour> tours) {
		this.tours = tours;
	}



	



	@Override
	public String toString() {
		return "Tourist [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", phone=" + phone
				+ ", password=" + password + ", role=" + role + ", city=" + city + ", tours=" + tours + ", chats="
				+ chats + "]";
	}


	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(role.name()));
		return authorities;
	}



	public String getUsername() {
		// TODO Auto-generated method stub
		return String.valueOf(id);
	}



	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}



	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}



	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}



	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}
