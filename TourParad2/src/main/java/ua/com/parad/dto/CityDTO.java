package ua.com.parad.dto;

public class CityDTO {
	
	private int id;
	private String name;
	
	public CityDTO() {
		// TODO Auto-generated constructor stub
	}

	public CityDTO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "CityDTO [id=" + id + ", name=" + name + "]";
	}
	
	

}
