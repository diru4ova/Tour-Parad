package ua.com.parad.dto;

public class FilialDTO {
	
	private int id;
	private int number;
	private String adress;
	private int phone_number;
	
	public FilialDTO() {
		// TODO Auto-generated constructor stub
	}

	public FilialDTO(int id, int number, String adress, int phone_number) {
		super();
		this.id = id;
		this.number = number;
		this.adress = adress;
		this.phone_number = phone_number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		return "FilialDTO [id=" + id + ", number=" + number + ", adress=" + adress + ", phone_number=" + phone_number
				+ "]";
	}
	
	

}
