package ua.com.parad.dto;

public class TouristDTO {
	
	private int id;
	private String name;
	private String email;
	private int phone;
	
	
	public TouristDTO() {
		// TODO Auto-generated constructor stub
	}


	public TouristDTO(int id, String name,  String email, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
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


	@Override
	public String toString() {
		return "TouristDTO [id=" + id + ", name=" + name +  ", email=" + email + ", phone="
				+ phone + "]";
	}
	
	

}
