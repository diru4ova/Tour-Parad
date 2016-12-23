package ua.com.parad.dto;

public class OmanagerDTO {
	
	private int id;
	private String name;
	private String surname;
	private String duty;
	
	public OmanagerDTO() {
		// TODO Auto-generated constructor stub
	}

	public OmanagerDTO(int id, String name, String surname, String duty) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.duty = duty;
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

	@Override
	public String toString() {
		return "OmanagerDTO [id=" + id + ", name=" + name + ", surname=" + surname + ", duty=" + duty + "]";
	}
	
	

}
