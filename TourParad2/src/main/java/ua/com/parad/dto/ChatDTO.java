package ua.com.parad.dto;

public class ChatDTO {
	
	private int id;
	private String theme;
	
	public ChatDTO() {
		// TODO Auto-generated constructor stub
	}

	public ChatDTO(int id, String theme) {
		super();
		this.id = id;
		this.theme = theme;
	}

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

	@Override
	public String toString() {
		return "ChatDTO [id=" + id + ", theme=" + theme + "]";
	}
	
	

}
