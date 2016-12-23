package ua.com.parad.dto;

public class AgencyDTO {
	
	private int id;
	private String name;
	private int phone_number;
	private String email;
	
	public AgencyDTO() {
		// TODO Auto-generated constructor stub
	}
		
	
	public AgencyDTO(int id, String name, int phone_number, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phone_number = phone_number;
		this.email = email;
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
	@Override
	public String toString() {
		return "AgencyDTO [id=" + id + ", name=" + name + ", phone_number=" + phone_number + ", email=" + email + "]";
	}
	
	
	

}
